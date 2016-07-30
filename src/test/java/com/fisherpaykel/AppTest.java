package com.fisherpaykel;

import org.junit.Test; // for @Test

import com.fisherpaykel.constant.GlobalConstant;
import com.fisherpaykel.entity.InputForm;
import com.fisherpaykel.signature.DigitalSignature;
import com.fisherpaykel.signature.RSADigitalSignatureImpl;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	@Test
    public void testFormValue()
    {
    	InputForm inputForm = new InputForm("FisherPaykel", "Test@fisherpaykel.com", 
        		"78 Spring road", GlobalConstant.ApplicationID);
    	
    	DigitalSignature dg = new RSADigitalSignatureImpl();
        
        assertTrue("FisherPaykelTest@fisherpaykel.com78 Spring roadDOTCOM".equals(
        		dg.getFormValue(inputForm)));
    }
	
	@Test
    public void testSignature()
    {
    	//TODO
    }
    
}
