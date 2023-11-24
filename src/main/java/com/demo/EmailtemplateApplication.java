package com.demo;

import com.demo.dto.MailRequest;
import com.demo.dto.MailResponse;
import com.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication

public class EmailtemplateApplication
{

	@Autowired
	private EmailService service;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Gujarat,India");
		return service.sendEmail(request, model);

	}

	public static void main(String[] args)
	{
		SpringApplication.run(EmailtemplateApplication.class, args);
	}

}
