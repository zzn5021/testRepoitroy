package com.zzn.mapper;

import java.sql.Driver;
import java.util.List;

public interface DriverMapper {

  List<Driver> getDrivers(String name);

}
