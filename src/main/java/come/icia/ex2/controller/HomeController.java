package come.icia.ex2.controller;

import come.icia.ex2.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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
//    @GetMapping("/req-param1")
    @RequestMapping(value="/req-param1", method = RequestMethod.GET)
    public String reqParam1(@RequestParam("name") String name, @RequestParam("age") int age){
        System.out.println("name = " + name + ", age = " + age);
        return "hello2";
    }
    @GetMapping("/form-param2")
    public String formParam2(@RequestParam("p1") String p1, @RequestParam("p2") String p2){
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        return "index";
    }
    @PostMapping("/form-param3")
    public String formParam3(@RequestParam String p3, @RequestParam String p4){
        System.out.println("p3 = " + p3+",p4 = " + p4);
        return "index";
    }
    @GetMapping("/hello3")
    public  String hello3(Model model){
        String s1 = "안녕하세요";
        model.addAttribute("m1",s1);
        return "hello3";
    }
    @GetMapping("/hello4")
    public String hello4(Model model){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("12341234");
        model.addAttribute("student",studentDTO);
        return "hello4";
    }

    //hello5 요청을 처리하는 메서드
    //실행내용 : StudentDTO 객체를 담는 ArrayList 를 선언하고 학생 2명의 정보를 리스트에 저장 후
    // 리스트를 모델에 담자
    @GetMapping("/hello5")
    public String hello5(Model model){
        ArrayList<StudentDTO> alist = new ArrayList<>();
        for(int i = 1 ; i<=10 ; i++) {
            alist.add(newStudent(i));
        }
        model.addAttribute("aalist",alist);

        return "hello5";
    }
    private StudentDTO newStudent(int i){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId((long) i);
        studentDTO.setStudentName("학생"+i);
        studentDTO.setStudentNumber("11111110"+i);
        return studentDTO;
    }
}
