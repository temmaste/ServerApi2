package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Chuong;
import com.model.Tacgia;
import com.model.Tap;
import com.util.SessionUtil;

public class chuongDao {
	public chuongDao() {};
	public List<Tacgia> getAll(){
		Session ses = SessionUtil.createFac().openSession();
		//Query query=ses.createQuery("From Chuong c where c.tap.matap=2");
		Query query=ses.createQuery("From Tacgia");
		List<Tacgia> dsChuong= query.list();
		ses.close();
		return dsChuong;
	}
}
