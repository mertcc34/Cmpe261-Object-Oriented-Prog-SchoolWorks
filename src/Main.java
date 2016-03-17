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

		
		System.out.println("What would you like to do ? Available Commands : add, show by category, modify, remove, search by serial ");
		
		while(true){
		
			
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
			System.out.println("What would you like to do ? Available Commands : add, show, modify, remove, search");
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
			System.out.println("What would you like to do now ? Available Commands : add, show, modify, remove, search ");				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		} // end of while
		
	} // end of main

} // end of class
