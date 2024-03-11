package uz.ssh.aop.service.impl.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.ssh.aop.model.dto.driver.DriverDto;
import uz.ssh.aop.model.entity.Driver;
import uz.ssh.aop.service.mapper.DriverMapper;
import uz.ssh.aop.service.repo.DriverRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverServiceImp implements DriverService {
    private final DriverRepo driverRepo;

    private final DriverMapper driverMapper;

    @Override
    public DriverDto save(DriverDto dto) {
        return driverMapper.toDto(driverRepo.save(driverMapper.fromDto(dto)));


    }

    @Override
    public List<DriverDto> list() {
        return driverMapper.toDto(driverRepo.findAll());

    }
}
