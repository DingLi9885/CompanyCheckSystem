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
@Table(name = "MODEL_TABLE")
public class ModelBean {
    private Long checkId;
    private Long recordId;
    private String recordName;

    private CheckBean checkByCheckId;
}
