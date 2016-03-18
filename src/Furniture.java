/**
 * 
 * @author Mert CACINA
 *
 */
public class Furniture extends Asset {
	/**
	 * Global variables
	 */
	private String color;
	/**
	 * constructor
	 * @param x serial info of the furniture
	 * @param c category info of the furniture
	 * @param color
	 */
	public Furniture(int x,String c,String color){
		
		super(x,c);	
		this.color=color;
		
	}

	/**
	 * 
	 * @return returns the color info of the asset
	 */
	public String getColor() {
		return color;
	}

	
	/**
	 * 
	 * @param color sets the color info of the asset
	 */
	public void setColor(String color) {
		this.color = color;
	}

	
	/**
	 * To string method which overrides the one in the asset class
	 */
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "+ Furniture [color=" + color + "]";
	}
	
	
	

}
