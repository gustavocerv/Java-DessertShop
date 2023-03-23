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

public class Candy extends DessertItem implements SameItem<Candy>{
	   private double candyWeight,pricePerPound;
	   public Candy()
	   {
	       super();
	       candyWeight = 0.0;
	        pricePerPound = 0.0;
	        setPackaging("");
	   }
	   public Candy(String name, double candyWeight, double pricePerPound) {
	       super(name);
	       this.candyWeight = candyWeight;
	       this.pricePerPound = pricePerPound;
	       this.setPackaging("Bag");
	   }
	   
	
		 
	@Override
	public double calculateCost() {
	
		        return candyWeight * pricePerPound;
		    }
	
	public double getCandyWeight() {
		return candyWeight;
	}
	public void setCandyWeight(double candyWeight) {
		this.candyWeight = candyWeight;
	}
	public double getPricePerPound() {
		return pricePerPound;
	}
	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	@Override
	 public String toString() {
		 String line1 = String.format("%s (%s)", this.getName(), this.getPackaging());
	        String line2pt1 = String.format("%.2f lbs. @ $%.2f/lb.:", this.getCandyWeight(), this.getPricePerPound());
	        String line2pt2 = String.format("$%.2f", this.calculateCost());
	        String line2pt3 = String.format("[Tax: $%.2f]", this.calculateTax());
	        String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2pt1, line2pt2, line2pt3);
	        return outputVar;
		 //return String.format("%s\n\t%s @ $%.2f %15s$%.2f%15s\n",this.getName(),this.getCandyWeight(),this.getPricePerPound()," ",this.calculateCost()," ",this.calculateTax());
	    }
	@Override
	public boolean isSameAs(Candy other) {
		// TODO Auto-generated method stub
		if (this.getName().equals(other.getName()) && (this.getPricePerPound() == (other.getPricePerPound())))return true; // return true if they have the same name and price 
		return false; //return false otherwise
	}
}