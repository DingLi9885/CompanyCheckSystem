package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AccountBean {
    private Long accountId;
    private Long roleId;

    private String accountName;
    private String accountPassword;

    private Integer accountState;

    private Timestamp registerDate;


}