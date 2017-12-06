package in.india.client.downloadfiledemo;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class Alarm {
	String        description;
	int           epochTime;
	GeoCoordinate geoPosition;

	public Alarm() {
	}

	public Alarm(String description, int epochTime, GeoCoordinate geoPosition) {
		super();
		this.description = description;
		this.epochTime = epochTime;
		this.geoPosition = geoPosition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEpochTime() {
		return epochTime;
	}

	public void setEpochTime(int epochTime) {
		this.epochTime = epochTime;
	}

	public GeoCoordinate getGeoPosition() {
		return geoPosition;
	}

	public void setGeoPosition(GeoCoordinate geoPosition) {
		this.geoPosition = geoPosition;
	}

}
