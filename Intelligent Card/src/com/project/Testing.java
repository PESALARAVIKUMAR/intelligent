package com.project;
import com.UserBean.UserBean;
import com.UserDAO.*;
import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.catalina.User;
import org.junit.Test;

public class Testing 
{
	@Test
	public void testA() throws Exception
	{
		UserBean u=new UserBean();
		u.setFname("a");
        u.setLname("b");
        u.setGender("F");
        u.setAge(22);
        u.setContactno("1");
        u.setUid("Aaa");
        u.setPassword("Aa@1");
        u.setAccNo("a","b");
        u.setSignid("shjdh");
        u.setAns("hjgjh");
        u.setStatus(true);
		assertEquals(true,UserDAO.insert(u));
	}
	@Test
	public void testB()
	{
		
	}
	@Test
	public void testC()
	{
		
	}
}
