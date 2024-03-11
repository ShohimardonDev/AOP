package uz.ssh.aop.service.impl.driver;

import uz.ssh.aop.model.entity.Driver;

import java.util.List;

public interface DriverService {

    Driver save();

    List<Driver> list();

}
