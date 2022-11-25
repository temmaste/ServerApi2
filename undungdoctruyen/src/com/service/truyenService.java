package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.dao.chuongDao;
import com.dao.truyenDao;
import com.model.Tacgia;
import com.model.Truyen;

@Path("/truyen")
public class truyenService {
	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_JSON})
	public Truyen getIdTruyen(@QueryParam("id")int id){
		id=id-1;
		return new truyenDao().getAll().get(id);
	}
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public List<Truyen> getAll(){
		return new truyenDao().getAll();
	}
	
}
