package dsmcompare.mmextension.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import dsmcompare.mmextension.utils.EMFUtils.RefTrgtMM;
import dsmcompare.mmextension.utils.EMFUtils.SrcRefMM;
import dsmcompare.mmextension.utils.EMFUtils.SrcRefTrgtMM;

public class DijkstraSolverEDG extends DijkstraSolver {
	
    /**
     * The list of predecesors in the set of calculated paths
     */
	protected Map<EClass,SrcRefMM> predecessors= new HashMap<EClass,SrcRefMM>();

	public DijkstraSolverEDG(EPackage ePackage) {
		super(ePackage);
		// TODO Auto-generated constructor stub
	}
	
	
    public LinkedList<SrcRefMM> getPathEDG(EClass target) {
        LinkedList<SrcRefMM> path = new LinkedList<SrcRefMM>();
        EClass step = target;
        // check if a path exists
        SrcRefMM rt= predecessors.get(step);
        if ( rt == null) {
            return null;
        }
        path.add(rt);
        while (predecessors.get(step) != null) {
        	rt= predecessors.get(step);
            step = rt.source;
            path.add(rt);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }
	

    protected List<RefTrgtMM> getNeighborsRT(EClass node) {
        List<RefTrgtMM> neighbors = new ArrayList<RefTrgtMM>();
        for (EReference edge : edges) {
            if (edge.getEContainingClass().equals(node) && !isSettled((EClass) edge.getEType())) {
            	RefTrgtMM rt= new RefTrgtMM();
            	rt.eReference=edge;
            	rt.target=(EClass) edge.getEType();
                neighbors.add(rt);
            }
        }
        return neighbors;
    }
	
	@Override
    protected void findMinimalDistances(EClass node) {
    	List<RefTrgtMM> adjacentNodes = getNeighborsRT(node);
        for (RefTrgtMM refTrgtMM : adjacentNodes) {
            if (getShortestDistance(refTrgtMM.target) > getShortestDistance(node) + getDistance(node, refTrgtMM.target)) {
                distance.put(refTrgtMM.target, getShortestDistance(node) + getDistance(node, refTrgtMM.target));
                unSettledNodes.add(refTrgtMM.target);
                SrcRefMM rTemp= new SrcRefMM();
                rTemp.source=node;
                rTemp.eReference=refTrgtMM.eReference;
                predecessors.put(refTrgtMM.target,rTemp);
                
            }
        }

    }

}
