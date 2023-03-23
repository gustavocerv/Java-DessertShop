/** Group7: Francis & Gustavo
 * File: CandyTest.java
 * Description: Candy JUnit
 * Lessons Learned: JUnit helped us to test that Candy's classes, methods, getters, and setters are working correctly
 * 
 *   
 * Instructor's Name: Jeff Light
 *
 * @author     Francis , Gustavo
 * @since       05/3/2022
 */
package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {
	/*
	@Test
	void testGetCandy() {
		 Candy x = new Candy("M&M", 1.0, 1.0);
		   assertEquals(x.getName(),"M&M");
	       assertEquals(x.getCandyWeight(),1.0);
	       assertEquals(x.getPricePerPound(),1.0);

	}
	  @Test
	   	void testSetCandy() {

		  Candy y = new Candy("Loli",1.0,1.0);
		  y.setName("KK");
		  y.setCandyWeight(11.1);
		  y.setPricePerPound(10.1);
	       assertEquals(y.getName(),"KK");
	       assertEquals(y.getCandyWeight(),11.1);
	       assertEquals(y.getPricePerPound(),10.1);	      
	}
	  @Test
		void testGetCandy1() {
			 Candy x = new Candy("C & C", 1, 1.99);
			   assertEquals(x.getName(),"C & C");
		       assertEquals(x.getCandyWeight(),1);
		       assertEquals(x.getPricePerPound(),1.99);

		}
	  @Test
	   	void testSetCandy2() {

		  Candy y = new Candy("Loli",1,1);
		  y.setName("LOL: MM");
		  y.setCandyWeight(11);
		  y.setPricePerPound(10.00);
	       assertEquals(y.getName(),"LOL: MM");
	       assertEquals(y.getCandyWeight(),11);
	       assertEquals(y.getPricePerPound(),10.00);	      
	}
	 */

	@Test
	void testCalculateCost() {
		Candy gg = new Candy("LOL", 1.00, 2.00);
		gg.calculateCost();
		assertEquals(gg.calculateCost(), 2.00);

	}
	@Test
	void testCalculateTax() {
		Candy gg = new Candy("LOL", 1.00, 2.00);
		assertEquals(gg.calculateTax(), 0.145);
	}

	@Test
	void testIsSameAs() {
		Candy t1 = new Candy("m&m", 1.20, 2.22);  //String name, double weigh, double PricePerPound
		Candy t2 = new Candy("m&m", 1.10, 2.22); // same name, different weight, same PricePerPound
		Candy f1 = new Candy("lolli", 1.20, 2.22); //String name, double weigh, double PricePerPound
		Candy f3 = new Candy("lolli", 1.20, 2.21);// same name, same weight, different PricePerPound
		assertEquals(t1.isSameAs(t2), true);
		assertEquals(f1.isSameAs(f3), false);
	}
}