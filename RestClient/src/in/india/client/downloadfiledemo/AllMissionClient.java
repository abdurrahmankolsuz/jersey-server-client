package in.india.client.downloadfiledemo;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class AllMissionClient {
	 public static void main(String[] args) {

	        ClientConfig clientConfig = new DefaultClientConfig();
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
	        Client client = Client.create(clientConfig);

	        String getBookURL = "http://localhost:8090/Test/crunchify/allMissions";
	        WebResource webResourceGet = client.resource(getBookURL);
	        ClientResponse response = webResourceGet.accept("application/json").get(ClientResponse.class);
	    	String output = response.getEntity(String.class);
	        
			Type listType = new TypeToken<ResponseAllMissions>(){}.getType();
			ResponseAllMissions responseAllMissions =new Gson().fromJson(output, listType);

	        if (response.getStatus() != 200) {
	            System.out.println("Baðlantý Hatasý");
	        }

	        System.out.println(responseAllMissions.missionProperties().get(0).missionname);
	    }
	}

