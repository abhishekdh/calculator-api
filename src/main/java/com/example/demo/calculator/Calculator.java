package com.example.demo.calculator;


import com.example.demo.model.Sum;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Calculator {


    @GetMapping(path = "/add/{x}/{y}")
    public Sum addition(@PathVariable int x, @PathVariable int y){
        return new Sum(x,y);
    }

    @GetMapping(path = "/add")
    public Sum addition2(@RequestParam int x, @RequestParam int y){
        return new Sum(x,y);
    }



    @RequestMapping(path = "/")
    public String welcome(){
        return "<h1>Welcome to Demo project for Rest API Creation using Spring Boot</h1>" +
                "<p>API URL - /add <p>";
    }

    @PostMapping("/add")
    public Sum addPost(@RequestBody Sum s){
        return new Sum(s.getX(),s.getY());
    }


    @GetMapping(path = "/sum")
    public ModelAndView sum(){
        ModelAndView obj = new ModelAndView();
        obj.setViewName("sum.html");
        return obj;
    }


}
