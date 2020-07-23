package com.simp.mac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MainController {
 
    @GetMapping(value = "/test")
    @ResponseBody
    public String getTestData() {
        
        
        return "mac e peder";
    }
    

    @GetMapping(value = "/dali/mac/stvarno/e/peder")
    @ResponseBody
    public String getTestData1() {
        
        
        return "da";
    }
}