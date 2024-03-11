package uz.ssh.aop.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ssh.aop.model.entity.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Integer> {
}
