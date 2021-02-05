package mainPkg;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

//import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class dsCompare {

	public static void main(String[] args) {
		String v1Path = "R:/Thesis/wsEMFcompare/com.Zadahmad.DSEMFCompare.editor/model/Schema.xmi"; 
		String v2Path = "R:/Thesis/wsEMFcompare/com.Zadahmad.DSEMFCompare.editor/model/Schema2.xmi"; 
		String compResulFilePath= "R:/Thesis/wsEMFcompare/com.zadahmad.DSEMFCompare.editor/model/file.txt";

		File v1 = new File(v1Path);
		File v2 = new File(v2Path);
		File compResulFile=new File(compResulFilePath);
		
		dsCompare tc1 = new dsCompare();

		tc1.compare(v1, v2, compResulFile);

	}
	
	public void compare(File v1, File v2, File compResulFile) {
				
		URI uri1 = URI.createFileURI(v1.getPath()); 								  									
		URI uri2 = URI.createFileURI(v2.getPath());																				
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
		
		//resourceSet1.getPackageRegistry().put(RDBPackage.eNS_URI,RDBPackage.eINSTANCE);

		//resourceSet2.getPackageRegistry().put(RDBPackage.eNS_URI,RDBPackage.eINSTANCE);

		resourceSet1.getResource(uri1, true);
		resourceSet2.getResource(uri2, true);
		
		IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2, null);
		Comparison comparison = EMFCompare.builder().build().compare(scope);
		
		writeCompResultUsingIntentPrettyPrinter(comparison, compResulFile);
		
		dsCompareUI dsCU= new dsCompareUI();
		//dsCU.showUI(scope, comparison);
		
		//dsCU.showUI(resourceSet1, resourceSet2, null);
		dsCU.showUIPreComputed(resourceSet1, resourceSet2, null);
	}	
	
	void writeCompResultUsingIntentPrettyPrinter(Comparison comparison, File compResulFile)
	{
		
		FileOutputStream fileOutputStream=null;
		PrintStream printStream=null;
		try {
			fileOutputStream=new FileOutputStream(compResulFile);
			printStream=new PrintStream(fileOutputStream);
		
		
		IntentPrettyPrinter.printComparison(comparison, printStream);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fileOutputStream!=null){
					fileOutputStream.close();
				}
				if(printStream!=null){
					printStream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	String readfile(String filePath)
	{
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    return sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

}



//IntentPrettyPrinter pp= new IntentPrettyPrinter();		
//printDifferences printDiff printConflict elementToReadableString
//ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(resourceSet1, resourceSet2, null);
//AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
//CompareEditorInput input = new ComparisonEditorInput(new CompareConfiguration(), comparison, editingDomain, adapterFactory);
//CompareEditorInput input = new EMFCompareConfiguration(new CompareConfiguration(), comparison, editingDomain, adapterFactory);
//CompareEditorInput input = new EMFCompareConfiguration(new CompareConfiguration());

//CompareUI.openCompareDialog(input); // or CompareUI.openCompareEditor(input);

//List<Diff> differences = comparison.getDifferences();

//System.out.println(differences.size());		

// Let's merge every single diff
//IMerger.Registry mergerRegistry = new IMerger.RegistryImpl();
//IBatchMerger merger = new BatchMerger(mergerRegistry);
//merger.copyAllLeftToRight(differences, new BasicMonitor());

/*
ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(left, right, ancestor);
AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
CompareEditorInput input = new ComparisonEditorInput(new CompareConfiguration(), comparison, editingDomain, adapterFactory);

CompareUI.openCompareDialog(input); // or CompareUI.openCompareEditor(input);
*/

//writefile(v1.getPath());

//System.out.println( readfile(uri1.path()));
//System.out.println( readfile(uri2.path()));
//System.out.println(v1.canRead());


//import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

//import org.eclipse.emf.compare.domain.ICompareEditingDomain;
///import org.eclipse.emf.compare.domain.impl.EMFCompareEditingDomain;
//import org.eclipse.emf.compare.ide.ui.internal.configuration.EMFCompareConfiguration;
//org.eclipse.emf.compare.edit_4.3.1.201...
//import org.eclipse.emf.compare.ide.ui.internal.editor.ComparisonEditorInput;
//org.eclipse.emf.compare.ide.ui_4.4.1.201709090201.jar