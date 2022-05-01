package com.xworkz.tv.dao;

import com.xworkz.tv.entity.TVChannel;

public interface TvChannelDAO {

	 public void saveChannel(TVChannel tvChannel);

	public void getChannel();
	
	//public TVChannel getChannelById(Integer channelId);
	
	//public void updateChannelPriceById(Double price);

}
