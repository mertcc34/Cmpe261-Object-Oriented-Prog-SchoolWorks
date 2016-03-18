/**
 * 
 * @author Mert CACINA
 *
 */
public class CompactDisk extends Asset {
	
	/**
	 * Global variables
	 */
	private double capacity;
	/**
	 * Constructor
	 * @param x serial no info
	 * @param c category info
	 * @param capacity capacity of the asset
	 */
	public CompactDisk(int x, String c, double capacity){
		super(x,c);
		this.capacity=capacity;
	
	}

	/**
	 * 
	 * @return returns the capacity info of the asset
	 */
	public double getCapacity() {
		return capacity;
	}
	
	/**
	 * 
	 * @param capacity sets the capacity of the asset
	 */
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * To string method which overrides the one in the asset class
	 */
	@Override
	public String toString() {
		
		System.out.println(super.toString());
		return "+ CompactDisk [capacity=" + capacity + "]";
	}

	
	

}
