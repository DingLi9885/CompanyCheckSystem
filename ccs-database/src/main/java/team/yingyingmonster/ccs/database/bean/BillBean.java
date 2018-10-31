package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BillBean {
    private Long billId;
    private Long userCheckId;
    private Long checkId;
    private Integer billState;


}
