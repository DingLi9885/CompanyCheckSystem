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
@Table(name = "TEAMFORM_TABLE")
public class TeamFormBean {
    private Long teamFormId;
    private Integer teamFormState;
    private Long companyId;

    private CompanyBean companyByCompanyId;
}
