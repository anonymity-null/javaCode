package rwl.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping(path = "/start")
    public String sayHello(){
        System.out.println("let's get high");
        return "success";
    }

}
