package uz.ssh.aop.service.impl.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.ssh.aop.model.entity.Driver;
import uz.ssh.aop.service.repo.DriverRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverServiceImp implements DriverService {
    private final DriverRepo driverRepo;

    @Override
    public Driver save() {
        return null;
    }

    @Override
    public List<Driver> list() {
        return null;
    }
}
