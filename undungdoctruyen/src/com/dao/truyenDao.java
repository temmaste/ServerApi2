package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Binhluan;
import com.model.Nguoidung;
import com.model.Truyen;
import com.util.SessionUtil;

import java.util.Date;
import java.util.List;



public class truyenDao {
	
	public List<Truyen>getAll(){
		Session ses = SessionUtil.createFac().openSession();
		Query query=ses.createQuery("From Truyen");
		List<Truyen> dsTruyen= query.list();
		ses.close();
		return dsTruyen;
	}
	
	public Truyen getIdTruyen(int id) {
		Session ses = SessionUtil.createFac().openSession();
		ses.beginTransaction();
		Truyen tr =(Truyen) ses.get(Truyen.class, id);
		ses.close();
		return tr;
	}
	public Nguoidung getIdNguoidung(int id) {
		Session ses = SessionUtil.createFac().openSession();
		ses.beginTransaction();
		Nguoidung tr =(Nguoidung) ses.get(Nguoidung.class, id);
		ses.close();
		return tr;
	}
	
	public void addComment(String message,int manguoidung,int matruyen,Date ngaydang) {
		
		Session ses = SessionUtil.createFac().openSession();
		ses.beginTransaction();
		Binhluan bl = new Binhluan();
		bl.setMessage(message);
		bl.setNgaydang(ngaydang);
		bl.setTruyen(getIdTruyen(matruyen));
		bl.setNguoidung(getIdNguoidung(manguoidung));
		ses.save(bl);
		ses.getTransaction().commit();
		ses.close();
		
	}
}
