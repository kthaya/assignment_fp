package com.fisherpaykel.signature;

import com.fisherpaykel.entity.InputForm;

public abstract class DigitalSignatureImpl implements DigitalSignature {

	@Override
	public String getFormValue(InputForm form) {

		StringBuilder sb = new StringBuilder();
        sb.append(form.getName());
        sb.append(form.getEmail());
        sb.append(form.getAddress());
        sb.append(form.getApplicationID());
        
        return sb.toString();
	}

}
