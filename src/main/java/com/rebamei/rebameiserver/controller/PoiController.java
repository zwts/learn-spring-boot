package com.rebamei.rebameiserver.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/poi")
public class PoiController {
  
  @GetMapping("/list")
  public String list(@RequestParam(defaultValue = "1") int pageNumber, @RequestParam(defaultValue = "30") int pageSize) {
    log.info("poi list, pageNumber={} pageSize={}", pageNumber, pageSize);
    return "this is list";
  }

  @GetMapping("/detail/{id}")
  public String detail(@PathVariable int id) {
    log.info("poi detail, id={}", id);
    return "this is detail";
  }

  @PostMapping("/add")
  public String add(@RequestBody Poi poi) {
    log.info("poi add, name={} description={}", poi.name, poi.description);
    return "this is add";
  }

  @PutMapping("/edit")
  public String edit() {
    return "this is edit";
  }

  @DeleteMapping("/delete/{id}")
  public String delete(@PathVariable int id) {
    log.info("poi delete, id={}", id);
    return "this is delete";
  }
}
