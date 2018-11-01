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
@Table(name = "COMBO_TABLE")
public class ComboBean {
    private Long comboId;
    private Integer comboRatio;

    private String comboName;
    private String comboSummary;
}
