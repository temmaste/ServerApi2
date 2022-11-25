package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Nguoidung;
import com.model.Tacgia;
import com.util.SessionUtil;

public class dangnhapDao {
	 
	public List<Nguoidung> getAll(){
		Session ses = SessionUtil.createFac().openSession();
		Query query=ses.createQuery("From Nguoidung");
		List<Nguoidung> dsnguoidung= query.list();
		ses.close();
		return dsnguoidung;
	}
	public void SignUp(String name,String username,String password) {
		Session ses = SessionUtil.createFac().openSession();
		ses.beginTransaction();
		Nguoidung nd = new Nguoidung();
		nd.setTentaikhoan(username);
		nd.setMatkhau(password);
		nd.setTennguoidung(name);
		ses.save(nd);
		ses.getTransaction().commit();
		ses.close();
	}
}
