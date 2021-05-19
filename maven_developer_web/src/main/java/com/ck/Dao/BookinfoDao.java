package com.ck.Dao;

import com.ck.Entity.Bookinfo;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
李翔
时间：2021.5.16 21:：58
图书Dao接口
 */
public interface BookinfoDao {


    public List<Bookinfo> querybookinfo(Map map);

    @Delete("delete from bookinfo where bid=#{0}")
    public void deleteidbook(int id);

    @Insert("insert into bookinfo values(null,#{b_bname},#{b_price},#{b_btid},sysdate(),#{b_imgurl},#{b_state})")
    public void addbook(Bookinfo bookinfo);
}
