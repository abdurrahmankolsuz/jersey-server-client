package com.crunchify.model;

public class TargetProxy {
	int           boundingBoxBottomRightPixelNumber;
	int           boundingBoxHeight;
	int           boundingBoxTopLeftPixelNumber;
	int           boundingBoxWidth;
	int           boundingBoxX;
	int           boundingBoxY;
	GeoCoordinate geoCoordinate;
	double        speed;
	int           targetId;

	public TargetProxy(int boundingBoxBottomRightPixelNumber,
	        int boundingBoxHeight, int boundingBoxTopLeftPixelNumber,
	        int boundingBoxWidth, int boundingBoxX, int boundingBoxY,
	        GeoCoordinate geoCoordinate, double speed, int targetId) {
		super();
		this.boundingBoxBottomRightPixelNumber = boundingBoxBottomRightPixelNumber;
		this.boundingBoxHeight = boundingBoxHeight;
		this.boundingBoxTopLeftPixelNumber = boundingBoxTopLeftPixelNumber;
		this.boundingBoxWidth = boundingBoxWidth;
		this.boundingBoxX = boundingBoxX;
		this.boundingBoxY = boundingBoxY;
		this.geoCoordinate = geoCoordinate;
		this.speed = speed;
		this.targetId = targetId;
	}

	public int getBoundingBoxBottomRightPixelNumber() {
		return boundingBoxBottomRightPixelNumber;
	}

	public void setBoundingBoxBottomRightPixelNumber(
	        int boundingBoxBottomRightPixelNumber) {
		this.boundingBoxBottomRightPixelNumber = boundingBoxBottomRightPixelNumber;
	}

	public int getBoundingBoxHeight() {
		return boundingBoxHeight;
	}

	public void setBoundingBoxHeight(int boundingBoxHeight) {
		this.boundingBoxHeight = boundingBoxHeight;
	}

	public int getBoundingBoxTopLeftPixelNumber() {
		return boundingBoxTopLeftPixelNumber;
	}

	public void setBoundingBoxTopLeftPixelNumber(
	        int boundingBoxTopLeftPixelNumber) {
		this.boundingBoxTopLeftPixelNumber = boundingBoxTopLeftPixelNumber;
	}

	public int getBoundingBoxWidth() {
		return boundingBoxWidth;
	}

	public void setBoundingBoxWidth(int boundingBoxWidth) {
		this.boundingBoxWidth = boundingBoxWidth;
	}

	public int getBoundingBoxX() {
		return boundingBoxX;
	}

	public void setBoundingBoxX(int boundingBoxX) {
		this.boundingBoxX = boundingBoxX;
	}

	public int getBoundingBoxY() {
		return boundingBoxY;
	}

	public void setBoundingBoxY(int boundingBoxY) {
		this.boundingBoxY = boundingBoxY;
	}

	public GeoCoordinate getGeoCoordinate() {
		return geoCoordinate;
	}

	public void setGeoCoordinate(GeoCoordinate geoCoordinate) {
		this.geoCoordinate = geoCoordinate;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

}
