package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Nguoidung;
import com.model.Tacgia;
import com.util.SessionUtil;

public class dangnhapDao {
	 
	public List<Nguoidung> getAll(){
		Session ses = SessionUtil.createFac().openSession();
		//Query query=ses.createQuery("From Chuong c where c.tap.matap=2");
		Query query=ses.createQuery("From Nguoidung");
		List<Nguoidung> dsnguoidung= query.list();
		ses.close();
		return dsnguoidung;
	}
}
