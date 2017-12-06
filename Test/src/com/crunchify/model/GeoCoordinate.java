package com.crunchify.model;

public class GeoCoordinate {

	double height;
	double lat;
	double lon;

	public GeoCoordinate() {
	}

	public GeoCoordinate(double height, double lat, double lon) {
		super();
		this.height = height;
		this.lat = lat;
		this.lon = lon;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

}
