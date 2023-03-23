/** Group7: Francis & Gustavo
* File: Customer.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package DessertShop;
import java.util.*;
public class Customer {
	//attributes
	private String custName ;
	private ArrayList<Order> orderHistory ;
	private int custID;
	private static int nextCustID = 1000;
	//constructor 
	public Customer(String name) {
		custName = name;
		orderHistory = new ArrayList<Order>();
	    custID = nextCustID;
	    nextCustID ++;
	}
	//methods
	public String getName() {
	    return custName;
	}
	public int getID() {  //no set ID because it is static
	    return custID;
	}
	public ArrayList<Order> getOrderHistory(){
	    return orderHistory;
	}
	public void setName(String n) {
	    custName = n;
	}
	public void addToHistory(Order o) {
	    orderHistory.add(o);
	    
}
}