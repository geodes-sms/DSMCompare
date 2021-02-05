package sample.PacmanGo.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;


import PacmanGoDiffMM.PacmanGoDiffMMFactory;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;
import PacmanGoDiffMM.Ghost;
import PacmanGoDiffMM.DiffGridNode;

import org.eclipse.sirius.diagram.DDiagram;


import sample.PacmanGo.design.service.DiagramServices;;

public class ExternalJavaAction1 implements IExternalJavaAction {

	public ExternalJavaAction1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject eObject : selections) {
			if(!(eObject instanceof Ghost)) {				
				return false;
			}
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		
		
		Ghost source = (Ghost) parameters.get("source");

		PacmanGoDiffMMFactory factory = PacmanGoDiffMMFactory.eINSTANCE;
		Ghost ghost = factory.createGhost();
		ghost.setId("newGhost");
		
		/*
		DiagramServices.getDiagramServices().createNode( mapping, modelElement, container, diagram);
		PacmanGoDiffMMDiagram  root = (PacmanGoDiffMMDiagram) source.eContainer();*/
		//root.getRelations().add(ghost);
	}


}
