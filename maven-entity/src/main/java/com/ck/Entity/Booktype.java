package com.ck.Entity;
/*
李翔
时间：2021.5.16 21:：29
图书类型实体类
 */
public class Booktype {
    private int  t_btid;
    private String t_btname;
//  多对一
    public Booktype(int t_btid, String t_btname ) {
        this.t_btid = t_btid;
        this.t_btname = t_btname;
    }
    public Booktype() {
    }

    public int getT_btid() {
        return t_btid;
    }

    public void setT_btid(int t_btid) {
        this.t_btid = t_btid;
    }

    public String getT_btname() {
        return t_btname;
    }

    public void setT_btname(String t_btname) {
        this.t_btname = t_btname;
    }
}
