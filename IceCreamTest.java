/** Group7: Francis & Gustavo
* File: IceCreamTest.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/

package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	/*@Test
	
	void testGetIceCream() {
		IceCream x = new IceCream("HUG", 1, 1.0);
		   assertEquals(x.getName(),"HUG");
	       assertEquals(x.getScoopCount(),1);
	       assertEquals(x.getPricePerScoop(),1.0);
	 
	}
	  @Test
	   	void testSetIceCream() {
		  
		  IceCream y = new IceCream ("JK",199,1.0);
		  y.setName("LOL");
		  y.setScoopCount(11);
		  y.setPricePerScoop(10.12);
	       assertEquals(y.getName(),"LOL");
	       assertEquals(y.getScoopCount(),11);
	       assertEquals(y.getPricePerScoop(),10.12);
	}
	  
	  @Test
		
		void testGetIceCream1() {
			IceCream x = new IceCream("POP", 1, 1.0);
			   assertEquals(x.getName(),"POP");
		       assertEquals(x.getScoopCount(),1);
		       assertEquals(x.getPricePerScoop(),1.0);
		 
		}
		  @Test
		   	void testSetIceCream2() {
			  
			  IceCream y = new IceCream ("JK",1,1.0);
			  y.setName("LOL");
			  y.setScoopCount(11);
			  y.setPricePerScoop(10.1);
		       assertEquals(y.getName(),"LOL");
		       assertEquals(y.getScoopCount(),11);
		       assertEquals(y.getPricePerScoop(),10.1);
		}*/
		  @Test
			void calculateCost() {
				IceCream pp = new IceCream("coco", 1, 12.0);
				assertEquals(pp.calculateCost(), 12.0); //1*12
			}
			@Test
			void calculateTax() {
				IceCream pp = new IceCream("coco", 1, 12.0);
				assertEquals(pp.calculateTax(), 0.87); //1*12*7.25/100

}
}