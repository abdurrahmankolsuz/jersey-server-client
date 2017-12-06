package com.crunchify.model;

public class ImageAttribute {
	int    frameHeight;
	int    rameWidth;
	int    regionHeight;
	String regionName;
	int    regionWidth;
	int    regionX;
	int    regionY;
	String targetName;

	public ImageAttribute(int frameHeight, int rameWidth, int regionHeight,
	        String regionName, int regionWidth, int regionX, int regionY,
	        String targetName) {
		super();
		this.frameHeight = frameHeight;
		this.rameWidth = rameWidth;
		this.regionHeight = regionHeight;
		this.regionName = regionName;
		this.regionWidth = regionWidth;
		this.regionX = regionX;
		this.regionY = regionY;
		this.targetName = targetName;
	}

	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}

	public int getRameWidth() {
		return rameWidth;
	}

	public void setRameWidth(int rameWidth) {
		this.rameWidth = rameWidth;
	}

	public int getRegionHeight() {
		return regionHeight;
	}

	public void setRegionHeight(int regionHeight) {
		this.regionHeight = regionHeight;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getRegionWidth() {
		return regionWidth;
	}

	public void setRegionWidth(int regionWidth) {
		this.regionWidth = regionWidth;
	}

	public int getRegionX() {
		return regionX;
	}

	public void setRegionX(int regionX) {
		this.regionX = regionX;
	}

	public int getRegionY() {
		return regionY;
	}

	public void setRegionY(int regionY) {
		this.regionY = regionY;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

}
