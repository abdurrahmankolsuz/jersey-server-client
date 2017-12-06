package com.crunchify.restjersey;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.crunchify.model.EnumResponseStatus;
import com.crunchify.model.GeoCoordinate;
import com.crunchify.model.Region;
import com.crunchify.model.ResponseRegionList;

@Path("/regions/alarm")
public class AlarmRegionService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseRegionList getRegionAlarms(){

		GeoCoordinate geoCoordinate = new GeoCoordinate(1, 30, 40);
		GeoCoordinate geoCoordinate1 = new GeoCoordinate(2, 60, 40);
		GeoCoordinate geoCoordinate2 = new GeoCoordinate(10, 60, 80);
		GeoCoordinate geoCoordinate3 = new GeoCoordinate(11, 35, 45);
		
		ArrayList<GeoCoordinate> coordinates = new ArrayList<>();
		coordinates.add(geoCoordinate3);
		coordinates.add(geoCoordinate2);
		coordinates.add(geoCoordinate1);
		coordinates.add(geoCoordinate);
		
		Region region = new Region(true, 1, "TEKNOKENT", coordinates);
		Region region1 = new Region(true, 1, "EMEK", coordinates);
		
		ArrayList<Region> regions = new ArrayList<>();
		regions.add(region);
		regions.add(region1);
		ResponseRegionList responseRegionList = new ResponseRegionList(regions, EnumResponseStatus.OK);
	
		return responseRegionList;
	}
}
