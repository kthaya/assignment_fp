package com.fisherpaykel.signature;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;

public class RSADigitalSignatureImpl extends DigitalSignatureImpl {

	public byte[] generateSignature(String formValue) {	
        
		KeyPairGenerator kpg;
		byte[] data;
		byte[] signatureBytes = new byte[0];		
		
		try {
			kpg = KeyPairGenerator.getInstance("RSA");
			kpg.initialize(1024);
			KeyPair keyPair = kpg.genKeyPair();
			data = formValue.toString().getBytes("UTF8");
			Signature signature = Signature.getInstance("MD5WithRSA");
			
			signature = Signature.getInstance("MD5WithRSA");
			signature.initSign(keyPair.getPrivate());
			signature.update(data);
			signature.initVerify(keyPair.getPublic());
			signature.initVerify(keyPair.getPublic());
			signature.update(data);
			
			signatureBytes = signature.sign();
			
		} catch (NoSuchAlgorithmException|
				UnsupportedEncodingException|
				InvalidKeyException|
				SignatureException e) {
			e.printStackTrace();  // Can use log4j
		}    
	    
		return signatureBytes;
	}

}
