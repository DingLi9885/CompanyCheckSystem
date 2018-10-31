package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 16:23 2018/10/31
 * -
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "TEMPLETE_TABLE")
public class TempleteBean {
    private Long templeteId;
    private Long doctorId;
    private String templeteName;
    private Timestamp templeteCreateDate;
    private Integer templeteState;
    private String templetePath;

    private DoctorBean doctorByDoctorId;
}
