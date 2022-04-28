package com.xworkz.tv.runner;

import com.xworkz.tv.dao.TvChannelDAO;
import com.xworkz.tv.dao.TvChannelDAOImpl;
import com.xworkz.tv.entity.TVChannel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TVChannel channelEntity = new TVChannel();
   channelEntity.setChannelId(1);
   channelEntity.setChannnelName("News9");
   channelEntity.setLanguage("Kannada");
   channelEntity.setFree(false);
   channelEntity.setPrice(119.99);
   
   TvChannelDAO channelDAO = new TvChannelDAOImpl();
   channelDAO.saveChannel(channelEntity);
   System.out.println("saved successfully");
   }

}
