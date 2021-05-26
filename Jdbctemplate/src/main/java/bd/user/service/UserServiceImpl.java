package bd.user.service;

import bd.user.dao.UserDao;
import bd.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author lolly1023
 * @desc
 * @time 2021/05/26/10:13
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public List<Map<String, Object>> query() {
        return userDao.query();
    }

    @Override
    public boolean add(User user) {
        return  userDao.add(user);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(User user) {
        return userDao.delete(user);
    }
}
