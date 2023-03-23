package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testGetName() {
		Customer customer = new Customer("layla");
		assertEquals(customer.getName(),"layla");
	}

	@Test
	void testGetID() {
		Customer customer = new Customer("layla");
		assertEquals(customer.getID(),1000);	
	}

	@Test
	void testGetOrderHistory() {
		Customer customer = new Customer("layla");
		Order order = new Order();
		ArrayList<Order> array = new ArrayList<Order>();

		customer.addToHistory(order);
		array.add(order);
		assertEquals(customer.getOrderHistory(),array);	
	}

	@Test
	void testSetName() {
		Customer customer = new Customer("Layla");
		customer.setName("Miya");
		assertEquals(customer.getName(),"Miya");	
	}

	@Test
	void testAddToHistory() {
		Customer customer = new Customer("layla");
		Candy candy = new Candy("Candy Corn" , 1.23, 3.21);

		Order order = new Order();
		ArrayList<Order> array = new ArrayList<Order>();

		customer.addToHistory(order);	
		order.add(candy);
		array.add(order);				
		assertEquals(customer.getOrderHistory(),array);
	}

}

