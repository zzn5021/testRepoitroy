package com.zzn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzn.entity.City;
import com.zzn.mapper.CityMapper;

@Service
public class CityServiceImpl implements CityService {
  @Autowired
  private CityMapper mapper;

  @Override
  public List<City> getCities(int i) {
    // TODO Auto-generated method stub
    return mapper.getCities(i);
  }

}
