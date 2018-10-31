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
@Table(name = "USER_CHECK_TABLE")
public class UserCheckBean {
    private Long userId;
    private Long userCheckId;
    private Long teamFormComboCheckId;

    private UserCheckBean userCheckByUserCheckId;
    private TeamFormComboCheckBean teamFormComboCheckByTeamFormComboCheckId;
}
