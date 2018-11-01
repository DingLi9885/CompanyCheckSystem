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
@Table(name = "BILL_TABLE")
public class BillBean {
    private Long billId;
    private Long userCheckId;
    private Long checkId;
    private Integer billState;
    // 关联外键
    private UserCheckBean userCheckByUserCheckId;
    private CheckBean checkByCheckId;
}
