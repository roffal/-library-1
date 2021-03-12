package com.example.library.controller;

import com.example.library.Employee;
import com.example.library.HrService;
import com.example.library.NewsLetterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.UUID;

@RestController
public class ResourceController {

    private HrService hrService;
    private NewsLetterService newsLetterService;

    public ResourceController(HrService hrService, NewsLetterService newsLetterService) {
        this.hrService = hrService;
        this.newsLetterService = newsLetterService;
    }

    @GetMapping("/book")
    public Integer getReadersByAuthorId() throws IOException {
        Integer data = null;
        for (int i = 0; i < 10000; i++) {

        File file = new File("D:\\soft\\library\\src\\test\\java\\com\\example\\library\\Escher-Big.jpg");
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        data = inputStream.read();
        while (data != -1){
            data = inputStream.read();
        }

        }
        return data;
    }



    @GetMapping("/hire")
    public void hire() throws IOException {

        for (int i = 0; i < 1000000; i++) {
            Employee employee = new Employee();
            String s = UUID.randomUUID().toString();
            employee.setId(s);
            employee.setName(s);
            hrService.hire(employee);
            newsLetterService.registerNewsletterSubscription(employee);
        }


    }


    @GetMapping("/fire")
    public void fire()  {
        for (int i = 0; i < 1000000; i++) {
            Employee employee = hrService.findRandom();
            hrService.fire(employee);
        }
    }


    @GetMapping("/broke")
    public void broke()  {
        hrService.fireAll();
    }

}
