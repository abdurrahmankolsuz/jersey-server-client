package com.crunchify.model;


public class ResponseChipoutImage {
	ChipoutImage       data;
	EnumResponseStatus responseStatus;

	public ResponseChipoutImage() {

	}

	public ResponseChipoutImage(ChipoutImage data,
	        EnumResponseStatus responseStatus) {
		super();
		this.data = data;
		this.responseStatus = responseStatus;
	}

	public ChipoutImage getData() {
		return data;
	}

	public void setData(ChipoutImage data) {
		this.data = data;
	}

	public EnumResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(EnumResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
}
