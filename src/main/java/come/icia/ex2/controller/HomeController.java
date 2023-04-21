package come.icia.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
    @GetMapping("/") // 주소로 get요청
    public String index(){
        return "index";
    }
    @GetMapping("/hello1")
    public String hello1(){
        System.out.println("HomeController.hello1");
        return "hello1";
    }
    @GetMapping("/hello2")
    public String hello2(){
        System.out.println("HomeController.hello2");
        return "hello2";
    }
    @GetMapping("/req-param1")
    public String reqParam1(@RequestParam("name") String name, @RequestParam("age") int age){
        System.out.println("name = " + name + ", age = " + age);


        return "index";
    }
}
