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
@Table(name = "MENU_TABLE")
public class MenuBean {
    private Long menuId;
    private Integer menuState;
    private String menuName;
    private String menuUrl;
}
