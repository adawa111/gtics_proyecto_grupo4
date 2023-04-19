package com.example.gtics_proyecto_grupo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class controllerPrincipal {

    @RequestMapping(value={"/"},method = RequestMethod.GET)
    public String vistaPrincipal(){

        return "vistaPrincipal";
    }

}
