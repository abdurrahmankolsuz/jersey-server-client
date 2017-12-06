package com.sunn;

public class CueData {
	GeoCoordinate cuePosition;
	long           epochTime;

	public CueData() {
		// TODO Auto-generated constructor stub
	}

	public CueData(GeoCoordinate cuePosition, int epochTime) {
		super();
		this.cuePosition = cuePosition;
		this.epochTime = epochTime;
	}

	public GeoCoordinate getCuePosition() {
		return cuePosition;
	}

	public void setCuePosition(GeoCoordinate cuePosition) {
		this.cuePosition = cuePosition;
	}

	public long getEpochTime() {
		return epochTime;
	}

	public void setEpochTime(long epochTime) {
		this.epochTime = epochTime;
	}
}
