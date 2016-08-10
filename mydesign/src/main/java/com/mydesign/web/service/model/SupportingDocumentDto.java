package com.mydesign.web.service.model;

import java.io.File;
import java.io.Serializable;

public class SupportingDocumentDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6436580140896130037L;
	
	public SupportingDocumentDto(String documentName, String mimeType){
		this.documentName=documentName;
		this.mimeType=mimeType;
	}
	
	public SupportingDocumentDto(){
	}
	
	private String documentName;
	
	private String mimeType;
	
	private File file;

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
