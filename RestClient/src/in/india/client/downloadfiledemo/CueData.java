package in.india.client.downloadfiledemo;

public class CueData {
	GeoCoordinate cuePosition;
	int           epochTime;

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

	public int getEpochTime() {
		return epochTime;
	}

	public void setEpochTime(int epochTime) {
		this.epochTime = epochTime;
	}
}
