package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.dao.truyenDao;

public class test {

	public static void main(String[] args) {
 
		truyenDao t = new truyenDao();
		try {
			 
			t.addComment("daqua pessi oi", 3, 2, new SimpleDateFormat("yyyy-MM-dd").parse("2011-01-18"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
