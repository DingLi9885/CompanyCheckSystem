package team.yingyingmonster.ccs.service.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.MenuBean;
import team.yingyingmonster.ccs.database.mapper.MenuMapper;
import team.yingyingmonster.ccs.service.serviceinterface.MenuService;

import java.util.List;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 17:13 2018/10/31
 * -
 **/
public class MenuServiceInplement implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public boolean hasPremission(AccountBean accountBean, MenuBean menuBean) {
        return false;
    }

    @Override
    public List<MenuBean> selectAccountMenuByRoleId(Long roleId) {
        return null;
    }
}
