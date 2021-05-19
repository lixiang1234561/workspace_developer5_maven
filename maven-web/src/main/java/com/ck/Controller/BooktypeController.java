package com.ck.Controller;


import com.ck.Entity.Booktype;
import com.ck.Service.BooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BooktypeController {
    @Autowired
    private BooktypeService booktypeService;
    @RequestMapping("queryall")
    public String queryall(ModelMap map){
        List<Booktype> queryall = booktypeService.queryall();
        map.put("booktypelist",queryall);
        return "p_add";
    }
}
