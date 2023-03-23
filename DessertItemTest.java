/** Group7: Francis & Gustavo
* File: Lab5b.java
* Description: comparable JUnit
* Lessons Learned: this help us to make sure that the code in dessert for comparable will work properly
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package DessertShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetName() {
	 //      DessertItem name=new DessertItem();
	  //     	assertEquals(name.getName(),"");
	 //      DessertItem item = new DessertItem("Lactose", 0, 0);
	   //    	assertEquals(item.getName(),"Lactose");
		Candy name = new Candy ();
		assertEquals(name.getName(), "");
	   Candy name1 = new Candy ("lol", 0.00, 0.01);
	assertEquals(name1.getName(), "lol");
	}
	@Test
	void testSetName() {
	//	DessertItem name =new DessertItem();
	   //    name.setName("Candy");
	   //    assertEquals(name.getName(),"Candy");

		Candy name = new Candy ("LOL", 0.00 ,0.02);
		name.setName("yak");
		assertEquals(name.getName(), "yak");
	}
	
	
	/*public int compareTo(DessertItem order) {
		if (this.calculateCost() < order.calculateCost()) return -1;
		if (this.calculateCost() > order.calculateCost()) return 1;		
		else return 0;*/
	
	@Test

    void testCompareTo() {

        Candy a = new Candy ("mm", 1,1.00);

        Candy b = new Candy ("mm", 0.01,1);

        Candy c = new Candy ("mm", 1,1.00);

        assertEquals(a.compareTo(b), 1); //1>0.01

        assertEquals(b.compareTo(c), -1); //0.01<1

        assertEquals(c.compareTo(a), 0); //1=1

    }
}