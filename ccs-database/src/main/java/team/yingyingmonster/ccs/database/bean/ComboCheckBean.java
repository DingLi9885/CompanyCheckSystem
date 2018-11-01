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
@Table(name = "COMBO_CHECK_TABLE")
public class ComboCheckBean {
    private Long checkId;
    private Long comboId;
    private Long comboCheckId;

    private ComboBean comboByComboId;
    private CheckBean checkByCheckId;
}
