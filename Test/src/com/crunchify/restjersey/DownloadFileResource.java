package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.multipart.MultiPart;


@Path("/downloadfile")
@Produces("multipart/mixed")
public class DownloadFileResource {

    @GET
    public Response getFile() {

        java.io.File objFile = new java.io.File(
                "C:/Desert.jpg");
        MultiPart objMultiPart = new MultiPart();
        objMultiPart.type(new MediaType("multipart", "mixed"));
        objMultiPart
                .bodyPart(objFile.getName(), new MediaType("text", "plain"));
        objMultiPart.bodyPart("" + objFile.length(), new MediaType("text",
                "plain"));
        objMultiPart.bodyPart(objFile, new MediaType("multipart", "mixed"));

        return Response.ok(objMultiPart).build();

    }

}
