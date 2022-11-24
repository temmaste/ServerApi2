package com.service;

import java.util.List;

import javax.ws.rs.GET;
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
}
