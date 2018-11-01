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
@Table(name = "COMPANY_TABLE")
public class CompanyBean {
    private Long companyId;
    private Long accountId;
    private Integer companyPrice;
    private String companyEmail;
    private String companyPhone;

    private AccountBean accountByCompanyId;
}
