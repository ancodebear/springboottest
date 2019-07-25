package com.hyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * PROJECT springboottest
 *
 * @author hyq
 * @date 2019/7/21 21:01
 */
@Controller
@RequestMapping("/hello")
public class HelloController extends BaseAbsController<String> {
    @ResponseBody
    @RequestMapping("/{id}&{name}")
    public String hello(@PathVariable("id")String id, @PathVariable("name")String name){
        return baseservers.servers("")+"牛逼</br>"+name+":hellowrold"+id;
    }
}
