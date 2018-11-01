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
@Table(name = "REPORT_TABLE")
public class ReportBean {
    private Long reportId;
    private String resportSummary;
    private Long billId;

    private BillBean billByBillId;
}
