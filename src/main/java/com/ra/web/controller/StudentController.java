package com.ra.web.controller;

import com.ra.web.entity.Student;
import com.ra.web.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.validation.Path;
import javax.validation.Valid;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("home")
public class StudentController {
    private ServletContext context;
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/index")
    public String index(Model model){
        List<Student> data = studentService.findAll();
        model.addAttribute(("data"),data);
        return "home/index";
    }
    @PostMapping("/create")
    public String create(@RequestParam("image") MultipartFile file, @ModelAttribute("student") Student student, Model model){
        Student std = new Student();
        std.setAddress(student.getAddress());
        std.setBrithday(student.getBrithday());
        std.setImageUrl(student.getImageUrl());
        std.setPhoneNumber(student.getPhoneNumber());
        std.setSex(student.getSex());
        std.setStudentName(student.getStudentName());
        String pathFolder = "/uploads/";
        String path = context.getRealPath("/WEB-INF/") + pathFolder;
        File folder = new File(path);
        if (!folder.exists())
            folder.mkdir();
        if (!file.isEmpty()){
            Path fileUpload = (Path) Paths.get(path + file.getOriginalFilename());
            try {
//                Files.write(fileUpload,file.getBytes());
                model.addAttribute("uploaded",pathFolder + file.getOriginalFilename());
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        studentService.save(std);
        return "home/index";
    }

}
