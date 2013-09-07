package cn.itcast.oa.test;

import org.junit.Test;

import cn.itcast.oa.dao.RoleDao;
import cn.itcast.oa.dao.UserDao;
import cn.itcast.oa.dao.impl.RoleDaoImpl;
import cn.itcast.oa.dao.impl.UserDaoImpl;

public class DaoTest {

	@Test
	public void test() throws Exception {
		UserDao userDao = new UserDaoImpl();
		RoleDao roleDao = new RoleDaoImpl();

		// User user = userDao.getById(1L);
		// Role role = roleDao.getById(1L);
	}
}
