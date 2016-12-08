package edu.carrollcc.cis232;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Question2Test {

	private Method getPalindromeMethod() {
		try {
			Class<?> question2 = Class.forName("edu.carrollcc.cis232.Question2");
			return question2.getMethod("isPalindrome", String.class);
		} catch (ClassNotFoundException e) {
			fail("Question2 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question2 is missing isPalindrome method that takes a String");
		}
		return null;
	}

	@Test
	public void testPalindromeMethodExists() {
		assertNotNull(getPalindromeMethod());
	}

	
	@Test
	public void testPositivePalindrome1(){
		try {
			assertTrue("racecar is a palindrome", (boolean)getPalindromeMethod().invoke(null, "racecar"));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testPositivePalindrome2(){
		try {
			assertTrue("Kayak is a palindrome", (boolean)getPalindromeMethod().invoke(null, "Kayak"));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testPositivePalindrome3(){
		try {
			assertTrue("A man, a plan, a canal, Panama is a palindrome", (boolean)getPalindromeMethod().invoke(null, "A man, a plan, a canal, Panama"));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testPositivePalindrome4(){
		try{
			String palindrome = "Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.";
			assertTrue(String.format("%s is a palindrome", palindrome), (boolean)getPalindromeMethod().invoke(null, palindrome));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testPositivePalindrome5(){
		try{
			String palindrome = "12321";
			assertTrue(String.format("%s is a palindrome", palindrome), (boolean)getPalindromeMethod().invoke(null, palindrome));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testPositivePalindrome6(){
		try{
			String palindrome = "1221";
			assertTrue(String.format("%s is a palindrome", palindrome), (boolean)getPalindromeMethod().invoke(null, palindrome));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testNotPalindrome1(){
		try {
			String palindrome = "Donald Trump";
			assertFalse(String.format("%s is not a palindrome", palindrome), (boolean)getPalindromeMethod().invoke(null, palindrome));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testNotPalindrome2(){
		try {
			String palindrome = "cis232cis";
			assertFalse(String.format("%s is not a palindrome", palindrome), (boolean)getPalindromeMethod().invoke(null, palindrome));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
	
	@Test
	public void testNotPalindrome3(){
		try {
			String palindrome = "12345";
			assertFalse(String.format("'%s' is not a palindrome", palindrome), (boolean)getPalindromeMethod().invoke(null, palindrome));
		} catch (Exception e) {
			fail("isPalindrome should return a boolean");
		} 
	}
}
