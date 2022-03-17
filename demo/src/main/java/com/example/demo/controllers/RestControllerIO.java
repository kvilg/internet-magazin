package com.example.demo.controllers;



import com.example.demo.controllers.repositori.PostRepo;
import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Optional;

@RestController
public class RestControllerIO {

    @Autowired
    private PostRepo postMain;


    @GetMapping("/add")
    public String tr() {
        return "{\n" +
                "\"query\": \"Виктор Иван\",\n" +
                "\"count\": 7,\n" +
                "\"parts\": [\"NAME\", \"SURNAME\"]\n" +
                "}";
    }

    @GetMapping("/da")
    public String da() {

        String a = postMain.findByName("имя").get(0).getText();

        return a;
    }

    @PostMapping("/post")
    public String trasd(@RequestBody String name) {
        return name;
    }

//    @PostMapping("/post")
//    public String trasdq(@RequestBody String name) {
//
//        Post a = new Post("di","null","net");
//
//        postMain.save(a);
//
//
//        return "ok";
//    }


}
