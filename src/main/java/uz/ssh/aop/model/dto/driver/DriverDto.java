package uz.ssh.aop.model.dto.driver;

public record DriverDto(
        Long id,
        String username,
        String phone,
        String license,
        String homeTerminalAddress,
        String notes,
        Boolean allowPersonalConveyance,
        Boolean allowYardMove,
        Boolean enableSsb,
        Boolean enableShortHaul,
        Boolean enableAdverseDriving,
        Boolean disableCorrection
) {
}
