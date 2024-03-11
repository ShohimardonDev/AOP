package uz.ssh.aop.service.mapper;

import org.mapstruct.Mapper;
import uz.ssh.aop.model.dto.driver.DriverDto;
import uz.ssh.aop.model.entity.Driver;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {


    Driver toDto(DriverDto dto);
    List<Driver> toDto(List<DriverDto> dto);
    DriverDto fromDto(Driver driver);

}
