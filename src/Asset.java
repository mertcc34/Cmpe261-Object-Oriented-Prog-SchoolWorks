/**
 * 
 * @author Mert CACINA
 *
 */
public class Asset {
	/**
	 * Global variables
	 */
	private int serial;
	private String category;
	/**
	 * Constructor
	 * 
	 * @param x serial no
	 * @param y Category string
	 */
	public Asset(int x,String y){
		
		serial=x;
		category=y;
		
	}
	
	/**
	 * To string method overrides the one in the Asset class
	 */
	@Override
	public String toString() {
		return "Asset [serial=" + serial + ", category=" + category + "]";
	}

/**
 * 
 * @return returns the serial number of asset
 */
	public int getSerial() {
		return serial;
	}
	
	/**
	 * 
	 * @param serial sets the serial number of asset
	 */
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	/**
	 * 
	 * @return returns the category information of the asset
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * 
	 * @param category sets the category information of the asset.
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
