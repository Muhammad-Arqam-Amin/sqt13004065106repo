package com.arqam.SQT;

import static org.junit.Assert.assertNotNull;
import static junit.framework.TestCase.*;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BSTTest {
   public BST<Integer> B=null;
   @Before
	public void ini() {
		B=new BST<Integer>();
	}
	@Test
	public void initializeObjectTest() {
		BST<Integer>  Test = new BST<Integer>();
       assertNotNull("BST object initialize fail", Test);   
      
	}
	
	@Test
	public void isEmptyTest(){
	 assertTrue("Fail 1st assertion in IsEmpty test fale", B.isEmpty());
	 B.insert(65);
	 assertFalse("Fail 2nd assertion in IsEmpty test fale", B.isEmpty());
	 B.deleteNode(65);
	 assertTrue("Fail 3rd assertion in IsEmpty test fale", B.isEmpty());
	}
	
	@Test
	public void insetTest() {
		    B.insert(1);
		    assertNotNull("Fail 1st assert in InsertTest method", B.search(1));
			B.insert(2);
			assertNotNull("Fail 2nd assert in InsertTest method", B.search(2));
			B.insert(3);
			assertNotNull("Fail 3rd assert in InsertTest method", B.search(3));
			B.insert(4); 
			assertNotNull("Fail 4th assert in InsertTest method", B.search(4));
			B.insert(1); 
			assertNotNull("Fail 5th assert in InsertTest method", B.search(1));
	}
	@Test
	public void SearchTest() {
		B.insert(2);
		B.insert(1);
		B.insert(3);
		B.insert(7);
		assertNotNull("Fail 1st assert in SearchTest method", B.search(1));
		assertNotNull("Fail 2nd assert in SearchTest method", B.search(2));
		assertNotNull("Fail 3rd assert in SearchTest method", B.search(3));
		assertNotNull("Fail 4th assert in SearchTest method", B.search(7));
		
	}
	
	 @Test(expected = NullPointerException.class)
	public void deleteNodeTest() {
		B.insert(2);
		B.insert(1);
		B.insert(3);
		B.insert(7);
		
		assertNotNull("Fail 1st assert in deleteNodeTest method",B.deleteNode(1));
		assertNotNull("Fail 2nd assert in deleteNodeTest method",B.deleteNode(2));
		assertNotNull("Fail 3rd assert in deleteNodeTest method",B.deleteNode(3));
		assertNotNull("Fail 4th assert in deleteNodeTest method",B.deleteNode(7));
		
		assertNull("Fail 5th assert in deleteNodeTest method",B.deleteNode(7));
		assertNull("Fail 6th assert in deleteNodeTest method",B.deleteNode(0));
		
	}
	 
	
	
	

}
