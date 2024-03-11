package uz.ssh.aop.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ssh.aop.model.dto.driver.DriverDto;
import uz.ssh.aop.service.impl.driver.DriverService;

import javax.naming.ldap.PagedResultsControl;
import javax.naming.ldap.SortResponseControl;
import java.util.List;

@RestController
@RequestMapping("/driver")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @GetMapping
    public ResponseEntity<List<DriverDto>> list() {


        return ResponseEntity.ok(driverService.list());
    }

    @PostMapping
    public ResponseEntity<DriverDto> save(DriverDto dto) {
        return ResponseEntity.ok(driverService.save(dto));
    }

}
