package com.crunchify.model;

import java.util.ArrayList;


public class MetadataProxy {
	ArrayList<GeoCoordinate> cornerPositions;
	double                   platformHeadingAngle;
	double                   platformPitchAngle;
	double                   platformRollAngle;
	GeoCoordinate            sensorCoordinate;
	double                   speed;
	TargetMetadataProxy      targetMetadataProxy;
	int                      timeStamp;

	public MetadataProxy(ArrayList<GeoCoordinate> cornerPositions,
	        double platformHeadingAngle, double platformPitchAngle,
	        double platformRollAngle, GeoCoordinate sensorCoordinate,
	        double speed, TargetMetadataProxy targetMetadataProxy, int timeStamp) {
		super();
		this.cornerPositions = cornerPositions;
		this.platformHeadingAngle = platformHeadingAngle;
		this.platformPitchAngle = platformPitchAngle;
		this.platformRollAngle = platformRollAngle;
		this.sensorCoordinate = sensorCoordinate;
		this.speed = speed;
		this.targetMetadataProxy = targetMetadataProxy;
		this.timeStamp = timeStamp;
	}

	public ArrayList<GeoCoordinate> getCornerPositions() {
		return cornerPositions;
	}

	public void setCornerPositions(ArrayList<GeoCoordinate> cornerPositions) {
		this.cornerPositions = cornerPositions;
	}

	public double getPlatformHeadingAngle() {
		return platformHeadingAngle;
	}

	public void setPlatformHeadingAngle(double platformHeadingAngle) {
		this.platformHeadingAngle = platformHeadingAngle;
	}

	public double getPlatformPitchAngle() {
		return platformPitchAngle;
	}

	public void setPlatformPitchAngle(double platformPitchAngle) {
		this.platformPitchAngle = platformPitchAngle;
	}

	public double getPlatformRollAngle() {
		return platformRollAngle;
	}

	public void setPlatformRollAngle(double platformRollAngle) {
		this.platformRollAngle = platformRollAngle;
	}

	public GeoCoordinate getSensorCoordinate() {
		return sensorCoordinate;
	}

	public void setSensorCoordinate(GeoCoordinate sensorCoordinate) {
		this.sensorCoordinate = sensorCoordinate;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public TargetMetadataProxy getTargetMetadataProxy() {
		return targetMetadataProxy;
	}

	public void setTargetMetadataProxy(TargetMetadataProxy targetMetadataProxy) {
		this.targetMetadataProxy = targetMetadataProxy;
	}

	public int getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}

}
