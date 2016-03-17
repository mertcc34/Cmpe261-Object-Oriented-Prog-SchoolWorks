/**
 * 
 * @author Mert CACINA
 *
 */
public class Automobile extends Asset {
	
	private String color;
	private int model;
	
	public Automobile(int x, String c, String color, int model){
		super(x,c);
		this.color=color;
		this.model=model;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	
	public String toString() {
		
		System.out.println(super.toString());
		return " + Automobile [color=" + color + ", model=" + model + "]";
	}
	
	
	

}
