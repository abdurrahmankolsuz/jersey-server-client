package com.crunchify.model;

public class DrawableTarget {
	int frameId;
	int targetId;
	int x;
	int y;

	public DrawableTarget(int frameId, int targetId, int x, int y) {
		super();
		this.frameId = frameId;
		this.targetId = targetId;
		this.x = x;
		this.y = y;
	}

	public int getFrameId() {
		return frameId;
	}

	public void setFrameId(int frameId) {
		this.frameId = frameId;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
