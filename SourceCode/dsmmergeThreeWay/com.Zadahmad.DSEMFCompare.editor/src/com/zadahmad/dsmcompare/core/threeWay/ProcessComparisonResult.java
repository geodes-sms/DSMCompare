package com.zadahmad.dsmcompare.core.threeWay;

/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

import com.google.common.collect.Iterables;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.output.TeeOutputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Conflict;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import java.lang.*;
/**
 * This class exposes methods to serialize a "human-readable" form of the comparison model onto a given
 * stream.
 * This cade changed from the base class of IntentPrettyPrinter
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 * By 
 * 
 * @author <a href="mailto:zadahmad@gmail.com">Manouchehr Zadahmad Jafarlou</a>
 */
//@SuppressWarnings("nls")
public final class ProcessComparisonResult {

	static Comparison comparison;
	/**
	 * Constant for quotes.
	 */
	//private static final String QUOTE = "\"";

	/**
	 * Constant for whitespace.
	 */
	private static final String WHITESPACE = " ";

	/**
	 * Constant for separator.
	 */
	private static final String SEP = " |";

	/** This is the max length of the columns we display for the Match. */
	private static final int COLUMN_LENGTH = 40;

	/**
	 * Hides default constructor.
	 */
	public  ProcessComparisonResult() {
		// No need to construct an instance of this.
	}

	/**
	 * Prints the whole comparison on the given stream (might be {@code stream} ).
	 * 
	 * @param comparison
	 *            The comparison we are to print on {@code stream}.
	 * @param stream
	 *            The {@link PrintStream} on which we should print this comparison model.
	 * @throws FileNotFoundException 
	 */
	private static PrintStream initStream(String resultFilePath) throws FileNotFoundException {
		OutputStream fileOutputStream=new FileOutputStream(resultFilePath);
		PrintStream stream = null;//=new PrintStream(fileOutputStream);
		
		try {
			Runtime rt=Runtime.getRuntime();
			rt.addShutdownHook(new Thread(() -> {
		        try {
		        	fileOutputStream.flush();
		        }
		        catch (Throwable t) {
		            // Ignore
		        }
		    }, "Shutdown hook Thread flushing " + resultFilePath));
		    //we will want to print in standard "System.out" and in "file"
		    TeeOutputStream myOut=new TeeOutputStream(System.out, fileOutputStream);
		    stream = new PrintStream(myOut, true); //true - auto-flush after println
		    System.setOut(stream);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return stream;
	}
	
	public static  ComparisonResult processThreeWayComparison(Comparison comparison3Way, String resultFilePath) throws FileNotFoundException {
		PrintStream stream = initStream(resultFilePath);
		comparison = comparison3Way;
		
		ComparisonResult	comparisonResult= new ComparisonResult(); 		
		comparisonResult.fineDiffReferences	= new ArrayList<FineDiffReference>();
		comparisonResult.fineDiffAttributes	= new ArrayList<FineDiffAttribute>();
		Integer 
		matchesCount=comparison.getMatches().size(), 
		diffsCount=comparison.getDifferences().size(), 
		conflictsCount=comparison.getConflicts().size();
				
		stream.println("Matches count 	:	" + matchesCount.toString());
		stream.println("Diffs count 	:	" +  diffsCount.toString());
		stream.println("Conflicts count :	" + conflictsCount.toString());
		
		
		for (MatchResource res : comparison.getMatchedResources()) {
			stream.println("Matched resources :");
			stream.println("Left = " + res.getLeftURI());
			stream.println("Right = " + res.getRightURI());
			stream.println("origin = " + res.getOriginURI());
		}
		stream.println();
		printMatch(comparison, stream);
		stream.println();
		processDifferences(comparison, stream, comparisonResult);
		return comparisonResult;
	}

	/**
	 * Prints all the Match elements contained by the given {@code comparison}. Each Match will be displayed
	 * on its own line.
	 * <p>
	 * For example, if the left model has two packages "package1" and "package2", but the right has "package1"
	 * and "package3", what we will display here depends on the Match : if "left.package1" is matched with
	 * "right.package1", but "package2" and "package3" did not match, this will print <code><pre>
	 * | package1 | package1 |
	 * | package2 |          |
	 * |          | package3 |
	 * </pre></code> On the contrary, if "package2" and "package3" did match, we will display <code><pre>
	 * | package1 | package1 |
	 * | package2 | package3 |
	 * </pre></code>
	 * </p>
	 * 
	 * @param comparison
	 *            The comparison which Matched elements we are to print on {@code stream}.
	 * @param stream
	 *            The {@link PrintStream} on which we should print the matched elements of this comparison.
	 */
	public static  void printMatch(Comparison comparison, PrintStream stream) {
		final String separator = "+----------------------------------------+----------------------------------------+----------------------------------------+"; //$NON-NLS-1$
		final String leftLabel = "Left";
		final String rightLabel = "Right";
		final String originLabel = "Origin";
		stream.println(separator);
		stream.println('|' + formatHeader(leftLabel) + '|' + formatHeader(rightLabel) + '|'
				+ formatHeader(originLabel) + '|');
		stream.println(separator);
		for (Match match : comparison.getMatches()) {
			printMatch(match, stream);
		}
		stream.println(separator);
	}

	/**
	 * Prints all differences detected for the given {@code comparison} on the given {@code stream}.
	 * 
	 * @param comparison
	 *            The comparison which differences we are to print on {@code stream}.
	 * @param stream
	 *            The {@link PrintStream} on which we should print these differences.
	 */
	public static  void processDifferences(Comparison comparison, PrintStream stream, ComparisonResult	comparisonResult) {
		final Iterable<ReferenceChange> refChanges = Iterables.filter(comparison.getDifferences(),
				ReferenceChange.class);
		stream.println("REFERENCE CHANGES");
		for (Diff diff : refChanges) {
			processDiff(diff, stream, comparisonResult);
		}
		stream.println();

		stream.println("ATTRIBUTE CHANGES");
		final Iterable<AttributeChange> attChanges = Iterables.filter(comparison.getDifferences(),
				AttributeChange.class);
		for (Diff diff : attChanges) {
			processDiff(diff, stream, comparisonResult);
		}
		stream.println();

		stream.println("CONFLICTS");
		for (Conflict conflict : comparison.getConflicts()) {
			printConflict(conflict, stream, comparisonResult);
		}
	}
	
	
	public static  void printDifferences(EList<Diff> diffs, PrintStream stream, ComparisonResult	comparisonResult) {
		final Iterable<ReferenceChange> refChanges = Iterables.filter(diffs, ReferenceChange.class);
		stream.println("Diff size: " + diffs.size());
		stream.println("--------------------------------------");
		stream.println("REFERENCE CHANGES:");
		for (Diff diff : refChanges) {
			processDiff(diff, stream, comparisonResult);
		}
		stream.println("--------------------------------------");

		stream.println("ATTRIBUTE CHANGES:");
		final Iterable<AttributeChange> attChanges = Iterables.filter(diffs, AttributeChange.class);
		for (Diff diff : attChanges) {
			processDiff(diff, stream, comparisonResult);
		}
		stream.println("--------------------------------------");
/*
		stream.println("CONFLICTS");
		for (Conflict conflict : comparison.getConflicts()) {
			printConflict(conflict, stream);
		}*/
	}

	/**
	 * Prints the given {@link Conflict} on the given {@code stream}.
	 * 
	 * @param conflict
	 *            The conflict we need to print on {@code stream}.
	 * @param stream
	 *            The {@link PrintStream} on which we should print this conflict.
	 */
	private static  void printConflict(Conflict conflict, PrintStream stream, ComparisonResult	comparisonResult) {
		stream.println(conflict.getKind() + " conflict:");
		final Iterable<ReferenceChange> refChanges = Iterables.filter(conflict.getDifferences(),
				ReferenceChange.class);
		for (Diff diff : refChanges) {
			stream.print("\t");
			processDiff(diff, stream, comparisonResult);
		}
		final Iterable<AttributeChange> attChanges = Iterables.filter(conflict.getDifferences(),
				AttributeChange.class);
		for (Diff diff : attChanges) {
			stream.print("\t");
			processDiff(diff, stream, comparisonResult);
		}

	}

	/**
	 * Prints the given {@link Diff difference} on the given {@code stream}.
	 * 
	 * @param diff
	 *            The difference we are to print on {@code stream}.
	 * @param stream
	 *            The {@link PrintStream} on which we should print this difference.
	 */
	private static  void processDiff(Diff diff, PrintStream stream, ComparisonResult	comparisonResult) {
		FineDiffReference 	fineDiffReference	= new FineDiffReference();
		FineDiffAttribute 	fineDiffAttribute	= new FineDiffAttribute();
		FineDiffChangeKind 	fineDiffChangeKind;
		

		if (diff instanceof ReferenceChange) {
			final ReferenceChange refChange = (ReferenceChange)diff;			
			final String valueName;
			if (refChange.getValue() != null) {
				valueName = elementToReadableString(refChange.getValue());
			} else {
				valueName = refChange.getValue().toString();
			}
			String change = "";
			if (diff.getSource() == DifferenceSource.RIGHT) {
				change = "remotely(RIGHT) ";
				fineDiffChangeKind= FineDiffChangeKind.RemotelyRIGHT;
			}
			if (diff.getKind() == DifferenceKind.ADD) {
				change += "added to";
				fineDiffChangeKind= FineDiffChangeKind.AddedTo;
			} else if (diff.getKind() == DifferenceKind.DELETE) {
				change += "deleted from";
				fineDiffChangeKind= FineDiffChangeKind.DeletedFrom;
			} else if (diff.getKind() == DifferenceKind.CHANGE) {
				change += "changed from";
				fineDiffChangeKind= FineDiffChangeKind.ChangedFrom;
			} else {
				change += "moved from";
				fineDiffChangeKind= FineDiffChangeKind.MovedFrom;
			}
			final String objectName;
			if (refChange.getMatch().getLeft() != null) {
				objectName = elementToReadableString(refChange.getMatch().getLeft());
			} else if (refChange.getMatch().getRight() != null) {
				objectName = elementToReadableString(refChange.getMatch().getRight());
			} else if (refChange.getMatch().getOrigin() != null) {
				objectName = elementToReadableString(refChange.getMatch().getOrigin());
			} else {
				objectName = "";
			}
			if (valueName != null) {
				fineDiffReference.diff				= 	diff;
				fineDiffReference.referenceChangeDiff		= 	refChange;
				fineDiffReference.diffKind			= 	diff.getKind();
				fineDiffReference.changeKind		= 	fineDiffChangeKind;
				fineDiffReference.valueName			= 	valueName;
				fineDiffReference.value				=	refChange.getValue();
				fineDiffReference.originValueMatch	=	null;
				if(fineDiffReference.value != null) {
					try {
					fineDiffReference.originValueMatch	=	comparison.getMatch(fineDiffReference.value).getOrigin();
					}
					catch(Exception ex) {
						stream.println("Couldn't set fineDiffReference.originValueMatch :" + ex.toString());
						System.out.println("Couldn't set fineDiffReference.originValueMatch :" + ex.toString());
					}
					try {
					fineDiffReference.leftValueMatch	=	comparison.getMatch(fineDiffReference.value).getLeft();
					}
					catch(Exception ex) {
						stream.println("Couldn't set fineDiffReference.leftValueMatch :" + ex.toString());
						System.out.println("Couldn't set fineDiffReference.leftValueMatch :" + ex.toString());
					}
					try {
					fineDiffReference.rightValueMatch	=	comparison.getMatch(fineDiffReference.value).getRight();
					}
					catch(Exception ex) {
						stream.println("Couldn't set fineDiffReference.rightValueMatch :" + ex.toString());
						System.out.println("Couldn't set fineDiffReference.rightValueMatch :" + ex.toString());
					}
					
				}
				fineDiffReference.objectName		= 	objectName;
				fineDiffReference.referenceName		=	refChange.getReference().getName();
				fineDiffReference.reference			=	refChange.getReference();
				fineDiffReference.leftContainerMatch		= 	refChange.getMatch().getLeft();
				fineDiffReference.rightContainerMatch		= 	refChange.getMatch().getRight();
				fineDiffReference.originContainerMatch		= 	refChange.getMatch().getOrigin();	
				
				if(fineDiffReference.changeKind == FineDiffChangeKind.MovedFrom) // fineDiffChangeKind
				{
					fineDiffReference.originContainerMatchMovedFrom		= 	fineDiffReference.originValueMatch.eContainer();
					try {
						fineDiffReference.leftContainerMatchMovedFrom		= 	comparison.getMatch(fineDiffReference.originContainerMatchMovedFrom	).getLeft();
					}
					catch(Exception ex) {
						stream.println("Couldn't set :" + fineDiffReference.leftContainerMatchMovedFrom + ex.toString());
						System.out.println("Couldn't set :" + fineDiffReference.leftContainerMatchMovedFrom + ex.toString());
					}
					try {
						fineDiffReference.rightContainerMatchMovedFrom		= 	comparison.getMatch(fineDiffReference.originContainerMatchMovedFrom	).getRight();
					}
					catch(Exception ex) {
						stream.println("Couldn't set fineDiffReference.rightContainerMatchMovedFrom :" + ex.toString());
						System.out.println("Couldn't set fineDiffReference.leftContainerMatchMovedFrom :" + ex.toString());
					}
				}
				
				
				if(fineDiffReference.reference.isContainment()) {
					fineDiffReference.diffReferenceChangeType = DiffReferenceChangeType.ClassChange; 
					fineDiffReference.fineDiffType = FineDiffType.ClassDiff;
					Match match=(Match) (fineDiffReference.leftValueMatch=comparison.getMatch(fineDiffReference.value));
					if(match!=null) {
						fineDiffReference.leftValueMatch=comparison.getMatch(fineDiffReference.value).getLeft();
						fineDiffReference.rightValueMatch=comparison.getMatch(fineDiffReference.value).getRight();
					}					
				}
				else {
					fineDiffReference.diffReferenceChangeType = DiffReferenceChangeType.ReferenceChange;
					fineDiffReference.fineDiffType = FineDiffType.ReferenceDiff;
				}
					
				comparisonResult.fineDiffReferences.add(fineDiffReference);				
				
				String textToPrint="\n [" + diff.getKind() + "] " + "value " + valueName + " has been " + change
						+ " reference " + refChange.getReference().getName() + "\n of object " + objectName;
				stream.println(textToPrint);
					
			}
		}		
		else if (diff instanceof AttributeChange) {
			final AttributeChange attChange = (AttributeChange)diff;
			String valueName = "null";
			if (attChange.getValue() != null) {
				valueName = attChange.getValue().toString();
			}
			String change = "";
			if (diff.getSource() == DifferenceSource.RIGHT) {
				change = "remotely(RIGHT) ";
				fineDiffChangeKind= FineDiffChangeKind.RemotelyRIGHT;
			}
			if (diff.getKind() == DifferenceKind.ADD) {
				change += "added to";
				fineDiffChangeKind= FineDiffChangeKind.AddedTo;
			} else if (diff.getKind() == DifferenceKind.DELETE) {
				change += "deleted from";
				fineDiffChangeKind= FineDiffChangeKind.DeletedFrom;
			} else if (diff.getKind() == DifferenceKind.CHANGE) {
				change += "changed from";
				fineDiffChangeKind= FineDiffChangeKind.ChangedFrom;
			} else {
				change += "moved from";
				fineDiffChangeKind= FineDiffChangeKind.MovedFrom;
			}
			final String objectName;
			if (attChange.getMatch().getLeft() != null) {
				objectName = elementToReadableString(attChange.getMatch().getLeft());
			} else if (attChange.getMatch().getRight() != null) {
				objectName = elementToReadableString(attChange.getMatch().getRight());
			} else if (attChange.getMatch().getOrigin() != null) {
				objectName = elementToReadableString(attChange.getMatch().getOrigin());
			} else {
				objectName = "";
			}

			fineDiffAttribute.diff					= 	diff;
			fineDiffAttribute.attributeChangeDiff	= 	attChange;
			fineDiffAttribute.diffKind				= 	diff.getKind();
			fineDiffAttribute.changeKind			= 	fineDiffChangeKind;
			fineDiffAttribute.attributeName			= 	attChange.getAttribute().getName();
			fineDiffAttribute.valueName				= 	valueName;
			fineDiffAttribute.value					=	attChange.getValue();
			fineDiffAttribute.objectName			= 	objectName;
			fineDiffAttribute.leftContainerMatch	= 	attChange.getMatch().getLeft();
			fineDiffAttribute.rightContainerMatch	= 	attChange.getMatch().getRight();
			fineDiffAttribute.originContainerMatch	= 	attChange.getMatch().getOrigin();	
			fineDiffAttribute.fineDiffType = FineDiffType.AttributeDiff;
			comparisonResult.fineDiffAttributes.add(fineDiffAttribute);				

			String textToPrint="\n value " + valueName + " has been " + change + " attribute "
					+ attChange.getAttribute().getName() + "\n of object " + objectName;
			stream.println(textToPrint);				
		}
	}

	/**
	 * Prints the given {@link Match} on the given {@code stream}.
	 * 
	 * @param match
	 *            The match we are to print on {@code stream}.
	 * @param stream
	 *            The {@link PrintStream} on which we should print this difference.
	 * @see #printMatch(Comparison, PrintStream) A description on how we format the match.
	 */
	private static  void printMatch(Match match, PrintStream stream) {
		String leftName = null;
		String rightName = null;

		final EObject left = match.getLeft();
		final EObject right = match.getRight();

		if (left != null) {
			leftName = formatName(left);
		} else {
			int level = 0;
			EObject currentMatch = match;
			while (currentMatch instanceof Match && ((Match)currentMatch).getLeft() == null) {
				currentMatch = currentMatch.eContainer();
			}
			while (currentMatch instanceof Match && ((Match)currentMatch).getLeft() != null) {
				level++;
				currentMatch = currentMatch.eContainer();
			}
			leftName = getEmptyLine(level);
		}

		if (right != null) {
			rightName = formatName(right);
		} else {
			int level = 0;
			EObject currentMatch = match;
			while (currentMatch instanceof Match && ((Match)currentMatch).getRight() == null) {
				currentMatch = currentMatch.eContainer();
			}
			while (currentMatch instanceof Match && ((Match)currentMatch).getRight() != null) {
				level++;
				currentMatch = currentMatch.eContainer();
			}
			rightName = getEmptyLine(level);
		}
		if (leftName != null && rightName != null) {
			stream.println('|' + leftName + '|' + rightName + '|');
		}

		for (Match submatch : match.getSubmatches()) {
			printMatch(submatch, stream);
		}
	}

	/**
	 * Formats the given header so that it spans {@value #COLUMN_LENGTH} characters, centered between white
	 * spaces.
	 * 
	 * @param header
	 *            The header we are to format.
	 * @return The formatted header.
	 */
	private static  String formatHeader(String header) {
		int padding = (COLUMN_LENGTH - header.length()) / 2;
		char[] charsBefore = new char[padding];
		for (int i = 0; i < charsBefore.length; i++) {
			charsBefore[i] = ' ';
		}
		if ((header.length() & 1) == 1) {
			padding++;
		}
		final char[] charsAfter = new char[padding];
		for (int i = 0; i < charsAfter.length; i++) {
			charsAfter[i] = ' ';
		}
		return String.valueOf(charsBefore) + header + String.valueOf(charsAfter);
	}

	/**
	 * Formats the named of the given element by adding spaces before and after it so that it spans
	 * {@value #COLUMN_LENGTH} characters at most.
	 * 
	 * @param element
	 *            The element which name should be formatted.
	 * @return the formatted element's name.
	 */
	private static  String formatName(EObject element) {
		String name = elementToReadableString(element);
		if (name != null) {
			int level = 0;
			EObject current = element;
			while (current.eContainer() != null) {
				level++;
				current = current.eContainer();
			}

			char[] charsBefore = new char[1 + (level * 2)];
			charsBefore[0] = ' ';
			if (level > 0) {
				for (int i = 1; i < charsBefore.length - 2; i = i + 2) {
					charsBefore[i] = '|';
					charsBefore[i + 1] = ' ';
				}
				charsBefore[charsBefore.length - 2] = '|';
				charsBefore[charsBefore.length - 1] = '-';
			}

			int missingChars = COLUMN_LENGTH - name.length() - charsBefore.length;
			final char[] spacesAfter = new char[Math.max(0, missingChars)];
			Arrays.fill(spacesAfter, ' ');

			return String.valueOf(charsBefore) + name + String.valueOf(spacesAfter);
		}
		return null;
	}

	/**
	 * Returns an "empty line" which will only show pipes for previous levels.
	 * 
	 * @param level
	 *            The level of nesting that we should make visible through pipes on this line.
	 * @return A line that displays only pipes for a tree's {@code level}, and only that.
	 */
	private static  String getEmptyLine(int level) {
		char[] charsBefore = new char[1 + (level * 2)];
		charsBefore[0] = ' ';
		for (int i = 1; i < charsBefore.length; i = i + 2) {
			charsBefore[i] = '|';
			charsBefore[i + 1] = ' ';
		}

		int missingChars = COLUMN_LENGTH - charsBefore.length;
		final char[] spacesAfter = new char[Math.max(0, missingChars)];
		Arrays.fill(spacesAfter, ' ');

		return String.valueOf(charsBefore) + String.valueOf(spacesAfter);
	}

	/**
	 * Prints the given element in Sysout.
	 * 
	 * @param root
	 *            the element to print
	 */
	public static  void displayModel(EObject root) {
		displayModel(root, "");
	}

	/**
	 * Prints the given element in Sysout with the given tabulation level.
	 * 
	 * @param root
	 *            the element to print
	 * @param tab
	 *            the tabulation to prefix each line with
	 */
	public static  void displayModel(EObject root, String tab) {
		String s = elementToReadableString(root);
		if (s != null) {
			System.out.println(tab + "-" + s);
		}
		for (EObject content : root.eContents()) {
			if (root instanceof IntentDocument) {
				displayModel(content, tab);
			} else {
				displayModel(content, tab + SEP);
			}
		}
	}

	/**
	 * Prints the given {@link Comparison} in sysout.
	 * 
	 * @param comparison
	 *            the comparaison to print
	 */
	public static  void displayMatchModel(Comparison comparison) {
		for (Match root : comparison.getMatches()) {
			displayMatchModel(root, "");
		}
	}

	/**
	 * Prints the given {@link Comparison} in sysout with the given tabulation level.
	 * 
	 * @param root
	 *            the comparaison to print
	 * @param tab
	 *            the tabulation to prefix each line with
	 */
	private static  void displayMatchModel(Match root, String tab) {
		String matchString = matchToReadableString(root);
		if (matchString != null) {
			System.out.println(tab + "-" + matchString);
		}
		for (Match match : root.getSubmatches()) {
			if (root.getLeft() instanceof IntentDocument) {
				displayMatchModel(match, tab);
			} else {
				displayMatchModel(match, tab + SEP);
			}
		}
	}

	/**
	 * Returns a readable string from the given {@link Diff}.
	 * 
	 * @param diff
	 *            the {@link Diff} to print
	 * @return a readable string from the given {@link Diff}
	 */
	public static  String diffToReadableString(Diff diff) {
		String res = diff.getKind() + WHITESPACE;
		if (diff instanceof AttributeChange) {
			AttributeChange change = (AttributeChange)diff;
			res += change.getAttribute().getEContainingClass().getName() + "."
					+ change.getAttribute().getName() + WHITESPACE;
		} else if (diff instanceof ReferenceChange) {
			ReferenceChange change = (ReferenceChange)diff;
			res += change.getReference().getEContainingClass().getName() + "."
					+ change.getReference().getName() + WHITESPACE;
		}
		res += "\n" + diff + "\n";
		res += "based on " + matchToReadableString(diff.getMatch());
		return res;
	}

	/**
	 * Returns a readable string from the given {@link Match}.
	 * 
	 * @param match
	 *            the {@link Match} to print
	 * @return a readable string from the given {@link Match}
	 */
	private static  String matchToReadableString(Match match) {
		String res = null;
		String left = elementToReadableString(match.getLeft());
		String right = elementToReadableString(match.getRight());
		if (left != null && right != null) {
			res = left + " == " + right;
		}
		return res;
	}

	/**
	 * Returns a readable string from the given {@link EObject}.
	 * 
	 * @param element
	 *            the {@link EObject} to print
	 * @return a readable string from the given {@link EObject}
	 */
	public static  String elementToReadableString(EObject element) {
		String res = null;
		if (element == null) {
			res = "?";
		} else {
			res = element.eClass().getName();
			// String fragment = new IntentEqualityHelper().getURI(element).fragment();
			// if (fragment != null) {
			// res += "[" + fragment + "]";
			// }
		}
		//return element.getClass().getName();
		//System.out.println(element.getClass().getName());
		//System.out.println(element.toString());
		
		return element.toString();
		/*
		if (element instanceof Text) {
			res = QUOTE + ((Text)element).getData() + QUOTE;
		} else if (element instanceof IntentDocument || element instanceof Annotations) {
			res = null;
		} else if (element instanceof StructuralFeatureAffectation) {
			StructuralFeatureAffectation aff = (StructuralFeatureAffectation)element;
			res += element.eClass().getName() + " \"" + aff.getName() + QUOTE;
		}
		return res;
		*/
		
	}
	
}
