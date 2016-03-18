import java.util.ArrayList;
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
		
		ArrayList<Automobile> automobiles = new ArrayList<Automobile>();
		ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
		ArrayList<ElectronicApp> electronicApp = new ArrayList<ElectronicApp>();
		ArrayList<CompactDisk> compactDisk = new ArrayList<CompactDisk>();
		ArrayList<Asset> allAssets = new ArrayList<Asset>();

		Scanner input=new Scanner(System.in);

		
		
		
		while(true){
			System.out.println("What would you like to do ? Available Commands : add, modify, remove, search ");
			
			String first=input.next();
		
		
		
		if("add".equals(first)){
			
			System.out.println("What type would you like to add ? Available : electronic, automobile, furniture, compact  ");
			String add = input.next();
			
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
		
		
		
		
		
		
		
		if("show".equals(first)){
			
			System.out.println("Which category would you want to see ? Available : electronic, automobile, furniture, compact");
			String category = input.next();
			
			if(category.equals("electronic")){
				
				for(ElectronicApp e : electronicApp){
					System.out.println(e.toString());
				}
				
			}
			if(category.equals("automobile")){
				
				for(Automobile e : automobiles){
					
					System.out.println(e.toString());
				}
				
			}
			if(category.equals("furniture")){
	
				for(Furniture e : furnitures){
					System.out.println(e.toString());
				}
	
			}
			if(category.equals("compact")){
	
				for(CompactDisk e : compactDisk){
					System.out.println(e.toString());
				}
	
			}
			
			System.out.println("Done!");
		}
		
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
		
		if("remove".equals(first)){
			
			System.out.println("Please enter the serial number of the product to be removed");
			int serialRemove = input.nextInt();
			
			for(Asset e : allAssets){
				
				if (e.getSerial() == serialRemove){
					System.out.println("Found!");
					System.out.println("Removing");
					System.out.println(e.toString());
					
					allAssets.remove(e);
					
					System.out.println("This item is removed");
					
				}
			
			}
				for(Automobile x : automobiles){
					if (x.getSerial() == serialRemove){
						automobiles.remove(x);
					}	
				}
				
				for(CompactDisk c : compactDisk){
					if (c.getSerial() == serialRemove){
						compactDisk.remove(c);
					}	
				}
				for(ElectronicApp v : electronicApp){
					if (v.getSerial() == serialRemove){
						electronicApp.remove(v);
					}	
				}
				for(Furniture f : furnitures){
					if (f.getSerial() == serialRemove){
						furnitures.remove(f);
					}	
				}
				
				
				System.out.println("Done");
		
			}
		
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
