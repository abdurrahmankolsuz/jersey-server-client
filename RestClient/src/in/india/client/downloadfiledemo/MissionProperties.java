package in.india.client.downloadfiledemo;

import java.util.List;


import com.fasterxml.jackson.core.type.TypeReference;

public class MissionProperties {
	int     endindex;
	int     endtime;
	boolean isLive;
	String  missionname;
	int     startindex;
	int     starttime;

	public MissionProperties() {

	}

	public MissionProperties(int endindex, int endtime, boolean isLive,
	        String missionname, int startindex, int starttime) {
		super();
		this.endindex = endindex;
		this.endtime = endtime;
		this.isLive = isLive;
		this.missionname = missionname;
		this.startindex = startindex;
		this.starttime = starttime;
	}

	public int getEndindex() {
		return endindex;
	}

	public void setEndindex(int endindex) {
		this.endindex = endindex;
	}

	public int getEndtime() {
		return endtime;
	}

	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public String getMissionname() {
		return missionname;
	}

	public void setMissionname(String missionname) {
		this.missionname = missionname;
	}

	public int getStartindex() {
		return startindex;
	}

	public void setStartindex(int startindex) {
		this.startindex = startindex;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	private static final TypeReference<MissionProperties> typeRef = new TypeReference<MissionProperties>() {
	                                                              };

	public static TypeReference<MissionProperties> typeRef() {
		return typeRef;
	}

	private static final TypeReference<List<MissionProperties>> listTypeRef = new TypeReference<List<MissionProperties>>() {
	                                                                        };

	public static TypeReference<List<MissionProperties>> listTypeRef() {
		return listTypeRef;
	}
}
