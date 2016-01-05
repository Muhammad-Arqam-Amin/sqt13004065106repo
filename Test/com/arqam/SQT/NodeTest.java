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


}
