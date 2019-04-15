package com.zzn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzn.entity.City;
import com.zzn.service.CityService;

@Controller
public class UserCtroller {

  @Autowired
  CityService cityService;

  @ResponseBody
  @RequestMapping("index")
  public PageInfo<City> index(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

    PageHelper.startPage(pageNum, 5);
    List<City> cities = cityService.getCities(0);
    PageInfo<City> pageInfo = new PageInfo<City>(cities);
    //model.addAttribute("cities", pageInfo);
    return pageInfo;
  }

  @RequestMapping("list")
  public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
    String query) {
    System.out.print(query + "----------");
    System.out.println(pageNum);
    PageHelper.startPage(pageNum, 5);
    List<City> cities = cityService.getCities(0);

    PageInfo<City> pageInfo = new PageInfo<City>(cities);
    model.addAttribute("page", pageInfo);
    model.addAttribute("query", query);
    return "add";
  }
}
