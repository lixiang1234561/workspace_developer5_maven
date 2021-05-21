package com.ck.Service.imp;

import com.ck.Dao.BookinfoDao;
import com.ck.Entity.Bookinfo;
import com.ck.Service.BookinfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/*
李翔
时间：2021.5.16 21:：58
图书Service接口
 */

@Service
public class BookinfoServiceimp implements BookinfoService {
    @Autowired
    private BookinfoDao bookinfoDao;
    //更据图书类型动态查询
    public PageInfo<Bookinfo> querybookinfo(Map map, int pagenum, int pagesize){
        PageHelper.startPage(pagenum, pagesize);
        List<Bookinfo> querybookinfo = bookinfoDao.querybookinfo(map);
        PageInfo<Bookinfo> page = new PageInfo<>(querybookinfo);
        return page;
    }
    public void deleteidbook(int id){
        bookinfoDao.deleteidbook(id);
    }

    public void addbook(Bookinfo bookinfo){
        bookinfoDao.addbook(bookinfo);
    }
}
