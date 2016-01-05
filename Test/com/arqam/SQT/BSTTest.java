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
	
}
