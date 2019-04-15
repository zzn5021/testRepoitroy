package com.zzn.service;

import java.sql.Driver;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzn.mapper.DriverMapper;

@Service
public class DriverServiceImpl implements DriverService {

  @Autowired
  DriverMapper driverMapper;

  @Override
  public List<Driver> getDrivers(String name) {
    // TODO Auto-generated method stub
    return driverMapper.getDrivers(name);
  }

}
