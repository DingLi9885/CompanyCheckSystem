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
@Table(name = "EXCEL_TABLE")
public class ExcelBean {
    private Long excelId;
    private Long companyId;
    private String excelName;
    private String excelUrl;

    private CompanyBean companyByCompanyId;
}
