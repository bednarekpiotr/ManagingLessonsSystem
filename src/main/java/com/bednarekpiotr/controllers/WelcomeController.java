package com.bednarekpiotr.controllers;

import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

  @RequestMapping("/")
  public String home() {
    return "index";
  }

  @GetMapping("/greetings")
  public String greeting(Model model) {
    LocalDate localDate = LocalDate.now();
    model.addAttribute("date", localDate);
    return "greetings";
  }
}
