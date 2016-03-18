/**
 * 
 * @author Mert CACINA
 *
 */
public class ElectronicApp extends Asset {
	/**
	 * Global variables
	 */
	private String name;
	/**
	 * 
	 * @param a serial info of the asset 
	 * @param c category info of the asset
	 * @param name name info of the asset
	 */
	public ElectronicApp(int a, String c, String name){
		
		super(a,c);
		this.name=name;	
	}

	/**
	 * To string method which overrides the one in the asset class
	 */
	@Override
	public String toString() {
		
		
		System.out.println(super.toString());
		
		return " + ElectronicApp [name=" + name + "]";
	}

	
	/**
	 * 
	 * @return returns the name info
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * 
	 * @param name sets the name info
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
