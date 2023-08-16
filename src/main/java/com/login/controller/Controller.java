package com.login.controller;

import com.login.entity.Registration;
import com.login.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class Controller {
    @Autowired
    public Service service;
    @PostMapping("/save")
    public String saveReg(@RequestBody @Valid Registration reg)
    {
        Registration r1 = service.saveReg(reg);
        String msg=null;
        if(r1!=null)
        {
            msg= "Registration done successfully";
        }
        else{
            msg= "Registration failed";
        }
        return msg;
    }
    @GetMapping("/get/{regId}")
        public Registration getReg(@PathVariable String regId)
        {
            Registration r2 = service.getReg(regId);
            return r2;
        }
}
