/**
 * 
 */
package test;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.cprms.dao.UserDaoImp;
import com.cprms.domain.User;

/**
 * @author cheng
 * @version 2018年12月30日下午8:11:27
 */
class UserDaoTest {
	//测试insertUser()
	@Test
	public void test01() {
		UserDaoImp userDao = new UserDaoImp();
		for(int i=0;i<100;i++)
			userDao.insertUser(new User("于珊"+i,"123456",null));
	}
	//测试deleteUserByUsername()
	@Test
	public void test02() {
		UserDaoImp userDao = new UserDaoImp();
		userDao.deleteUserByUsername("于珊");
	}
	//测试selectUserByUsername()
	@Test
	public void test03() {
		UserDaoImp userDao = new UserDaoImp();
		User user = userDao.selectUserByUsername("于珊");
		System.out.println(user);
	}
	//测试insertUserCatchId()
	@Test
	public void test04() {
		UserDaoImp userDao = new UserDaoImp();
		User user = new User("于珊","123456");
		System.out.println(user);
		userDao.insertUserCatchId(user);
		System.out.println(user);
	}
	//测试deleteUserById()
	@Test
	public void test05() {
		UserDaoImp userDao = new UserDaoImp();
		userDao.deleteUserById(1227);
	}
	//测试updateUserById()
	@Test
	public void test06() {
		User user = new User(18,"于珊","456123");
		UserDaoImp userDao = new UserDaoImp();
		System.out.println(userDao.selectUserByUsername("于珊"));
		userDao.updateUserById(user);
		System.out.println(userDao.selectUserByUsername("于珊"));
		System.out.println(user);
	}
	//测试updateUserById()
	@Test
	public void test07() {
		User user = new User(1228,"于珊","----");
		UserDaoImp userDao = new UserDaoImp();
		System.out.println(userDao.selectUserByUsername("于珊"));
		userDao.updateUserById(user);
		System.out.println(userDao.selectUserByUsername("于珊"));
	}
	//测试selectAllUsers()
	@Test
	public void test08() {
		UserDaoImp userDao = new UserDaoImp();
		List<User> users =  userDao.selectAllUsers();
		if (users.size() > 0 ) {
			for(User u:users) {
				System.out.println(u.toString());
			}
		}else {
			System.out.println("没有用户");
		}
	}
	//测试searchUsersByName()
	@Test
	public void test09() {
		UserDaoImp userDao = new UserDaoImp();
		List<User> users =  userDao.searchUsersByName("0");
		if (users.size() > 0 ) {
			for(User u:users) {
				System.out.println(u.toString());
			}
		}else {
			System.out.println("没有用户");
		}
	}
	
}
