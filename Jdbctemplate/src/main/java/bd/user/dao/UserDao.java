package bd.user.dao;

import bd.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author lolly1023
 * @desc
 * @time 2021/05/26/10:11
 */
public interface UserDao {
    List<Map<String, Object>> query();

    boolean add(User user);

    boolean update(User user);

    boolean delete(User user);
}
