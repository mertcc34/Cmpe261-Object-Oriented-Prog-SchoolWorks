/**
 * 
 * @author Mert CACINA
 *
 */
public class Asset {
	
	private int serial;
	private String category;
	
	public Asset(int x,String y){
		
		serial=x;
		category=y;
		
	}
	
	
	@Override
	public String toString() {
		return "Asset [serial=" + serial + ", category=" + category + "]";
	}


	public int getSerial() {
		return serial;
	}
	
	
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	public String getCategory() {
		return category;
	}
	
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
