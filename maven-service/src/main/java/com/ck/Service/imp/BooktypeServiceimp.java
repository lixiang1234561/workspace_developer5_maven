package com.ck.Service.imp;

import com.ck.Dao.BooktypeDao;
import com.ck.Entity.Booktype;
import com.ck.Service.BooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
李翔
时间：2021.5.16 21:：58
图书类型Service接口
 */
@Service
public class BooktypeServiceimp implements BooktypeService {
    @Autowired
    private BooktypeDao booktype;
    @Override
    public Booktype queryidall(int btid) {
        return null;
    }

    @Override
    public List<Booktype> queryall() {
        List<Booktype> queryall = booktype.queryall();
        return queryall;
    }
}
