package com.rebamei.rebameiserver.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poi")
public class PoiController {
  
  @GetMapping("/list")
  public String list() {
    return "this is list";
  }

  @GetMapping("/detail")
  public String detail() {
    return "this is detail";
  }

  @PostMapping("/add")
  public String add() {
    return "this is add";
  }

  @PutMapping("/edit")
  public String edit() {
    return "this is edit";
  }

  @DeleteMapping("/delete")
  public String delete() {
    return "this is delete";
  }
}
