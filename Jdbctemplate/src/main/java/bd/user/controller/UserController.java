package bd.user.controller;

import bd.user.entity.User;
import bd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lolly1023
 * @desc
 * @time 2021/05/26/10:04
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("query")
    public Map query(){
        Map<String, Object> result = new HashMap<>();
        List<Map<String, Object>> list = null;
        try {
            list = userService.query();
            result.put("method", "jdbctemplate");
            result.put("data", list);
            result.put("errorCode", 0);
            result.put("msg", "获取数据成功");
        } catch (Exception e) {
            result.put("errorCode", 1);
            result.put("msg", "后端服务器异常");
        }
        return result;
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map add(@RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (userService.add(user)) {
                result.put("msg","添加成功");
            } else {
                result.put("msg","添加失败");
            }
            result.put("method", "jdbctemplate");
            result.put("errorCode", 0);
        } catch (Exception e) {
            result.put("errorCode", 1);
            result.put("msg", "后端服务器异常");
        }
        return result;
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Map update(@RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (userService.update(user)) {
                result.put("msg","修改成功");
            } else {
                result.put("msg","修改失败");
            }
            result.put("method", "jdbctemplate");
            result.put("errorCode", 0);
        } catch (Exception e) {
            result.put("errorCode", 1);
            result.put("msg", "后端服务器异常");
        }
        return result;
    }
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public Map delete(@RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (userService.delete(user)) {
                result.put("msg","删除成功");
            } else {
                result.put("msg","删除失败");
            }
            result.put("method", "jdbctemplate");
            result.put("errorCode", 0);
        } catch (Exception e) {
            result.put("errorCode", 1);
            result.put("msg", "后端服务器异常");
        }
        return result;
    }
}
