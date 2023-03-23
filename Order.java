/** Group7: Francis & Gustavo
* File: Order.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package DessertShop;
import java.util.ArrayList;
public class Order implements Payable {
	
	  private ArrayList<DessertItem> order;
	  private PayType payMethod;
	  
	   public Order() 
	   {
	       order=new ArrayList<>();
	       payMethod = PayType.CASH;
	   }
	   public ArrayList<DessertItem> getOrderList(){
		   return order;
		  
		   }
	   public void add(DessertItem a)
	   {
		   if (a instanceof Candy) {
				for (DessertItem i : order) {
					if (i instanceof Candy) {
						if (((Candy) a).isSameAs((Candy) i)) {
							((Candy) i).setCandyWeight(((Candy) i).getCandyWeight() + ((Candy) a).getCandyWeight());
							return;
						}
					}
				}
			}
			else if (a instanceof Cookie) {
				for (DessertItem i : order) {
					if (i instanceof Cookie) {
						if (((Cookie) a).isSameAs((Cookie) i)) {
							((Cookie) i).setCookieQty(((Cookie) i).getCookieQty() + ((Cookie) a).getCookieQty());
							return;
						}
					}
				}
			}
	       order.add(a);
	      // return a;
	   }
	   public int itemCount()
	   {
	       return order.size();
	   }
		
		public double orderCost() {
			double allCost = 0;
			for(DessertItem i : order) {
				allCost = allCost + i.calculateCost();
			} return allCost;     
		}                    
		public double orderTax() {
			double allTax = 0.0;
			for(DessertItem d : getOrderList()) {
				allTax = allTax + d.calculateTax();
			} 
			return allTax;
			
		}
		double calculateCost() {
			return orderCost() + orderTax();
		}
		

		@Override
		public String toString() {
			String finalOutput = "";
			finalOutput += "------------------------------------Receipt----------------------------------------\n";
			for (DessertItem d : this.order) {
				finalOutput += d + "\n";
			}
			finalOutput += "-----------------------------------------------------------------------------------";
			finalOutput += String.format("\nTotal number of items in order: %d", itemCount());			
			finalOutput += String.format("%-54s$%-8.2f[Tax: $%.2f]\n", "\nOrder Subtotals:", orderCost(), orderTax());
			finalOutput += String.format("%-53s$%-8.2f\n", "Order Total:", orderCost() + orderTax());
			finalOutput += "-----------------------------------------------------------------------------------"; 
			finalOutput += String.format("\nPaid for with %s.", getPayType());
			return finalOutput;
		}
		@Override
		public PayType getPayType() {
			// TODO Auto-generated method stub
			return payMethod;
		}
		@Override
		public void setPayType(PayType payType) {
			// TODO Auto-generated method stub
			payMethod   = payType;
		}
		
		}