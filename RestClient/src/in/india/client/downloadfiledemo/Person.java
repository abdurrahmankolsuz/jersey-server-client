package in.india.client.downloadfiledemo;

public class Person {
	  private String _name;
	  Byte[]  imageBuffer;

	  public Person() {
		
	}
	  public Person (String name, Byte [] imageBuffer) {
	    _name = name;
	    this.imageBuffer = imageBuffer;
	  }

	  public String getName() {
	    return _name;
	  }
	  
	  public Byte [] getImageBuffer() {
		  return this.imageBuffer;
	  }
	}