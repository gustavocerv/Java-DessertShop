/** Group7: Francis & Gustavo
* File: Lab5b.java
* Description: comparable
* Lessons Learned: comparable help us to comparable different items in java
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/

package DessertShop;

public abstract class DessertItem implements Packaging, Comparable<DessertItem>{
	
	 //Attributes 
	  private String name;
	  double  taxPercent = 7.25;
	  String packaging = "";
	  // Constructors
	  public DessertItem(String name) {
			this.name = name;
		}
	     
	  public DessertItem() { //no argument as required
	         name="";
	     }
	  
	 
	
	 //Getter and Setter

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	  
	  // Calculation methods
	 public  abstract double  calculateCost();
	  
	  public double calculateTax() {
		  return (calculateCost() * taxPercent)/100;
	  
	  }

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
	
	public int compareTo(DessertItem order) {//part 8
		if (this.calculateCost() < order.calculateCost()) return -1;
		if (this.calculateCost() > order.calculateCost()) return 1;		
		else return 0;
	  
	  
}
}