/**
 * 
 */
package com.cprms.myUtils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author cheng
 * @version 2019年1月11日上午12:08:34
 */
public class MyUtils {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession() {
		InputStream is = null;
		//如果sqlSessionFactory未被创建，则创建
		if (sqlSessionFactory ==null){
			try {
				//加载主配置文件
				is = Resources.getResourceAsStream("mybatis.xml");
				//创建sqlSessionFactory对象
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			}catch (IOException e) {
					throw new RuntimeException(e);
				}
		}
		//获取sqlSession对象
		return sqlSessionFactory.openSession();
	}

	
	
	
	
	
	
}
