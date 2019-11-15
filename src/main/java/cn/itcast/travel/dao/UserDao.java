package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @author : kraken
 * @date : 8:58 2019/11/12
 */
public interface UserDao {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 用户保存
     * @param user
     */
    public void save(User user);

    User findByCode(String code);

    void updateStatus(User user);

    User findByUsernameAndPassword(String username, String password);
}
