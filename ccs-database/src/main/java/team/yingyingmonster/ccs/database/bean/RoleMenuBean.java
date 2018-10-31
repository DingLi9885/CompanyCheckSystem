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
@Table(name = "ROLE_MENU_TABLE")
public class RoleMenuBean {
    private Long roleId;
    private Long menuId;

    private RoleBean roleByRoleId;
    private MenuBean menuByMenuId;
}
