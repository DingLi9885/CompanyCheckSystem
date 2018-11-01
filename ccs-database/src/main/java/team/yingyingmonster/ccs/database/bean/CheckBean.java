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
@Table(name = "CHECK_TABLE")
public class CheckBean {
    private Long checkId;
    private Integer checkName;
    private Long deptId;
    private String checkPrice;

    private DeptBean deptByDeptId;
}
