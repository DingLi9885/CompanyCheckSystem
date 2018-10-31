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
@Table(name = "TEAMFORM_COMBOCHECK_TABLE")
public class TeamFormComboCheckBean {
    private Long teamformComboCheckId;
    private Long teamFormId;
    private Long comboId;

    private TeamFormBean teamFormByTeamFormId;
    private ComboBean comboByComboId;
}
