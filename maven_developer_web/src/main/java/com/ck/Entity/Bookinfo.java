package com.ck.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*
李翔
时间：2021.5.16 21:：29
图书实体类
 */
public class Bookinfo {
    private  int b_bid;
    private   String  b_bname;
    private   int  b_price;
    private   int   b_btid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private   Date b_dtime;
    private   String   b_imgurl;
    private   int   b_state;
//  一对多
   private Booktype booktype;

    @Override
    public String toString() {
        return "Bookinfo{" +
                "b_bid=" + b_bid +
                ", b_bname='" + b_bname + '\'' +
                ", b_price=" + b_price +
                ", b_btid=" + b_btid +
                ", b_dtime=" + b_dtime +
                ", b_imgurl='" + b_imgurl + '\'' +
                ", b_state=" + b_state +
                ", booktype=" + booktype +
                '}';
    }

    public Bookinfo(int b_bid, String b_bname, int b_price, int b_btid, Date b_dtime, String b_imgurl, int b_state, Booktype booktype) {
        this.b_bid = b_bid;
        this.b_bname = b_bname;
        this.b_price = b_price;
        this.b_btid = b_btid;
        this.b_dtime = b_dtime;
        this.b_imgurl = b_imgurl;
        this.b_state = b_state;
        this.booktype = booktype;
    }

    public Booktype getBooktype() {
        return booktype;
    }

    public void setBooktype(Booktype booktype) {
        this.booktype = booktype;
    }

    public Bookinfo() {
    }

    public int getB_bid() {
        return b_bid;
    }

    public void setB_bid(int b_bid) {
        this.b_bid = b_bid;
    }

    public String getB_bname() {
        return b_bname;
    }

    public void setB_bname(String b_bname) {
        this.b_bname = b_bname;
    }

    public int getB_price() {
        return b_price;
    }

    public void setB_price(int b_price) {
        this.b_price = b_price;
    }

    public int getB_btid() {
        return b_btid;
    }

    public void setB_btid(int b_btid) {
        this.b_btid = b_btid;
    }

    public Date getB_dtime() {
        return b_dtime;
    }

    public void setB_dtime(Date b_dtime) {
        this.b_dtime = b_dtime;
    }

    public String getB_imgurl() {
        return b_imgurl;
    }

    public void setB_imgurl(String b_imgurl) {
        this.b_imgurl = b_imgurl;
    }

    public int getB_state() {
        return b_state;
    }

    public void setB_state(int b_state) {
        this.b_state = b_state;
    }
}
