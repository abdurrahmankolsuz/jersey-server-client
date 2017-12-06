package com.sunn;

import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Start {
	
	public static void main(String[] args) throws IOException {
	    new Start().doMain();
	}

	 
	public void doMain (){
		URI baseUri = UriBuilder.fromUri("http://localhost/").port(2222).build();
		ResourceConfig resourceConfig = new ResourceConfig(RestResource.class);
		final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
		Scanner scanner = new Scanner(System.in);
	    String sentence = scanner.next();
	    if(sentence.equalsIgnoreCase("shutdown")) {
	    	server.shutdownNow();
	    }

	}
	
}
