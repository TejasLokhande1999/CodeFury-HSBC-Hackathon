package com.AMRApp.service;

import java.util.List;

import com.AMRApp.beans.Meeting;
import com.AMRApp.beans.User;
import com.AMRApp.dao.ManagerHomePageDAO;
import com.AMRApp.dao.ManagerHomePageDAOInterface;
import com.AMRApp.factory.Factory;

public class ManagerHomePageService implements ManagerHomePageServiceInterface {

	ManagerHomePageDAOInterface mdao= null;
	public ManagerHomePageService()
	{
		//Factory obj= new Factory();
		//obj.getManagerDaoInstance();
		
		mdao= new ManagerHomePageDAO();
		
		
	}

	@Override
	public List<Meeting> listManagerMeeting(int userId) {
		System.out.println(userId);
		return mdao.getScheduledMeetings(userId);
		
	}

	@Override
	public User ManagerInfo(int userId) {
		// TODO Auto-generated method stub
		return mdao.ManagerInfo(userId);
	}

}