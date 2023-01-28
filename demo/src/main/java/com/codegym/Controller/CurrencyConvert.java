package com.codegym.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class CurrencyConvert {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;
    private Matcher matcher;


    public boolean validateEmail(String regex) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    @RequestMapping(value = {"/"})
    public ModelAndView Index() {
        ModelAndView modelAndView = new ModelAndView("CurrencyConvert/index");
        return modelAndView;
    }
    @PostMapping(value = {"usd"})
    public ModelAndView submit(@RequestParam String usd, String rate, String email) {
        ModelAndView modelAndView = new ModelAndView("CurrencyConvert/submit");
        float result = Float.parseFloat(usd) * Float.parseFloat(rate);

        boolean checkEmail = validateEmail(email);
        if (checkEmail) {
            modelAndView.addObject("message", "Successfull");
        } else {
            modelAndView.addObject("message", "fail");
        }

        modelAndView.addObject("usd", usd);
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}