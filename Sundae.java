/** Group7: Francis & Gustavo
** File: Lab5b.java
* Description: create a argument with a specific name
* Lessons Learned: that will help us to know how the product will be packed
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package DessertShop;

public class Sundae   extends IceCream {

	   private String toppingName;
	   private double toppingPrice;
	   public Sundae() {
	       super();
	       toppingName = "";
	       toppingPrice = 0.0;
	       setPackaging("");
	       }
	
	   public Sundae  (String name, int i, double d, String toppingName, double toppingPrice) {
	       super(name, i, d);
	       this.toppingName = toppingName;
	       this.toppingPrice = toppingPrice;
	       this.setPackaging("Boat");
	}
	   @Override
	   public double calculateCost() {
			return toppingPrice + (getScoopCount() * getPricePerScoop());
		
	    }

	public String getToppingName() {
		return toppingName;
	}

	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	@Override
	
		public String toString() {
			String line1 = String.format("%s %s Sundae (%s)\n\t%d scoops of %s ice cream @ $%.2f/scoop", this.getToppingName(), this.getName(), this.getPackaging(), this.getScoopCount(),this.getName(), this.getPricePerScoop());
			String line2pt1 = String.format("%s topping @ $%.2f", this.getToppingName(), this.getToppingPrice());
			String line2pt2 = String.format("$%.2f", this.calculateCost());
			String line2pt3 = String.format("[Tax: $%.2f]", this.calculateTax());
			String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2pt1, line2pt2, line2pt3);
			return outputVar;
           // return String.format("%s\n\t%s @ $%.2f %15s$%.2f%15s\n",
           // 		this.getName(),this.getToppingName(),this.getToppingPrice()," ",this.calculateCost()," ",this.calculateTax());
    }

}