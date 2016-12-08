package edu.carrollcc.cis232;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import org.junit.Test;

public class Question1Test {
	@Test
	public void testMaxElementMethodExists() {
		try {
			Class<?> question1 = Class.forName("edu.carrollcc.cis232.Question1");
			Method maxElement = question1.getMethod("maxElement", int[].class);
			assertNotNull(maxElement);
		} catch (ClassNotFoundException e) {
			fail("Question1 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question1 is missing maxElement method that takes an int[]");
		}
	}

	@Test
	public void testGetMaxElementSorted() {
		try {
			Class<?> question1 = Class.forName("edu.carrollcc.cis232.Question1");
			Method maxElement = question1.getMethod("maxElement", int[].class);
			int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
			int max = (int) maxElement.invoke(null, nums);
			assertEquals("max should be 8 with array of 1 to 8", max, 8);
		} catch (ClassNotFoundException e) {
			fail("Question1 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question1 is missing maxElement method that takes an int[]");
		} catch (Exception e) {
			fail("Exception thrown (make sure method is static)!");
		}
	}

	@Test
	public void testGetMaxElementReversed() {
		try {
			Class<?> question1 = Class.forName("edu.carrollcc.cis232.Question1");
			Method maxElement = question1.getMethod("maxElement", int[].class);
			int[] nums = { 8, 7, 6, 5, 4, 3, 2, 1 };
			int max = (int) maxElement.invoke(null, nums);
			assertEquals("max should be 8 with array of 8 to 1", max, 8);
		} catch (ClassNotFoundException e) {
			fail("Question1 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question1 is missing maxElement method that takes an int[]");
		} catch (Exception e) {
			fail("Exception thrown (make sure method is static)!");
		}
	}

	@Test
	public void testGetMaxElementOneElement() {
		try {
			Class<?> question1 = Class.forName("edu.carrollcc.cis232.Question1");
			Method maxElement = question1.getMethod("maxElement", int[].class);
			int[] nums = { 8 };
			int max = (int) maxElement.invoke(null, nums);
			assertEquals("max should be 8 with array of 8 to 1", max, 8);
		} catch (ClassNotFoundException e) {
			fail("Question1 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question1 is missing maxElement method that takes an int[]");
		} catch (Exception e) {
			fail("Exception thrown (make sure method is static)!");
		}
	}

	@Test
	public void testGetMaxElementNegatives() {
		try {
			Class<?> question1 = Class.forName("edu.carrollcc.cis232.Question1");
			Method maxElement = question1.getMethod("maxElement", int[].class);
			int[] nums = { -100, -8, -1000, -8888 };
			int max = (int) maxElement.invoke(null, nums);
			assertEquals("max should be -8 with array of negative values", max, -8);
		} catch (ClassNotFoundException e) {
			fail("Question1 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question1 is missing maxElement method that takes an int[]");
		} catch (Exception e) {
			fail("Exception thrown (make sure method is static)!");
		}
	}

	@Test
	public void testGetMaxElementNoElements() {
		try {
			Class<?> question1 = Class.forName("edu.carrollcc.cis232.Question1");
			Method maxElement = question1.getMethod("maxElement", int[].class);
			int[] nums = {};
			int max = (int) maxElement.invoke(null, nums);
			fail("IllegalArgumentException Should be thrown.");
		} catch (ClassNotFoundException e) {
			fail("Question1 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question1 is missing maxElement method that takes an int[]");
		} catch (IllegalArgumentException e) {
			// This is what we want!
			assertNotNull(e);
		} catch (Exception e) {
			System.err.println(e.getClass().getName());
			if(!(e.getCause() instanceof IllegalArgumentException)){
				fail("Wrong Exception thrown");
			}
		}
	}
}
