import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 
 * @author Mert CACINA
 *
 */
public class Main {
	
	/**
	 * 
	 * Main method driving the program.
	 */
	
	public static void main(String[] args) {
		/**
		 * Arraylists that holds the added assets
		 */
		ArrayList<Automobile> automobiles = new ArrayList<Automobile>();
		ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
		ArrayList<ElectronicApp> electronicApp = new ArrayList<ElectronicApp>();
		ArrayList<CompactDisk> compactDisk = new ArrayList<CompactDisk>();
		ArrayList<Asset> allAssets = new ArrayList<Asset>();
		/**
		 * Scanner object
		 */
		Scanner input=new Scanner(System.in);

		
		
		
		while(true){
			System.out.println("What would you like to do ? Available Commands : add, modify, remove, search ");
			
			String first=input.next();
		
		
		/**
		 * The first if condition checks if the operation 
		 * that wanted to do
		 * is add operation or not.
		 * 
		 */
		if("add".equals(first)){
			
			System.out.println("What type would you like to add ? Available : electronic, automobile, furniture, compact  ");
			String add = input.next();
			/**
			 * electronic add operation
			 */
			if("electronic".equals(add)){
				System.out.println("Please enter its serial number");
				int serial = input.nextInt();
				System.out.println("Please enter its category. Available : electronic, automobile, furniture, compact");
				String category = input.next();
				System.out.println("Please enter its name");
				String name = input.next();
				
				ElectronicApp temp = new ElectronicApp(serial,category,name);
				
				electronicApp.add(temp);
				allAssets.add(temp);
			}
			/**
			 * automobile add operation
			 */
			if("automobile".equals(add)){
				System.out.println("Please enter its serial number");
				int serial = input.nextInt();
				System.out.println("Please enter its category. Available : electronic, automobile, furniture, compact");
				String category = input.next();
				System.out.println("Please enter its color");
				String color = input.next();
				System.out.println("Please enter its model year");
				int model = input.nextInt();
				
				
				Automobile temp = new Automobile(serial,category,color,model);
				
				automobiles.add(temp);
				allAssets.add(temp);
			}
			/**
			 * furniture add operation
			 */
			if("furniture".equals(add)){
				System.out.println("Please enter its serial number");
				int serial = input.nextInt();
				System.out.println("Please enter its category. Available : electronic, automobile, furniture, compact");
				String category = input.next();
				System.out.println("Please enter its color");
				String color = input.next();
				
				Furniture temp = new Furniture(serial,category,color);
				
				furnitures.add(temp);
				allAssets.add(temp);
			}
			
			
			/**
			 * compact disk add operation
			 */
			if("compact".equals(add)){
				System.out.println("Please enter its serial number");
				int serial = input.nextInt();
				System.out.println("Please enter its category. Available : electronic, automobile, furniture, compact");
				String category = input.next();
				System.out.println("Please enter its capacity");
				Double capacity = input.nextDouble();
				
				CompactDisk temp = new CompactDisk(serial,category,capacity);
				
				compactDisk.add(temp);
				allAssets.add(temp);
			}
				
			System.out.println("Done!");
		}
		
		
		
		
		
		/**
		 * 
		 * Show operaiton
		 * 
		 */
		
		if("show".equals(first)){
			
			System.out.println("Which category would you want to see ? Available : electronic, automobile, furniture, compact");
			String category = input.next();
			/**
			 * shows the electronic category assets
			 */
			if(category.equals("electronic")){
				
				for(ElectronicApp e : electronicApp){
					System.out.println(e.toString());
				}
				
			}
			/**
			 * shows the automobile category assets
			 */
			if(category.equals("automobile")){
				
				for(Automobile e : automobiles){
					
					System.out.println(e.toString());
				}
				
			}
			
			/**
			 * shows the furniture category assets
			 */
			if(category.equals("furniture")){
	
				for(Furniture e : furnitures){
					System.out.println(e.toString());
				}
	
			}
			
			/**
			 * shows the compact category assets
			 */
			if(category.equals("compact")){
	
				for(CompactDisk e : compactDisk){
					System.out.println(e.toString());
				}
	
			}
			
			System.out.println("Done!");
		}
		
		/**
		 * 
		 *search operation
		 *based on the serial number
		 *values of the assets.
		 *
		 */
		
		if("search".equals(first)){
			
			System.out.println("Please enter the serial number");
			int serialIn =input.nextInt();
			
			for(Asset e : allAssets){
				
				if (e.getSerial() == serialIn){
					System.out.println("Found!");
					System.out.println(e.toString());
					
				}
				
				
				
			}
			
			System.out.println("Done");
			
		}
		
		
		/**
		 * remove operation
		 * based on the category and
		 * serial number information
		 * of the assets
		 */
		if("remove".equals(first)) {
			
			System.out.println("Please enter the serial number of the product to be removed");
			int serialRemove = input.nextInt();
			
			for(Iterator<Asset> it = allAssets.iterator(); it.hasNext();){
				Asset anAsset = it.next();
				if (anAsset.getSerial() == serialRemove){
					System.out.println("Found!");
					System.out.println("Removing");
					System.out.println(anAsset.toString());
					
					it.remove();
					
					System.out.println("This item is removed");
					
				}
			
								
				
			}
			for(Iterator<ElectronicApp> it = electronicApp.iterator(); it.hasNext();){
				Asset anAsset = it.next();
				if (anAsset.getSerial() == serialRemove){
					it.remove();
				}
			}
			for(Iterator<Furniture> it = furnitures.iterator(); it.hasNext();){
				Asset anAsset = it.next();
				if (anAsset.getSerial() == serialRemove){
					it.remove();
				}
			}
			for(Iterator<Automobile> it = automobiles.iterator(); it.hasNext();){
				Asset anAsset = it.next();
				if (anAsset.getSerial() == serialRemove){
					it.remove();
				}
			}
			for(Iterator<CompactDisk> it = compactDisk.iterator(); it.hasNext();){
				Asset anAsset = it.next();
				if (anAsset.getSerial() == serialRemove){
					it.remove();
				}
			}
				
				
				System.out.println("Done");
		
			}
		/**
		 * Modify operation
		 * first takes the category info
		 * then find the wanted asset
		 * let the user to re edit its data informations.
		 */
		if ( "modify".equals(first)) {
			
			System.out.println("Please enter the category of the asset you want to modify. Available : electronic, automobile, furniture, compact");
			String catModify = input.next();
			
			if("electronic".equals(catModify)){
				System.out.println("Please enter the serial number of asset you want to modify");
				int serialE = input.nextInt();
				
				for (ElectronicApp e : electronicApp){
					
					if(e.getSerial()==serialE){
						allAssets.remove(e);
						System.out.println("Please re-enter its serial number");
						int serialElMod = input.nextInt();
						e.setSerial(serialElMod);
						System.out.println("Please re-enter its name");
						String nameEl = input.next();
						e.setName(nameEl);
						allAssets.add(e);
						
					}
					
				}
				
				
			}
			
			if("automobile".equals(catModify)){
				System.out.println("Please enter the serial number of asset you want to modify");
				int serialE = input.nextInt();
				
				for (Automobile e : automobiles){
					
					if(e.getSerial()==serialE){
						allAssets.remove(e);
						System.out.println("Please re-enter its serial number");
						int serialElMod = input.nextInt();
						e.setSerial(serialElMod);
						System.out.println("Please re-enter its color");
						String colorEl = input.next();
						e.setColor(colorEl);
						System.out.println("Please re-enter its model year");
						int modelEl = input.nextInt();
						e.setModel(modelEl);
						allAssets.add(e);
						
					}
					
				}
				
				
			}
			
			if("furniture".equals(catModify)){
				System.out.println("Please enter the serial number of asset you want to modify");
				int serialE = input.nextInt();
				
				for (Furniture e : furnitures){
					
					if(e.getSerial()==serialE){
						allAssets.remove(e);
						System.out.println("Please re-enter its serial number");
						int serialElMod = input.nextInt();
						e.setSerial(serialElMod);
						System.out.println("Please re-enter its color");
						String colorEl = input.next();
						e.setColor(colorEl);
						allAssets.add(e);
						
					}
					
				}
				
				
			}
			
			if("compact".equals(catModify)){
				System.out.println("Please enter the serial number of asset you want to modify");
				int serialE = input.nextInt();
				
				for (CompactDisk e : compactDisk){
					
					if(e.getSerial()==serialE){
						allAssets.remove(e);
						System.out.println("Please re-enter its serial number");
						int serialElMod = input.nextInt();
						e.setSerial(serialElMod);
						System.out.println("Please re-enter its capacity");
						Double capEl = input.nextDouble();
						e.setCapacity(capEl);
						allAssets.add(e);
						
					}
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		} // end of while
		
	} // end of main

} // end of class
