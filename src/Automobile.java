/**
 * 
 * @author Mert CACINA
 *
 */
public class Automobile extends Asset {
	/**
	 * Global variables
	 */
	private String color;
	private int model;
	/**
	 * 
	 * @param x serial no of the asset
	 * @param c category info of the asset
	 * @param color color info of the asset
	 * @param model model year info of the asset
	 */
	public Automobile(int x, String c, String color, int model){
		super(x,c);
		this.color=color;
		this.model=model;
		
	}
	/**
	 * 
	 * @return returns the color of the asset
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
	 * 
	 * @return gives the model info of the asset
	 */
	public int getModel() {
		return model;
	}

	
	/**
	 * 
	 * @param model sets the model info of the asset
	 */
	public void setModel(int model) {
		this.model = model;
	}

	/**
	 * toString method which overrides the the one in the Asset class
	 */
	@Override
	public String toString() {
		
		System.out.println(super.toString());
		return " + Automobile [color=" + color + ", model=" + model + "]";
	}
	
	
	

}
