package uz.ssh.aop.model.entity;


import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Audited
@Data
public class Driver {

    @Id
    @GeneratedValue(generator = "system-uuid")
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "phone")
    private String phone;


    private String license;

    @Column(name = "home_terminal_address")
    private String homeTerminalAddress;
    @ManyToOne
    @JoinColumn(name = "co_driver_id")
    private Driver coDriver;
    @Column(name = "notes")
    private String notes;
    @Column(name = "allow_personal_conveyance")
    private Boolean allowPersonalConveyance;
    @Column(name = "allow_yard_move")
    private Boolean allowYardMove;
    @Column(name = "enable_ssb")
    private Boolean enableSsb;
    @Column(name = "enable_short_haul")
    private Boolean enableShortHaul;
    @Column(name = "enable_adverse_driving")
    private Boolean enableAdverseDriving;
    @Column(name = "disable_correction")
    private Boolean disableCorrection;
    @Column(name = "date_terminated")
    private LocalDateTime terminated;
    @Column(name = "date_activated")
    private LocalDateTime activated;
}
