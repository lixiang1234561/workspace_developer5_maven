package com.ck.Controller;

import com.ck.Entity.Bookinfo;
import com.ck.Entity.Booktype;
import com.ck.Service.BookinfoService;
import com.ck.Service.BooktypeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class BookinfoController {

    @Autowired
    private BookinfoService bookinfoService;
    @Autowired
    private BooktypeService booktypeService;
//  更据图书类型id动态查询图书并分页指令
    @RequestMapping("querytypeidall")
//  从页面获取到第几页,和每页多少数量
    public String querytypeidall(ModelMap map, String t_btid, String t_btname,String pagenum){
        List<Booktype> queryall = booktypeService.queryall();
        if(t_btid != "" && t_btid != null){
             map.put("t_btid",t_btid);
        }
        if(t_btname != "" && t_btname != null){
            map.put("t_btname",t_btname);
        }
        if(pagenum == null || pagenum == "0" || pagenum.equals("0")){
            pagenum="1";
        }
        PageInfo<Bookinfo> querybookinfo = bookinfoService.querybookinfo(map,Integer.valueOf(pagenum),5);
//      将总页数放入map中
        map.put("pages",querybookinfo.getPages());
//      将当前页数放入map中
        map.put("pagenum",pagenum);
        //将所有图书类型放入map中
        map.put("booktypelist",queryall);
        //动态查询图书与图书类型
        map.put("booklist", querybookinfo.getList());
        return "p_list";
    }
//  更据id删除图书
    @RequestMapping("deleteidbook")
    @ResponseBody
    public String deleteidbook(int id){
        try {
            bookinfoService.deleteidbook(id);
        }catch (Exception e){
            return "0";
        }
        return "1";
    }
//  查询所有图书类型
    @RequestMapping("querytypeall")
    public String querytypeall(ModelMap map){
        List<Booktype> queryall = booktypeService.queryall();
        //将所有图书类型放入map中
        map.put("booktypelist",queryall);
        return "p_add";
    }
//  添加图书
    @RequestMapping("addtypebook")
    public String addtypebook(Bookinfo bookinfo,MultipartFile file){
        System.out.println(bookinfo);
        System.out.println(file);
        try {
//            bookinfoService.addbook(bookinfo);
            return "redirect:querytypeall";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:querytypeall";
    }
}
