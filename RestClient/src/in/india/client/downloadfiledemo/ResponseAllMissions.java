package in.india.client.downloadfiledemo;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class ResponseAllMissions {
	
	    @SerializedName("missionProperties")
	    private ArrayList<MissionProperties> missionProperties;

	    public ArrayList<MissionProperties> missionProperties() {
	        return missionProperties;
	    }
	
}
