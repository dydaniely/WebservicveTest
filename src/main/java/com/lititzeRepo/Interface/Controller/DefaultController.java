package com.lititzeRepo.Interface.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class DefaultController {

    public DefaultController() {
    }

    @GetMapping("/")
    String home(){
        return "Lititz Smart information Repository";
    }



}
