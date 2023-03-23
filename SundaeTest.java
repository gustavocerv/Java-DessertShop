/** Group7: Francis & Gustavo
* File: SundaeTest.java
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

class SundaeTest {

	
	/*@Test
	void testGetSundae() {
		Sundae x = new Sundae("HUG", 12, 12.1, "COCO", 0.0);
		   assertEquals(x.getName(),"HUG");	
	       assertEquals(x.getToppingName(),"COCO");
	       assertEquals(x.getToppingPrice(),0.0);
	 
	}
	  @Test
	   	void testSetSundae() {
		  
		  Sundae y = new Sundae ("JK", 11, 12.33, "VAN",1.0);
		  y.setName("LOL");
		  y.setToppingName("NONE");
		  y.setToppingPrice(10.12);
	       assertEquals(y.getName(),"LOL");
	       assertEquals(y.getToppingName(),"NONE");
	       assertEquals(y.getToppingPrice(),10.12);
	}
	  
	  @Test
		void testGetSundae1() {
			Sundae x = new Sundae("KISS", 2, 22, "BLACK_COCO", -1.09);
			   assertEquals(x.getName(),"KISS");
		       assertEquals(x.getToppingName(),"BLACK_COCO");
		       assertEquals(x.getToppingPrice(),-1.09);
		 
		}
		  @Test
		   	void testSetSundae1() {
			  
			  Sundae y = new Sundae ("JK", 1, 2.9, "VAN",1.0);
			  y.setName("911");
			  y.setToppingName("CANDY");
			  y.setToppingPrice(110.12);
		       assertEquals(y.getName(),"911");
		       assertEquals(y.getToppingName(),"CANDY");
		       assertEquals(y.getToppingPrice(),110.12);
		       
		}*/
		  @Test
			void calculateCost() {
				Sundae z = new Sundae("coco", 1, 12, "melon", 2.00);
				assertEquals(z.calculateCost(), 14); //(2+(1*12))
			}
			@Test
			void calculateTax() {
				Sundae z = new Sundae("coco", 1, 12.00, "melon", 2.00);
				assertEquals(z.calculateTax(), 1.015); //14*7.25/100
		}
	}
