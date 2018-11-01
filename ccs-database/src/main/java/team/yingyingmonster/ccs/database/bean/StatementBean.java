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
@Table(name = "STATEMENT_TABLE")
public class StatementBean {
    private Long statementId;
    private Long companyId;
    private Integer statementPrice;
    private Integer statementType;
    private String statementDate;

    private CompanyBean companyByComPanyId;
}
