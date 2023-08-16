package com.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.base.StringSwapHelper;
public class StringSwap {
	
	@Test
	public void stringSwap2charsOnly() {
		StringSwapHelper help=new StringSwapHelper();
		Assert.assertEquals("BA", help.swaplasttwochars("AB"));
		
	} 
	
	@Test
	public void stringSwap4chars() {
		StringSwapHelper help=new StringSwapHelper();
		Assert.assertEquals("ABDC", help.swaplasttwochars("ABCD"));
		
	} 
	
	@Test
	public void stringSwap() {
		StringSwapHelper help=new StringSwapHelper();
		Assert.assertEquals("SELENIMU", help.swaplasttwochars("SELENIUM"));
		
	} 
	
	@Test
	public void stringSwap1CharOnly() {
		StringSwapHelper help=new StringSwapHelper();
		Assert.assertEquals("A", help.swaplasttwochars("A"));
		
	} 
	
	@Test
	public void stringSwap0Char() {
		StringSwapHelper help=new StringSwapHelper();
		Assert.assertEquals("", help.swaplasttwochars(""));
		
	} 
}
