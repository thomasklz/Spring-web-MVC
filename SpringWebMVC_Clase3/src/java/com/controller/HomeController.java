
package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
    
    @RequestMapping("home.html")
    public ModelAndView  home( HttpServletRequest request)
    {
     ModelAndView MAV = new ModelAndView();
     MAV.setViewName("Home/home");
     String id= request.getParameter("ID");
     String id2= request.getParameter("ID2");
     MAV.addObject("ID", id);
     MAV.addObject("ID2", id2);
     return MAV;
    }
    
    @RequestMapping("nosotros.html")
    public ModelAndView  nosotros()
    {
     ModelAndView MAV = new ModelAndView();
     MAV.setViewName("Home/nosotros");
     return MAV;
    }

}
