package com.Dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.Bean.Message;
import com.DB.DBAccess;

public class MessageDao {
	/**
	 * 查询
	 * @param command
	 * @param description
	 * @return 返回查询集合
	 */
	public List<Message> queryMessageList(String command, String description){
		List<Message> listMessage = new ArrayList<Message>();
		DBAccess dbAccess = new DBAccess();
		Message message = new Message();
		message.setCommand(command);
		message.setDescription(description);
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAccess.getSqlSession().openSession();
			listMessage = sqlSession.selectList("Message.queryMessageList", message);
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return listMessage;
	}
	/**
	 * 单条删除
	 * @param id
	 */
	public void deleteOne(int id){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAccess.getSqlSession().openSession();
			sqlSession.selectList("Message.deleteOne", id);
			sqlSession.commit();
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAccess.getSqlSession().openSession();
			sqlSession.selectList("Message.deleteBatch", ids);
			sqlSession.commit();
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
}
