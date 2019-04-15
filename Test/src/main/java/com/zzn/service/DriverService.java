package com.zzn.service;

import java.sql.Driver;
import java.util.List;

public interface DriverService {

  List<Driver> getDrivers(String name);

}
