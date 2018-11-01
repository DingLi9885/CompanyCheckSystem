package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "DOCTOR_TABLE")
public class DoctorBean {
    private Long doctorId;
    private Long accountId;
    private Long deptId;
    private Integer doctorGrender;
    private Integer doctorAge;
    private String doctorPhone;
    private String doctorHeader;

    private AccountBean accountByAccountId;
    private DeptBean deptByDeptId;
}
