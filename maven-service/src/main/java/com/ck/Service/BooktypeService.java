package com.ck.Service;

import com.ck.Entity.Booktype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
李翔
时间：2021.5.16 21:：58
图书类型Service接口
 */

public interface BooktypeService {

    public Booktype queryidall(@Param("btid") int btid);
    public List<Booktype> queryall();

}
