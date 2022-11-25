package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.model.*;
import com.dao.*;
import com.dao.chuongDao;
import com.model.Tacgia;

@Path("/nguoidung")
public class nguoidungService {
	@GET
	@Path("/dangnhap")
	@Produces({ MediaType.APPLICATION_JSON})
	public Boolean getIdChuong(@QueryParam("username")String username,@QueryParam("password")String password){
		List<Nguoidung> nd = new dangnhapDao().getAll();
		for(Nguoidung usr :nd) {
			if(usr.getTentaikhoan().equals(username)&&usr.getMatkhau().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	//dg dẫn là http://localhost:8080/undungdoctruyen/rest/nguoidung/dangki?name=thinhho&username=thinhsuper&password=kakalok0019
	//bên android code theo đúng đường dẫn
	@POST
	@Path("/dangki")
	@Produces({ MediaType.APPLICATION_JSON})
	public Boolean addAccount(@QueryParam("name")String name,@QueryParam("username")String username,@QueryParam("password")String password){
		dangnhapDao dnd = new dangnhapDao();
		dnd.SignUp(name, username, password);
		//check username password 
		List<Nguoidung> nd = new dangnhapDao().getAll();
		for(Nguoidung usr :nd) {
			if(usr.getTentaikhoan().equals(username)&&usr.getMatkhau().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
}
