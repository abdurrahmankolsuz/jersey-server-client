package in.india.client.downloadfiledemo;


public class ChipoutImage {
	int               frameIdentifier;
	HomographyData    homographyData;
	ImageAttribute    imageAttribute;
	byte[]            imageBuffer;
	EnumImageStatus   imageStatus;
	MetadataProxy     metadataProxy;
	MissionProperties missionProperties;
	ImageAttribute    requestedImageAttribute;

	public ChipoutImage() {
		
	}
	public ChipoutImage(int frameIdentifier, HomographyData homographyData,
	        ImageAttribute imageAttribute, byte[] imageBuffer,
	        EnumImageStatus imageStatus, MetadataProxy metadataProxy,
	        MissionProperties missionProperties,
	        ImageAttribute requestedImageAttribute) {
		super();
		this.frameIdentifier = frameIdentifier;
		this.homographyData = homographyData;
		this.imageAttribute = imageAttribute;
		this.imageBuffer = imageBuffer;
		this.imageStatus = imageStatus;
		this.metadataProxy = metadataProxy;
		this.missionProperties = missionProperties;
		this.requestedImageAttribute = requestedImageAttribute;
	}

	public int getFrameIdentifier() {
		return frameIdentifier;
	}

	public void setFrameIdentifier(int frameIdentifier) {
		this.frameIdentifier = frameIdentifier;
	}

	public HomographyData getHomographyData() {
		return homographyData;
	}

	public void setHomographyData(HomographyData homographyData) {
		this.homographyData = homographyData;
	}

	public ImageAttribute getImageAttribute() {
		return imageAttribute;
	}

	public void setImageAttribute(ImageAttribute imageAttribute) {
		this.imageAttribute = imageAttribute;
	}

	public byte[] getImageBuffer() {
		return imageBuffer;
	}

	public void setImageBuffer(byte[] imageBuffer) {
		this.imageBuffer = imageBuffer;
	}

	public EnumImageStatus getImageStatus() {
		return imageStatus;
	}

	public void setImageStatus(EnumImageStatus imageStatus) {
		this.imageStatus = imageStatus;
	}

	public MetadataProxy getMetadataProxy() {
		return metadataProxy;
	}

	public void setMetadataProxy(MetadataProxy metadataProxy) {
		this.metadataProxy = metadataProxy;
	}

	public MissionProperties getMissionProperties() {
		return missionProperties;
	}

	public void setMissionProperties(MissionProperties missionProperties) {
		this.missionProperties = missionProperties;
	}

	public ImageAttribute getRequestedImageAttribute() {
		return requestedImageAttribute;
	}

	public void setRequestedImageAttribute(
	        ImageAttribute requestedImageAttribute) {
		this.requestedImageAttribute = requestedImageAttribute;
	}

}
