package me.baozidai.realworld.model;

import jakarta.annotation.Generated;

public class Followings {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source field: public.followings.following_id")
    private Integer followingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source field: public.followings.follower_id")
    private Integer followerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source field: public.followings.following_id")
    public Integer getFollowingId() {
        return followingId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source field: public.followings.following_id")
    public void setFollowingId(Integer followingId) {
        this.followingId = followingId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source field: public.followings.follower_id")
    public Integer getFollowerId() {
        return followerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source field: public.followings.follower_id")
    public void setFollowerId(Integer followerId) {
        this.followerId = followerId;
    }
}