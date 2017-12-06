package com.crunchify.restjersey;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.crunchify.model.MissionProperties;


@Path("/allMissions")
public class AllMissionService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public MissionProperties[] getAllMissions() throws IOException {
		MissionProperties missionProperties = new MissionProperties(50, 20, false, "Mission impossible", 1, 106);
		MissionProperties missionProperties1 = new MissionProperties(0, 20, false, "Ayþe tatile çýksýn", 1, 105);
		MissionProperties missionProperties2 = new MissionProperties(10, 20, false, "Mission 9", 1, 101);
		MissionProperties missionProperties3 = new MissionProperties(220, 20, false, "Mission 8", 1, 1000);
		MissionProperties missionPropertiesList [] = {missionProperties, missionProperties1,missionProperties2,missionProperties3};
	
		return missionPropertiesList;
	}
}
