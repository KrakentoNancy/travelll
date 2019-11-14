package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author : kraken
 * @date : 8:57 2019/11/12
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);

    boolean active(String code);

    User login(User user);
}
