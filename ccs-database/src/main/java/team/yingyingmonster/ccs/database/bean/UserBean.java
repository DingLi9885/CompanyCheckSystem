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
@Table(name = "USER_TABLE")
public class UserBean {
    private Long userId;
    private Long companyId;
    private String userName;
    private Integer userGender;
    private Integer userAge;
    private Integer userCode;
    private String userPhone;

    private CompanyBean companyByCompanyId;
}
