package com.rebamei.rebameiserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rebamei.rebameiserver.pojo.Poi;
import com.rebamei.rebameiserver.vo.PoiVo;
import com.rebamei.rebameiserver.vo.Result;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/poi")
public class PoiController {
  
  @GetMapping("/list")
  public Result list(@RequestParam(defaultValue = "1") int pageNumber, @RequestParam(defaultValue = "30") int pageSize) {
    log.info("poi list, pageNumber={} pageSize={}", pageNumber, pageSize);
    var poiVo1 = new PoiVo();
    poiVo1.name = "list";
    poiVo1.description = "this is list";
    var poiVo2 = new PoiVo();
    poiVo2.name = "tan shi";
    poiVo2.description = "tan shi is a man";

    List poiVos = new ArrayList<PoiVo>();
    poiVos.add(poiVo1);
    poiVos.add(poiVo2);

    return Result.success(poiVos);
  }

  @GetMapping("/detail/{id}")
  public Result detail(@PathVariable int id) {
    log.info("poi detail, id={}", id);
    var poiVo = new PoiVo();
    poiVo.name = "tan shi";
    poiVo.description = "tan shi is a man";

    return Result.success(poiVo);
  }

  @PostMapping("/add")
  public Result add(@RequestBody Poi poi) {
    log.info("poi add, name={} description={}", poi.name, poi.description);
    return Result.success();
  }

  @PutMapping("/edit")
  public Result edit() {
    return Result.success();
  }

  @DeleteMapping("/delete/{id}")
  public Result delete(@PathVariable int id) {
    log.info("poi delete, id={}", id);
    return Result.success();
  }
}
