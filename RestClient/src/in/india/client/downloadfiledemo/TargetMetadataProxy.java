package in.india.client.downloadfiledemo;

import java.util.ArrayList;


public class TargetMetadataProxy {
	int                       frameHeight;
	int                       frameWidth;
	ArrayList<DrawableTarget> targetHistories;
	ArrayList<TargetProxy>    targets;
	int                       totalNumberOfTargetsDetected;
	
	public TargetMetadataProxy() {
	}

	public TargetMetadataProxy(int frameHeight, int frameWidth,
	        ArrayList<DrawableTarget> targetHistories,
	        ArrayList<TargetProxy> targets, int totalNumberOfTargetsDetected) {
		super();
		this.frameHeight = frameHeight;
		this.frameWidth = frameWidth;
		this.targetHistories = targetHistories;
		this.targets = targets;
		this.totalNumberOfTargetsDetected = totalNumberOfTargetsDetected;
	}

	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}

	public int getFrameWidth() {
		return frameWidth;
	}

	public void setFrameWidth(int frameWidth) {
		this.frameWidth = frameWidth;
	}

	public ArrayList<DrawableTarget> getTargetHistories() {
		return targetHistories;
	}

	public void setTargetHistories(ArrayList<DrawableTarget> targetHistories) {
		this.targetHistories = targetHistories;
	}

	public ArrayList<TargetProxy> getTargets() {
		return targets;
	}

	public void setTargets(ArrayList<TargetProxy> targets) {
		this.targets = targets;
	}

	public int getTotalNumberOfTargetsDetected() {
		return totalNumberOfTargetsDetected;
	}

	public void setTotalNumberOfTargetsDetected(int totalNumberOfTargetsDetected) {
		this.totalNumberOfTargetsDetected = totalNumberOfTargetsDetected;
	}
}
