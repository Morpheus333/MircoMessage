package com.service;

import java.util.ArrayList;
import java.util.List;

import com.Bean.Message;
import com.Dao.MessageDao;

public class MessageService {
	/**
	 * 查询列表
	 * @param command
	 * @param description
	 * @return 返回查询集合
	 */
	public List<Message> queryMessageList(String command, String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
	/**
	 * 单条删除
	 * @param id
	 */
	public void deleteOne(String id){
		MessageDao messageDao = new MessageDao();
		if(id!=null && !"".equals(id.trim())){
			messageDao.deleteOne(Integer.valueOf(id));
		}
		return;
	}
	/**
	 * 多条删除
	 * @param ids
	 */
	public void deleteBatch(String[] ids){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<ids.length;i++){
			list.add(Integer.valueOf(ids[i]));
		}
		MessageDao messageDao = new MessageDao();
		messageDao.deleteBatch(list);
	}	
} 
