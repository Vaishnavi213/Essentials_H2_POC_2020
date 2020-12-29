package com.FrontEnd.UserList.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewUsers {

    @GetMapping("viewusers")
    public String getViewUsers(){
        return "viewUsers";
    }
}
