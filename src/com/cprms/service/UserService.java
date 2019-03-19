/**
 * 
 */
package com.cprms.service;

import com.cprms.dao.UserDaoImp;
import com.cprms.domain.User;
import com.cprms.domain.UserException;

/**
 * @author cheng
 * @version 2018年12月30日下午9:10:41
 */
public class UserService {
	UserDaoImp userDao = new UserDaoImp();
	
	public void regist(User user) throws Exception {
		User _user;
		if (user.getUsername().trim()=="")
			throw new UserException("用户名不能为空！！");
		if (user.getPassword().trim()=="")
			throw new UserException("密码不能为空！！");
		_user = userDao.selectUserByUsername(user.getUsername());
		if (_user==null) {
			userDao.insertUser(user);
		}
		else {
			throw new UserException("账户名已存在");
		}
	}
	public User login(User user) throws UserException {
		User _user = userDao.selectUserByUsername(user.getUsername());
		if(_user ==null) {
			throw new UserException("账户不存在");
		}
		if(!user.getPassword().contentEquals(_user.getPassword())) {
			throw new UserException("密码错误");
		}	
		return _user;
	}
		
}
