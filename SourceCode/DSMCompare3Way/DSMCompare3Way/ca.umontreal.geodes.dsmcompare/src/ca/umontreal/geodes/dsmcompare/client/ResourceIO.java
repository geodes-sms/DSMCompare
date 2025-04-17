package ca.umontreal.geodes.dsmcompare.client;

import org.eclipse.emf.ecore.resource.Resource;

public class ResourceIO<T> {
	//public Resource resource= null;
	//public String resourcePath="";
	//T = Resource
	public T resource= null;
	ResourceIO(){
		  }
	ResourceIO(T res){
		resource=res;
	  }
	public  T getResource() {
		return resource;
	}
	
	public  void setResource(T res) {
		resource=res;
	}
}
