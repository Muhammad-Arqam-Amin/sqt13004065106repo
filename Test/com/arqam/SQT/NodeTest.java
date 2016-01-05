package com.arqam.SQT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {

	Node<Integer> B =null;
	
	@Before
	public void ini(){
		B = new Node<Integer>(4);
	}
	
	@Test
	public void initTest() {
		Node<Integer> B = new Node<Integer>(4);
		assertNotNull("Fail initTest method Node",B);
 	}
	
	@Test 
	public void compareToTest(){
		
		assertTrue("Fail 1st assert incompareToTest", B.compareTo(4)==0);
		assertTrue("Fail 2ndt assert incompareToTest", B.compareTo(5)==-1);
		assertTrue("Fail 1st assert incompareToTest", B.compareTo(3)==1);
		
	}
	@Test
	public void toStringTest(){
		assertEquals("4",B.toString());
	}

}
