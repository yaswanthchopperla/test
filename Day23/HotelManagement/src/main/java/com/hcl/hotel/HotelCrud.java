package com.hcl.hotel;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class HotelCrud {
	 public static String RoomId(){
	    	SessionFactory sf=HibernateUtil.getConnection();
	    	Session s=sf.openSession();
	    	Query q=s.createQuery("select MAX(RoomID) from Room");
	    	List<String> lst=q.list();
	    	String Rid="";
	    	Rid=lst.get(0);
	    	if(lst==null) {
	    		Rid="R001";
	    	} else {
	    	//fid=f.getFid();
			int id=Integer.parseInt(Rid.substring(1));
			id++;
			String formatted = String.format("%03d", id);
			Rid = "R"+formatted;	
	    }
	    return Rid;
	    }
public static String addRoom(Room obj) {
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	obj.setRoomID(HotelCrud.RoomId());
	Transaction t=s.beginTransaction();
	s.save(obj);
	t.commit();
	return "Room Added";
}
}
