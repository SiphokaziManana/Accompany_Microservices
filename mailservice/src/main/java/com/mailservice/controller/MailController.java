package com.mailservice.controller;

import com.mailservice.domain.MailTemplate;
import com.mailservice.domain.MailTemplateDTO;
import com.mailservice.service.MailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * Created by siphokazi on 2017/06/22.
 */
@RestController
//@RequestMapping("/api/mail")
public class MailController {

    @Inject
    MailService mailService;

    //@CrossOrigin()
    @RequestMapping( value = "sendMail", method = RequestMethod.POST)
    public MailTemplateDTO sendMail(@RequestBody MailTemplate mailTemplate){
        MailTemplateDTO result  = mailService.sendMail(mailTemplate);
        return result;
    }



}
