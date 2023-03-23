/** Group7: Francis & Gustavo
* File: Lab5b.java
* Description: create a argument with a specific name
* Lessons Learned: that will help us to know how the product will be packed
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package DessertShop;

public class IceCream extends DessertItem{
	
	   private int scoopCount;
	   private double pricePerScoop;
	   
	   public IceCream() {
		   super();
		   scoopCount = 0;
		   pricePerScoop = 0.0;
		   setPackaging("");
	   }
	   public IceCream(String name, int scoopCount, double pricePerScoop) {
	       super(name);
	       this.scoopCount = scoopCount;
	       this.pricePerScoop = pricePerScoop;
	       this.setPackaging("Bowl");
	       
	       
	  
	   }
	   @Override
	   public double calculateCost() {
	        return scoopCount * pricePerScoop;
	    }
	public int getScoopCount() {
		return scoopCount;
	}
	public void setScoopCount(int scoopCount) {
		this.scoopCount = scoopCount;
	}
	public double getPricePerScoop() {
		return pricePerScoop;
	}
	public void setPricePerScoop(double pricePerScoop) {
		this.pricePerScoop = pricePerScoop;
	}
	public String toString()
	{
		String line1 = String.format("%s Ice Cream(%s)", this.getName(),this.getPackaging());
		String line2pt1 = String.format("%d scoops @ $%.2f/scoop:", this.getScoopCount(),this.getPricePerScoop());
		String line2pt2 = String.format("$%.2f",this.calculateCost());
		String line2pt3 = String.format("[Tax: $%.2f]", this.calculateTax());
		String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2pt1, line2pt2, line2pt3);
		return outputVar;
	}
}