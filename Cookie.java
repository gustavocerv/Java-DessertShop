/** Group7: Francis & Gustavo
* File: Lab3a.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/

package DessertShop;

public class Cookie extends DessertItem implements SameItem<Cookie> {
	   private int cookieQty;
	   private double pricePerDozen;
	   public Cookie() {
		   super();
		   cookieQty = 0;
		   pricePerDozen = 0.0;
		   setPackaging("");
		   }
	   public Cookie(String name, int cookieQty, double pricePerDozen) {
	       super(name);
	       this.cookieQty = cookieQty;
	       this.pricePerDozen = pricePerDozen;
	       this.setPackaging("Box");
	   
	   }
	   @Override
	   public double calculateCost() {
		   return cookieQty * (pricePerDozen/12);
	    }
	public int getCookieQty() {
		return cookieQty;
	}
	public void setCookieQty(int cookieQty) {
		this.cookieQty = cookieQty;
	}
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}
	@Override
		public String toString() {
			String line1 = String.format("%s Cookies (%s)", this.getName(), this.getPackaging());
			String line2pt1 = String.format("%d cookies @ $%.2f/dozen:", this.getCookieQty(),this.getPricePerDozen());
			String line2pt2 = String.format("$%.2f",this.calculateCost());
			String line2pt3 = String.format("[Tax: $%.2f]", this.calculateTax());
			String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2pt1, line2pt2, line2pt3);
			return outputVar;
	}
	@Override
	public boolean isSameAs(Cookie other) {
		// TODO Auto-generated method stub
		if (this.getName().equals(other.getName()) && (this.getPricePerDozen() == (other.getPricePerDozen()))) return true; // return true if they have the same name and price 
		return false; //return false otherwise
	}
}