package com.han.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "Dear");
        testHotLoad();
        return "index";
    }

    private void testHotLoad() {
        System.out.println("hot load true");
    }
    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
//        model.addAttribute("name", "Dear");
        return "test";
    }

    /**
     * json接口
     * @return
     */
    @RequestMapping("/")
    @ResponseBody
    public Map<String, Object> home() {
        Map<String, Object> result = new HashMap<>();
        result.put("data", "hello world");
        return result;
    }

}
