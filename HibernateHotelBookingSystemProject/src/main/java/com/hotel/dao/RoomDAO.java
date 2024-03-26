package com.hotel.dao;

import java.util.List;

import com.hotel.entities.Room;
public interface RoomDAO {

	void insert(Room crobj);
	List<Room> Display();
	public  Room getbyroomid(int roomid);
	/*void search(int carid);
	void update(int carid, int carno, String carName, String model, int capacity, int price, String status);
		*/
}
/*

import java.util.List;

import com.Hotel.entities.Room;
public interface RoomDAO {

	void insert(Room crobj);
	List<Room> Display();
	public static  Room getbyroomid(int roomid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
*/


