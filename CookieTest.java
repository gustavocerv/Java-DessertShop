package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	/*@Test
	void testGetCookie() {
		Cookie x = new Cookie("HUG", 1, 1.0);
		   assertEquals(x.getName(),"HUG");
	       assertEquals(x.getCookieQty(),1);
	       assertEquals(x.getPricePerDozen(),1.0);
	 
	}
	  @Test
	   	void testSetCookie() {
		  
		  Cookie y = new Cookie ("JK",199,1.0);
		  y.setName("LOL");
		  y.setCookieQty(11);
		  y.setPricePerDozen(10.12);
	       assertEquals(y.getName(),"LOL");
	       assertEquals(y.getCookieQty(),11);
	       assertEquals(y.getPricePerDozen(),10.12);
	}
		@Test
		void testGetCookie1() {
			Cookie x = new Cookie("HUG", -999, 1.012);
			   assertEquals(x.getName(),"HUG");
		       assertEquals(x.getCookieQty(),-999);
		       assertEquals(x.getPricePerDozen(),1.012);
		 
		}
		  @Test
		   	void testSetCookie1() {
			  
			  Cookie y = new Cookie ("JK",199,1.0);
			  y.setName("LOL");
			  y.setCookieQty(-11);
			  y.setPricePerDozen(10999.12);
		       assertEquals(y.getName(),"LOL");
		       assertEquals(y.getCookieQty(),-11);
		       assertEquals(y.getPricePerDozen(),10999.12);
	}*/
		  @Test
			void testCalculateCost() {
				Cookie gg = new Cookie("LOL", 1, 12.00);
				gg.calculateCost();
				assertEquals(gg.calculateCost(),1); //1*12/12

			}
			@Test
			void testCalculateTax() {
				Cookie gg = new Cookie("LOL", 1, 12.00);
				assertEquals(gg.calculateTax(),.0725); //1*12/12*7.25/100
			}
			
			@Test
			void testIsSameAs() {
				Cookie t1 = new Cookie("chocolate chip", 11, 2.22); // String name, int Quantities, double PricePerDozen
				Cookie t2 = new Cookie("chocolate chip", 10, 2.22); // same name, different Quantities, same PricePerDozen
				Cookie f1 = new Cookie("sugar free", 11, 2.22); // String name, int Quantities, double PricePerDozen
				Cookie f3 = new Cookie("sugar free", 11, 2.21);// same name, same Quantities, different PricePerDozen
				assertEquals(t1.isSameAs(t2), true);
				assertEquals(f1.isSameAs(f3), false);
			}
}
