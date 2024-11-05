package com.pedro.oauth_client.controllers;

import com.pedro.oauth_client.models.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


  @GetMapping("/list")
  public List<Message> messages(){
    return Collections.singletonList(new Message("Test List"));
  }

  @PostMapping("/create")
  public Message create(@RequestBody Message message){
    System.out.println("mensaje guardado:"+ message);
    return message;
  }

  @GetMapping("/authorized")
  public Map<String,String> authorized(@RequestParam String code){
    return Collections.singletonMap("code",code);
  }


}
