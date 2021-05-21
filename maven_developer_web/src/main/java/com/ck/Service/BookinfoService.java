package com.ck.Service;

import com.ck.Entity.Bookinfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/*
李翔
时间：2021.5.16 21:：58
图书Service接口
 */

public interface BookinfoService {
    public PageInfo<Bookinfo> querybookinfo(Map map, int pagenum, int pagesize);
    public void deleteidbook(int id);
    public void addbook(Bookinfo bookinfo);

}
