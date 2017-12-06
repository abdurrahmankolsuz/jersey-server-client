package in.india.client.downloadfiledemo;

import java.util.ArrayList;


public class HomographyData {
	ArrayList<Double> homography;
	int               referenceFrame;

	
	public HomographyData() {
	}
	public HomographyData(ArrayList<Double> homography, int referenceFrame) {
		super();
		this.homography = homography;
		this.referenceFrame = referenceFrame;
	}

	public ArrayList<Double> getHomography() {
		return homography;
	}

	public void setHomography(ArrayList<Double> homography) {
		this.homography = homography;
	}

	public int getReferenceFrame() {
		return referenceFrame;
	}

	public void setReferenceFrame(int referenceFrame) {
		this.referenceFrame = referenceFrame;
	}

}
