/**
 * 
 */
package com.cprms.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.cprms.domain.User;
import com.cprms.myUtils.MyUtils;

/**
 * @author cheng
 * @version 2018年12月30日下午7:43:33
 */
public class UserDaoImp implements IUserDao {
	
	public void insertUser(User user) {
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		sqlsession.insert("insertUser",user);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
	}
	
	public void insertUserCatchId( User user) {
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		sqlsession.insert("insertUserCatchId",user);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
	}
	
	public void deleteUserByUsername(String name) {
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		sqlsession.insert("deleteUserByUsername",name);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
	}
	
	public void deleteUserById(int id) {
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		sqlsession.insert("deleteUserById",id);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
	}
	
	public void updateUserById(User user) {
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		sqlsession.update("updateUserById",user);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
	}
	
	public void updateUserByUsername(User user) {
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		sqlsession.update("updateUserByUsername",user);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
	}
	
	public User selectUserByUsername(String name) {
		User user = null;
		SqlSession sqlsession =null;
		sqlsession = MyUtils.getSqlSession();
		user = sqlsession.selectOne("selectUserByUsername", name);
		sqlsession.commit();
		if(sqlsession != null)
			sqlsession.close();
		return user;
	}
	
	public List<User> selectAllUsers(){
		
		List<User> users = new ArrayList<User>(); 
		SqlSession sqlSession = MyUtils.getSqlSession();
		users = sqlSession.selectList("selectAllUsers");
		return users;
	}

	public List<User> searchUsersByName(String name){
		List<User> users = new ArrayList<User>(); 
		SqlSession sqlSession = MyUtils.getSqlSession();
		users = sqlSession.selectList("searchUsersByName",name);
		return users;
	}
}
