package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateamount", rate);
        return "rateview";
    }
}
