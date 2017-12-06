package in.india.client.downloadfiledemo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

import de.undercouch.bson4jackson.BsonFactory;

public class DownloadFileClient {
	public String clientId = "1510057515771";
	public String chipoutId = "1";
	public String framesize = "9424,9653";
	public String regionSize = "500,500";
	public String regionOffset = "0,0";
	public String imageQuality = "50";
	public String targetname = "2;;-1";
	public String lastReceivedFrameIdentifier = "-1";
	
	private static final String BASE_URI = "http://localhost:8090/Test/crunchify/chipout";

	public DownloadFileClient() throws IOException {

		try {
			Client client = Client.create();
			WebResource objWebResource = client.resource(BASE_URI);
			ClientResponse response = objWebResource.path("/").queryParam("clientId", clientId)
					.queryParam("chipoutId", chipoutId).queryParam("framesize", framesize)
					.queryParam("regionSize", regionSize).queryParam("regionOffset", regionOffset)
					.queryParam("imageQuality", imageQuality).queryParam("targetname", targetname)
					.queryParam("lastReceivedFrameIdentifier",lastReceivedFrameIdentifier)
					.type(javax.ws.rs.core.MediaType.APPLICATION_OCTET_STREAM).get(ClientResponse.class);

			System.out.println("response : " + response);
			if (response.getStatus() == Status.OK.getStatusCode() && response.hasEntity()) {
		
			ObjectMapper mapper = new ObjectMapper(new BsonFactory()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);	

			ResponseChipoutImage chipoutImage = mapper.readValue(response.getEntityInputStream(), ResponseChipoutImage.class);
			System.out.println(chipoutImage.getResponseStatus());
			
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(chipoutImage.getData().getImageBuffer()));
			File outputfile = new File("C://Users/abdurrahman.kolsuz/Desktop/apo.jpg");
			ImageIO.write(img, "jpg", outputfile);
	
			}
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		}
	

	}
	
	public static void main(String... args) throws IOException {
		new DownloadFileClient();
	}

}
