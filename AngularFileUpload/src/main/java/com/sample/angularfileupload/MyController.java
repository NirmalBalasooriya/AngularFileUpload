package com.sample.angularfileupload;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class MyController {

 @Autowired
 DataSource dataSource;

 @Value("${application.message:Hello World}")
 private String message;

 
 @GetMapping("/H")
 public String welcome(Map<String, Object> model) {
  
  String countries="";
  
  model.put("countries", countries);
  
  return "Hello";
 }
 
 @PostMapping("/uploadfile")
 public String handleFileUpload(@RequestParam("file") MultipartFile file,
         RedirectAttributes redirectAttributes) {

	 System.out.println(file.getName()+" "+file.getContentType());
     redirectAttributes.addFlashAttribute("message",
             "You successfully uploaded " + file.getOriginalFilename() + "!");

     return "OK";
 }

}