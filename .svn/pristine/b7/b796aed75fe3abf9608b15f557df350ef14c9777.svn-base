package com.ccunix.icar.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.base.dao.IUserDao;
import com.ccunix.icar.base.domain.User;


@Service("userService")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class) 
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    
    public User getUserById(int userId) {
        return userDao.queryByPrimaryKey(userId);
    }

    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public void addUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    @CacheEvict(value="User",key="getAllUser",allEntries=true) 
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

	@Override
	public void deleteUser(User user) {
		userDao.deleteByPrimaryKey(user.getId());
	}

}