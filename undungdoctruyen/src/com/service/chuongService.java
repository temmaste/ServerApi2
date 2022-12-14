package com.service;

 

import com.dao.chuongDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.model.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/chuong")
public class chuongService {
	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_JSON})
	public Tacgia getIdChuong(@QueryParam("id")int id){
		id=id-1;
		return new chuongDao().getAll().get(id);
	}
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public List<Tacgia> getAll(){
		return new chuongDao().getAll();
	}
	
}
