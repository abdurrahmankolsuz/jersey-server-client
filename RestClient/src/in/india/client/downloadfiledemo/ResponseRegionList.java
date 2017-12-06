package in.india.client.downloadfiledemo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

public class ResponseRegionList {
	List<Region>  data;
	EnumResponseStatus responseStatus;

	public ResponseRegionList() {

	}

	public ResponseRegionList(ArrayList<Region> data,
	        EnumResponseStatus responseStatus) {
		super();
		this.data = data;
		this.responseStatus = responseStatus;
	}

	public List<Region> getData() {
		return data;
	}

	public void setData(List<Region> data) {
		this.data = data;
	}

	public EnumResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(EnumResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
}
