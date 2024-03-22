package com.punenightlife.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.punenightlife.services.EmailService;
import com.punenightlife.services.ForgotPasswordService;

@CrossOrigin(origins = { "*" })
@RestController
public class ForgotasswordController {
    @Autowired
    private ForgotPasswordService service;

    
    @Autowired
    private EmailService emailService;
    
    @PostMapping("/forgot-password")
    public String forgotPass(@RequestParam String email){
        String response = service.forgotPass(email);

        if(!response.startsWith("Invalid")){
            response= "http://localhost:4200/reset-password?token=" + response;
        }
        
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(email);
        mailMessage.setSubject("Reset your PNL4U account password!");
        mailMessage.setFrom("golharamit@gmail.com");
        mailMessage.setText("To reset your password, please click here : " + response);

        emailService.sendEmail(mailMessage);
        
        return response;
    }

    @PutMapping("/reset-password")
        public String resetPass(@RequestParam String token, @RequestParam String password){
            return service.resetPass(token,password);
        }

}