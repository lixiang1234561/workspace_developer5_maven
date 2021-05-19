package com.ck.Dao;

import com.ck.Entity.Booktype;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
李翔
时间：2021.5.16 21:：58
图书类型Dao接口
 */
public interface BooktypeDao {
    @Select("select bt.* from booktype bt where bt.btid=#{btid}")
    @ResultMap("booktypemap")
    public Booktype queryidall(@Param("btid") int btid);
    @Select("select * from booktype")
    @ResultMap("booktypemap")
    public List<Booktype> queryall();
}
