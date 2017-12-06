package in.india.client.downloadfiledemo;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ExcludedRegionClient {
	 public static void main(String[] args) {

		 	Client client = Client.create();

	        String getBookURL = "http://localhost:8090/Test/crunchify/regions/excluded";
	        WebResource webResourceGet = client.resource(getBookURL);
	        ClientResponse response = webResourceGet.accept("application/json").get(ClientResponse.class);
	    	String output = response.getEntity(String.class);
	        
			Type listType = new TypeToken<ResponseRegionList>(){}.getType();
			ResponseRegionList regionList =new Gson().fromJson(output, listType);

	        if (response.getStatus() != 200) {
	            System.out.println("Baðlantý Hatasý");
	        }

	        System.out.println(regionList.getData().get(0).getName());
	    }
	}

