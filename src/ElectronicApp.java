/**
 * 
 * @author Mert CACINA
 *
 */
public class ElectronicApp extends Asset {
	
	private String name;
	
	public ElectronicApp(int a, String c, String name){
		
		super(a,c);
		this.name=name;	
	}

	
	public String toString() {
		
		
		System.out.println(super.toString());
		
		return " + ElectronicApp [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
