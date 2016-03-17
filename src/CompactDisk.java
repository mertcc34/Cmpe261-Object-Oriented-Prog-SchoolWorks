/**
 * 
 * @author Mert CACINA
 *
 */
public class CompactDisk extends Asset {
	
	
	private double capacity;
	
	public CompactDisk(int x, String c, double capacity){
		
		
		super(x,c);
		this.capacity=capacity;
	
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	
	public String toString() {
		
		System.out.println(super.toString());
		return "CompactDisk [capacity=" + capacity + "]";
	}

	
	

}
