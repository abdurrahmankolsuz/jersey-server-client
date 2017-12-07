# RESTful Web Services

Basic useful feature list:

 * Included rest services implemented by Jersey 2 + Tomcat 8
 * Included rest services implemented by jersey grizzly2-http
 * Jersey + Google Gson  
 * Data Transfer with bson4jackson

And here's some code! :+1:

```
		ClientConfig clientConfig = new DefaultClientConfig();
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
	        Client client = Client.create(clientConfig);

	        String getURL = "http://localhost:8080/allMissions";
	        WebResource webResourceGet = client.resource(getURL);
	        ClientResponse response = webResourceGet.accept("application/json").get(ClientResponse.class);
	    	String output = response.getEntity(String.class);
	        
		Type listType = new TypeToken<ResponseAllMissions>(){}.getType();
		ResponseAllMissions responseAllMissions =new Gson().fromJson(output, listType);
```

This is [on GitHub](https://github.com/jbt/markdown-editor) so let me know if I've burked it somewhere.



### Stuff used to make this:

 * [markdown-it](https://github.com/markdown-it/markdown-it) for Markdown parsing
 * [CodeMirror](http://codemirror.net/) for the awesome syntax-highlighted editor
