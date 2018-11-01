package team.yingyingmonster.ccs.database.mapper;

import team.yingyingmonster.ccs.database.bean.MenuBean;

import java.util.List;

public interface MenuMapper {
    int insertMenu(MenuBean menuBean);

    List<MenuBean> selectMenuByCondition(MenuBean condition);
    List<MenuBean> selectAllMenu();
}
