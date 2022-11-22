package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Chuong;
import com.util.SessionUtil;

public class chuongDao {
	public chuongDao() {};
	public List<Chuong> getAll(){
		Session ses = SessionUtil.createFac().openSession();
		Query query=ses.createQuery("From Chuong");
		List<Chuong> dsChuong = query.list();
		ses.close();
		return dsChuong;
	}
}
