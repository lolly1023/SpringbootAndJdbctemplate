package bd.user.dao;

import bd.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lolly1023
 * @desc
 * @time 2021/05/26/10:11
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> query() {
        return jdbcTemplate.queryForList("select * from user");
    }

    @Override
    public boolean add(User user) {
       return jdbcTemplate.update("insert  into user values (0,?)",user.getU_name()) > 0;
    }

    @Override
    public boolean update(User user) {
        return jdbcTemplate.update("update user set  u_name = ? where u_id = ?",user.getU_name(),user.getU_id())>0;
    }

    @Override
    public boolean delete(User user) {
        return jdbcTemplate.update("delete from user where u_id = ?",user.getU_id())>0;
    }
}
