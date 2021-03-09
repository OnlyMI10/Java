package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

public interface FavoriteDao {

    /**
     * 根据rid和uid查询收藏信息
     */
    public Favorite findByAndUid(int rid,int uid);

    /**
     * 根据rid查询收藏次数
     */
    public int findCountByRid(int rid);

    /**
     * 添加收藏
     */
    void add(int rid, int uid);
}
