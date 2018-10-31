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
@Table(name = "MODEL_DATA_TABLE")
public class ModelDataBean {
    private Long modelDataId;
    private String modelValue;
    private Long recordId;
    private Long userCheckId;

    private ModelBean modelByRecordId;
    private UserCheckBean userCheckByUserCheckId;
}
