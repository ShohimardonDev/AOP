package uz.ssh.aop.service.impl.driver;

import uz.ssh.aop.model.dto.driver.DriverDto;
import uz.ssh.aop.model.entity.Driver;

import java.util.List;

public interface DriverService {

    DriverDto save(DriverDto dto);

    List<DriverDto> list();

}
