package team.yingyingmonster.ccs.database.mapper;

import org.springframework.stereotype.Repository;
import team.yingyingmonster.ccs.database.bean.MenuBean;

import java.util.List;

@Repository
public interface MenuMapper {
    int insertMenu(MenuBean menuBean);

    int updateMenu(MenuBean menuBean);

    List<MenuBean> selectMenuByCondition(MenuBean condition);
    List<MenuBean> selectAllMenu();
}
