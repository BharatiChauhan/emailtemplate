package com.demo.dto;

import lombok.Data;

@Data
public class MailRequest
{

    private String name;
    private String to;
    private String from;
    private String subject;

}



// link:- https://github.com/Java-Techie-jt/spring-boot-email-freemarker/blob/master/README.md