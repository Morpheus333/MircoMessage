package com.service;

import java.util.ArrayList;
import java.util.List;

import com.Bean.Message;
import com.Dao.MessageDao;

public class MessageService {
	/**
	 * ��ѯ�б�
	 * @param command
	 * @param description
	 * @return ���ز�ѯ����
	 */
	public List<Message> queryMessageList(String command, String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
	/**
	 * ����ɾ��
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
	 * ����ɾ��
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
