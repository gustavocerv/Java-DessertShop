/** Group7: Francis & Gustavo
* File: DessertShop.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/

package DessertShop;

/*public class DessertShop {
	public static void main(String[] args) {
	       Order order  = new Order();
	       
	     DessertItem array[]=new DessertItem[6];
	     array[0]= new Candy("Candy Corn: ",1.5,.25);
	     array[1]= new Candy("Gummy Bears: ",.25,.35);
	     array[2]= new Cookie("Chocolate Chip: ",6,3.99);
	      array[3]= new IceCream("Pistachio: ",2,.79);
	       array[4]= new Sundae("Vanilla: ", 3, .69, "Hot Fudge", 1.29);
	      array[5] = new Cookie("Oatmeal Raisin: ",2,3.45);

	       
	    for(int l=0;l<6;l++)
	     order.add(array[l]);
	  System.out.println();
	//  for(int l=0;l<order.itemCount();l++)
	//{
		// System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", order.getOrderList().get(l).getName());
	   // System.out.println(order.getOrderList().get(l).getName());
	//  }
	    //	System.out.println("\nTotal number of items in the order: "+order.itemCount());
	    for(DessertItem i : order.getOrderList()  ) {
	    	   System.out.println();
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", i.getName(), i.calculateCost(), i.calculateTax());
		}
			 System.out.println();
			System.out.println("----------------------------------------------");
			 System.out.println();
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", order.orderCost(),order.orderTax());
			 System.out.println();
			System.out.printf("%-25s$%-8.2f\n", "Order total : ", order.orderCost()+order.orderTax());
			 System.out.println();
			System.out.println("Total items in the order: " + order.itemCount());
	}
	 
}*/
import java.util.*;


public class DessertShop {
	

		static HashMap<String, Customer> customerDB = new HashMap<>();
		
		public static void main(String[] args) {
			boolean closed = false;  
			String noinput;
			
			while(!closed){
			Order order = new Order();
		
			Candy candy = new Candy("Candy Corn", 1.5,.25);
			Candy candy2 = new Candy("Gummy Bears", .25, .35);
			Cookie cookie = new Cookie("Chocolate Chip", 6, 3.99);
			IceCream icecream = new IceCream("Pistachio", 2, .79);
			Sundae sundue = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
			Cookie cookie1 = new Cookie("Oatmeal Raisin", 2, 3.45);
			
			order.add(candy); 
			order.add(candy2);       
			order.add(cookie);       
			order.add(icecream);       
			order.add(sundue);    
			order.add(cookie1);  
			/*DessertItem array[]=new DessertItem[6];
		     array[0]= new Candy("Candy Corn: ",1.5,.25);
		     array[1]= new Candy("Gummy Bears: ",.25,.35);
		     array[2]= new Cookie("Chocolate Chip: ",6,3.99);
		     array[3]= new IceCream("Pistachio: ",2,.79);
		     array[4]= new Sundae("Vanilla: ", 3, .69, "Hot Fudge", 1.29);
		     array[5] = new Cookie("Oatmeal Raisin: ",2,3.45);*/
			
			Scanner sIn = new Scanner(System.in); 
			String choice;
			String name;
			DessertItem orderItem;
			String paymentMethod = "";
			
			boolean done = false;
			while (!done) {
			    System.out.println("\n1: Candy");
			    System.out.println("2: Cookie");            
			    System.out.println("3: Ice Cream");
			    System.out.println("4: Sunday");
			    System.out.println("5: Admin Module");

			    System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
			    choice = sIn.nextLine();
			    
			    if (choice.equals("")) {
			        done = true;
			    } else {
			        switch (choice) {
			            case "1":            
			                orderItem = userPromptCandy();
			                order.add(orderItem);
			                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
			                break;
			            case "2":            
			                orderItem = userPromptCookie();
			                order.add(orderItem);
			                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
			                break;
			            case "3":            
			                orderItem = userPromptIceCream();
			                order.add(orderItem);
			                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
			                break;
			            case "4":            
			                orderItem = userPromptSundae();
			                order.add(orderItem);
			                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
			                break;
			            case "5":
		            	   	adminModule();
			            default:            
			                System.out.println("Invalid response:  Please enter a choice from the menu (1-5)");
			                break;
			                
			        }//end of switch (choice)
			        
			    } //end of if (choice.equals(""))
			 
			}//end of while (!done)
			
			System.out.print("Enter the customer name: ");
			name = sIn.nextLine();

			if(!customerDB.containsKey(name)){
				Customer customer = new Customer(name);
				customerDB.put(name, customer);

				customerDB.get(name).addToHistory(order);
			} else {
				customerDB.get(name).addToHistory(order);
			}
			boolean ok = false;
			while(!ok) {
				System.out.print("What form of payment will be used? (CASH, CARD, PHONE): ");
				paymentMethod = sIn.nextLine();
				for(Payable.PayType p : Payable.PayType.values()) {
					if(paymentMethod.equals(p.name())) {
						ok = true;
						order.setPayType(p);
					}
				} if(!ok) {
					System.out.println();
					System.out.println("That's not a valid form of payment.\n");
					}
		
				}
			
		
			Collections.sort(order.getOrderList());
			System.out.println(order);	
			System.out.println("--------------------------------------------------------------------------------\n");
			System.out.printf("Customer Name: %-15s  Customer ID: %-20d  Total Orders: %d\n", customerDB.get(name).getName(), customerDB.get(name).getID(), customerDB.get(name).getOrderHistory().size());
			
			System.out.print("\nHit enter to start a new order ");
				noinput = sIn.nextLine();			
				if(!noinput.equals("")) closed = true;
			}
			//for(int l=0;l<6;l++)
			//     order.add(array[l]);
			//  System.out.println();
			//  for(DessertItem i : order.getOrderList()  ) {
		    //	   System.out.println();
			//	System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", i.getName(), i.calculateCost(), i.calculateTax());
			}//
		

			/*	
			 * 
			 * String name = sIn.nextLine();
			for(String value : customerDB.keySet()) {
				if(name.equals(customerDB.get(value).getName())) {
				System.out.printf("%-14s%-10s%-12s%-15d\n", "Customer Name:",customerDB.get(value).getName(), "Customer ID:", customerDB.get(value).getID());
				System.out.println("---------------------------");
				for(int i = 0; i<customerDB.get(value).getOrderHistory().size(); i++) {
				int c = i+1;
				System.out.println("Order #:" + c);
				System.out.println(customerDB.get(value).getOrderHistory().get(i));
				}
			}
			}
			System.out.println("--------------------------------------------------------------------------------\n");
			System.out.printf("%-15s%-15s%-15s%-10s%-12s%d\n","Customer Name:",customerDB.get(name).getName(), "Customer ID: ",customerDB.get(name).getID(), "Total Orders: ", customerDB.get(name).getOrderHistory().size());
			
			 * System.out.println();
				System.out.println("----------------------------------------------");
				 System.out.println();
				System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", order.orderCost(),order.orderTax());
				 System.out.println();
				System.out.printf("%-25s$%-8.2f\n", "Order total : ", order.orderCost()+order.orderTax());
				 System.out.println();
				System.out.println("Total items in the order: " + order.itemCount()); */
			//System.out.println(order.toString());
	//	}			 			
		


		private static DessertItem userPromptCandy() {

			Scanner in = new Scanner(System.in);
			String s ="", ss=""; //s is the value of the Candy, ss to verify the string is valid.
			double w = 0.0, p = 0.0;
			boolean done = false;

			Order order = new Order();

			System.out.print("Enter the type of candy: ");
			s = in.nextLine();


			while (!done) {
				System.out.print("Enter the weight : ");
				ss = in.nextLine();
				try {
					w = Double.parseDouble(ss);
					done = true;
				} catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}

			while (done) {
				System.out.print("Enter the price per pound: ");
				ss = in.nextLine();
				try {
					p = Double.parseDouble(ss);
					done = false;
				} catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}
			return new Candy(s, w, p);
		}

		private static DessertItem userPromptCookie() {

			Scanner in = new Scanner(System.in);
			String s = "", ss=""; //s the name of the cookie, ss to verify the string is valid.
			int i = 0;
			double d = 0.0;
			boolean done = false;

			Order order = new Order();

			System.out.print("Enter the type of cookie: ");
			s = in.nextLine();

			while (!done) {
				System.out.print("Enter the quantity purchased: ");
				ss = in.nextLine();
				try {
					i = Integer.parseInt(ss);
					done = true;
				} catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}

			while (done) {
				System.out.print("Enter the price per dozen: ");
				ss = in.nextLine();
				try {
					d = Double.parseDouble(ss);
					done = false;
				} catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}
			return new Cookie(s, i, d);
		}
	
		private static DessertItem userPromptIceCream() {

			Scanner in = new Scanner(System.in);
			String s = "", ss=""; //s is the value of the IceCream, ss to verify the string is valid.
			int i = 0;
			double d = 0.0;
			boolean done = false;

			Order order = new Order();

			System.out.print("Enter the type of Ice Cream used: ");
			s = in.nextLine();
			
			while (!done) {
				System.out.print("Enter the number of scoops: ");
				ss = in.nextLine();
				try {
					i = Integer.parseInt(ss);
					done = true;
				} catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}

			while (done) {
				System.out.print("Enter the price per scoop: ");
				ss = in.nextLine();
				try {
					d = Double.parseDouble(ss);
					done = false;
				} catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}
			return new IceCream(s, i, d);			
		}

		private static DessertItem userPromptSundae() {
			
			Scanner in = new Scanner(System.in);
			String s = "", ss="", topping="";		//s is the value of the IceCream, ss to verify the string is valid.
			double price = 0.0, price1 = 0.0;
			int count = 0;
			boolean done = false;

			Order order = new Order();

			System.out.print("Enter the type of Ice Cream: ");
			s = in.nextLine();

			while (!done) {
				System.out.print("Enter the number oof scoops: ");
				ss = in.nextLine();
				try {
					count = Integer.parseInt(ss);
					done = true;
				}catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}

			while (done) {
				System.out.print("Enter the price per scoop: ");
				ss = in.nextLine();
				try {
					price = Double.parseDouble(ss);
					done = false;
				}catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}
			System.out.print("Enter the kind of topping used: ");
			topping = in.nextLine();
			while (!done) {
				System.out.print("Enter the price for the topping: ");
				ss = in.nextLine();
				try {
					price1 = Double.parseDouble(ss);
					done = true;
				}catch (Exception e) {
					System.out.println("Please enter a valid number. ");
				}
			}
			return new Sundae(s, count, price, topping, price1);
			}
		
		
		
private static void adminModule() {
	Scanner sIn = new Scanner(System.in);
	boolean done = false;
	while (!done) {
	   System.out.println("\n1: Shop Customer List");
	   System.out.println("2: Customer Order History");
	   System.out.println("3: Best Customer");
	   System.out.println("4: Exit Admin Module");
	   System.out.println();
	   System.out.print("What would you like to do? (1-4): ");
	   String choice = sIn.nextLine();

	   switch (choice) {
	   case "1":
		   CustomerList();
		   break;
	   case "2":
		   CustomerOrderHistory();
		   break;  
	   case "3":
		   BestCustomer();
		   break;
	   case "4":
		   done = true;
		   break;
	}
	}
	}
private static void CustomerList() {
	for(String data : customerDB.keySet()) {
		System.out.printf("%-14s%-10s%-12s%-15d\n", "Customer Name:",customerDB.get(data).getName(), "Customer ID:", customerDB.get(data).getID());			
	}
}
private static void CustomerOrderHistory() {	
	System.out.println("Enter the name of the customer:");
	Scanner sIn = new Scanner(System.in);
	String name = sIn.nextLine();
	
	for(String data : customerDB.keySet()) {
		if(name.equals(customerDB.get(data).getName())) {
		System.out.printf("%-14s%-10s%-12s%-15d\n", "Customer Name:",customerDB.get(data).getName(), "Customer ID:", customerDB.get(data).getID());
		System.out.println("--------------------------------------------------------------------------------\n");
		for(int i = 0; i<customerDB.get(data).getOrderHistory().size(); i++) {
		int ordercount = i+1;
		System.out.println("Order #:" + ordercount);
		System.out.println(customerDB.get(data).getOrderHistory().get(i));
		}
	}
	}
}
private static void BestCustomer() {
	
	int i = 0;  // highest number to add
	String name = "";
	for(String bestCust : customerDB.keySet()) {	
		if(customerDB.get(bestCust).getOrderHistory().size()>i) {
			i = customerDB.get(bestCust).getOrderHistory().size();
		}
		if(customerDB.get(bestCust).getOrderHistory().size()==i) {
			name = customerDB.get(bestCust).getName();
		}
	}
	System.out.println("\n----------------------------------------------------");
	System.out.println("\nThe Dessert Shop's most valued customer is: " + name +"!");
	System.out.println("\n----------------------------------------------------");
}
}


		
		
		
				



