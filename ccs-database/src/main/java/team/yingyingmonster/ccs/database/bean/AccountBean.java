package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "ACCOUNT_TABLE")
public class AccountBean {
    private Long accountId;
    private Long roleId;
    private String accountName;
    private String accountPassword;
    private Integer accountState;
    private Timestamp registerDate;
}