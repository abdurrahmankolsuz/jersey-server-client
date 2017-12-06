package com.crunchify.restjersey;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import com.crunchify.model.ChipoutImage;
import com.crunchify.model.DrawableTarget;
import com.crunchify.model.EnumImageStatus;
import com.crunchify.model.EnumResponseStatus;
import com.crunchify.model.GeoCoordinate;
import com.crunchify.model.HomographyData;
import com.crunchify.model.ImageAttribute;
import com.crunchify.model.MetadataProxy;
import com.crunchify.model.MissionProperties;
import com.crunchify.model.ResponseChipoutImage;
import com.crunchify.model.TargetMetadataProxy;
import com.crunchify.model.TargetProxy;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.undercouch.bson4jackson.BsonFactory;

@Path("/chipout")
@Produces(MediaType.APPLICATION_OCTET_STREAM)
public class GetChipoutImage {

	@GET
	public Response getFile(@QueryParam("chipoutId") String chipoutId, @QueryParam("clientId") String clientId,
			@QueryParam("fps") String fps, @QueryParam("frameSize") String frameSize,
			@QueryParam("imageQuality") int imageQuality,
			@QueryParam("lastReceivedFrameIdentifier") String lastReceivedFrameIdentifier,
			@QueryParam("playOption") PlayOption playOption, @QueryParam("playSpeed") int playSpeed,
			@QueryParam("regionOffset") String regionOffset, @QueryParam("regionSize") String regionSize,
			@QueryParam("targetName") String targetName) throws IOException {

		System.out.println("chipoutId " + chipoutId + " clientId " + clientId);
		File file = new File("C:\\Users\\abdurrahman.kolsuz\\Desktop\\test.jpg");
		BufferedImage image2 = ImageIO.read(file);

		ByteArrayOutputStream bos  = new ByteArrayOutputStream();
		ImageIO.write(image2, "jpg", bos);
		
		ArrayList<Double> homography = new ArrayList<Double>();
		homography.add(1.38);
		homography.add(2.56);
		GeoCoordinate geoCoordinate = new GeoCoordinate(2.0, 3.0, 5.0);
		TargetProxy targetProxy = new TargetProxy(1, 1, 1, 1, 1, 1, geoCoordinate, 1.0, 1);
		DrawableTarget drawableTarget = new DrawableTarget(1, 1, 10, 10);
		ImageAttribute imageAttribute = new ImageAttribute(1, 1, 1, "Apo", 1, 5, 5, "Krezus");
		MissionProperties missionProperties = new MissionProperties(1, 1, true, "Rose", 1, 20);
		HomographyData homographyData = new HomographyData(homography, 1);

		ArrayList<TargetProxy> targets = new ArrayList<TargetProxy>();
		ArrayList<GeoCoordinate> cornerPositions = new ArrayList<GeoCoordinate>();

		ArrayList<DrawableTarget> targetHistories = new ArrayList<DrawableTarget>();
		targets.add(targetProxy);
		targetHistories.add(drawableTarget);
		cornerPositions.add(geoCoordinate);
		TargetMetadataProxy targetMetadataProxy = new TargetMetadataProxy(1, 1, targetHistories, targets, 1);
		MetadataProxy metadataProxy = new MetadataProxy(cornerPositions, 2.2, 3.0, 4.0, geoCoordinate, 100,
				targetMetadataProxy, 55);

		ChipoutImage chipoutImage = new ChipoutImage(1, homographyData, imageAttribute, bos.toByteArray(),
				EnumImageStatus.AVAILABLE, metadataProxy, missionProperties, imageAttribute);

		ResponseChipoutImage responseChipoutImage = new ResponseChipoutImage(chipoutImage, EnumResponseStatus.OK);


		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream output) throws IOException {
				try {
					// ImageIO.write(image2, "jpg", output);
					// new ObjectOutputStream(output).writeObject(person);

					ObjectMapper mapper = new ObjectMapper(new BsonFactory());
					mapper.writeValue(output, responseChipoutImage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		return Response.ok(stream, "application/octet-stream") // TODO: set content-type of your file
				.header("content-disposition", "attachment; filename = " + image2.toString()).build();
	}
}
