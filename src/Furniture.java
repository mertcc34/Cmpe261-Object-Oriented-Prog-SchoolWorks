/**
 * 
 * @author Mert CACINA
 *
 */
public class Furniture extends Asset {
	
	private String color;
	
	public Furniture(int x,String c,String color){
		
		super(x,c);	
		this.color=color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String toString() {
		System.out.println(super.toString());
		return "Furniture [color=" + color + "]";
	}
	
	
	

}
