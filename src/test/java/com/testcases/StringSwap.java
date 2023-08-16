package com.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.base.StringSwapHelper;

public class StringSwap {
	
	StringSwapHelper help=new StringSwapHelper();
	
	@Test
	public void stringSwap2charsOnly() {		
		Assert.assertEquals("BA", help.swaplasttwochars("AB"));		
	} 
	
	@Test
	public void stringSwap4chars() {		
		Assert.assertEquals("ABDC", help.swaplasttwochars("ABCD"));		
	} 
	
	@Test
	public void stringSwap() {
		Assert.assertEquals("SELENIMU", help.swaplasttwochars("SELENIUM"));		
	} 
	
	@Test
	public void stringSwap1CharOnly() {
		Assert.assertEquals("A", help.swaplasttwochars("A"));		
	} 
	
	@Test
	public void stringSwap0Char() {
		Assert.assertEquals("", help.swaplasttwochars(""));
		
	} 
}
