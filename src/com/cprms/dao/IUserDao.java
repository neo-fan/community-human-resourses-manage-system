/**
 * 
 */
package com.cprms.dao;

import java.util.List;

import com.cprms.domain.User;

/**
 * @author cheng
 * @version 2019年1月12日下午5:12:18
 */
public interface IUserDao {
	void insertUser(User user);
	void insertUserCatchId( User user);
	void deleteUserByUsername(String name);
	void deleteUserById(int id);
	void updateUserById(User user);
	void updateUserByUsername(User user);
	User selectUserByUsername(String name);
	List<User> selectAllUsers();
	List<User> searchUsersByName(String name);
	
}
