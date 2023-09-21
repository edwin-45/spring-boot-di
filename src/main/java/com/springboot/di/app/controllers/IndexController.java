package com.springboot.di.app.controllers;

import com.springboot.di.app.models.service.IServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @Autowired
    @Qualifier("miServicioSimple")
    private IServicio servicio;
    @GetMapping({"/index","/",""})
    public String index (Model model){
        model.addAttribute("proceso",servicio.proceso());
        return "index";
    }

//    public IndexController(IServicio servicio) {
//        this.servicio = servicio;
//    }
//    public void setServicio(IServicio servicio) {
//        this.servicio = servicio;
//    }
}
