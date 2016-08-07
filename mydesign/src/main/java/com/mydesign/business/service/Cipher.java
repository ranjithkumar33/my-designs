package com.mydesign.business.service;

import org.apache.commons.codec.binary.Base64;

public class Cipher {
	
	  private static final String KEY = "mydesignuserscretpasswordkey07082016";
	 
	  public String encrypt(final String text) {
	    return Base64.encodeBase64String(this.xor(text.getBytes()));
	  }
	  private byte[] xor(final byte[] input) {
	    final byte[] output = new byte[input.length];
	    final byte[] secret = this.KEY.getBytes();
	    int spos = 0;
	    for (int pos = 0; pos < input.length; ++pos) {
	      output[pos] = (byte) (input[pos] ^ secret[spos]);
	      spos += 1;
	      if (spos >= secret.length) {
	        spos = 0;
	      }
	    }
	    return output;
	  }
}
