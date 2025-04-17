package ca.umontreal.geodes.dsmcompare.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.eclipse.emf.ecore.resource.Resource;

public class ResourceIOWrapper < T > extends ResourceIO implements Serializable {
	  //T = Resource
	  ResourceIOWrapper() {
	    super();
	  }
	  ResourceIOWrapper(T s) {
	    super(s);
	  }

	  private void writeObject(ObjectOutputStream out) throws IOException {
	    // not required the default write object
	    // ----> out.defaultWriteObject();
	    out.writeObject(super.getResource());
	  }

	  private void readObject(ObjectInputStream in ) throws IOException {
	    // not required the default read object
	    // ----> in.defaultReadObject();
	    try {
	      super.setResource((T) in .readObject());
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	  }

	  public void WriteObjectToFile(T rsourceDSMDiff, String DSMDiffPath) {
	    try {
	      FileOutputStream fo = new FileOutputStream(DSMDiffPath); //"c:\\test.ser");
	      ObjectOutputStream os = new ObjectOutputStream(fo);
	      os.writeObject(new ResourceIOWrapper < T > (rsourceDSMDiff));
	      fo.close();

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

	  public T ReadObjectFromFile(String DSMDiffPath) {
	    try {
	      FileInputStream fi = new FileInputStream(DSMDiffPath); //"c:\\test.ser");
	      ObjectInputStream in = new ObjectInputStream(fi);
	      ResourceIOWrapper < T > mw = (ResourceIOWrapper < T > ) in .readObject();
	      fi.close();
	      return (T) mw.getResource();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	    return null;
	  }
	}
