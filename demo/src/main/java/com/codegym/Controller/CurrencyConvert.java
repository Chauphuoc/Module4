package com.codegym.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyConvert {
    //    @GetMapping(value = {"/"})
//    public String Index() {
//        return "index";
//    }
    @RequestMapping(value = {"/"})
    public ModelAndView Index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @PostMapping(value = {"usd"})
    public ModelAndView submit(@RequestParam String usd, String rate) {
        ModelAndView modelAndView = new ModelAndView("submit");
        float result = Float.parseFloat(usd) * Float.parseFloat(rate);
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}