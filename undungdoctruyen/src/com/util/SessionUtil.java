package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	public static SessionFactory sesfac = new Configuration().configure().buildSessionFactory();
	public static SessionFactory createFac() {
		return sesfac;
	}
}
