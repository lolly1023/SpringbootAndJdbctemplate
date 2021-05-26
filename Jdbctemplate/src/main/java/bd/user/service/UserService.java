package bd.user.service;

import bd.user.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author lolly1023
 * @desc
 * @time 2021/05/26/10:13
 */
public interface UserService {
    List<Map<String, Object>> query();

    boolean add(User user);

    boolean update(User user);

    boolean delete(User user);
}
