package com.fisherpaykel.signature;

import com.fisherpaykel.entity.InputForm;

public interface DigitalSignature {
	public String getFormValue(InputForm form);
	public byte[] generateSignature(String formValue);
}
