package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;


import com.model.Truyen;
import com.util.SessionUtil;
import java.util.List;



public class truyenDao {
	public truyenDao() {};
	public List<Truyen>getAll(){
		Session ses = SessionUtil.createFac().openSession();
		Query query=ses.createQuery("From Truyen");
		List<Truyen> dsTruyen= query.list();
		ses.close();
		return dsTruyen;
	}
}
