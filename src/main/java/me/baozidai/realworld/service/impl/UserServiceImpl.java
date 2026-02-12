package me.baozidai.realworld.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.baozidai.realworld.model.RealworldUsers;
import me.baozidai.realworld.mapper.RealworldUsersMapper;
import me.baozidai.realworld.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RealworldUsersMapper realworldUsersMapper;

    @Override
    public RealworldUsers register(String username, String email, String password) {
        RealworldUsers user = new RealworldUsers();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        // 不设置id，数据库自增
        realworldUsersMapper.insertSelective(user);
        return user;
    }

    @Override
    public RealworldUsers login(String username, String password) {
        return realworldUsersMapper.selectOne(c ->
                c.where(me.baozidai.realworld.mapper.RealworldUsersDynamicSqlSupport.username, org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(username))
                 .and(me.baozidai.realworld.mapper.RealworldUsersDynamicSqlSupport.password, org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(password))
        ).orElse(null);
    }

    @Override
    public RealworldUsers getUsersByUsername(String username) {
        return realworldUsersMapper.selectOne(c ->
                c.where(me.baozidai.realworld.mapper.RealworldUsersDynamicSqlSupport.username, org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(username))
        ).orElse(null);
    }

    @Override
    public RealworldUsers getUsersProfile(String username) {
        RealworldUsers user = realworldUsersMapper.selectOne(c ->
                c.where(me.baozidai.realworld.mapper.RealworldUsersDynamicSqlSupport.username, org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(username))
        ).orElse(null);
        if (user != null) {
            user.setPassword(null);
        }
        return user;
    }
}
