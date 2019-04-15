package com.zzn.controller;

import java.sql.Driver;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzn.service.DriverService;

@Controller
public class DriverController {

  @Autowired
  DriverService driverService;

  @RequestMapping("drivers")
  public String drivers(Model model, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
    String name) {

    PageHelper.startPage(pageNum, 2);

    List<Driver> drivers = driverService.getDrivers(name);

    PageInfo<Driver> page = new PageInfo<>(drivers);

    model.addAttribute("page", page);
    model.addAttribute("name", name);

    return "driver";
  }
}
