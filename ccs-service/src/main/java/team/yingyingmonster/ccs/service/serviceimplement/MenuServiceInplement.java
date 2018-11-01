package team.yingyingmonster.ccs.service.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.MenuBean;
import team.yingyingmonster.ccs.database.bean.RoleMenuBean;
import team.yingyingmonster.ccs.database.mapper.MenuMapper;
import team.yingyingmonster.ccs.service.Parameter;
import team.yingyingmonster.ccs.service.serviceinterface.MenuService;

import java.util.List;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 17:13 2018/10/31
 * -
 **/
@Service
public class MenuServiceInplement implements MenuService {
    @Autowired
    private Parameter parameter;
    @Autowired
    private MenuMapper menuMapper;
    // TODO: 等待后台完成权限配置，然后继续编写
//    @Autowired
//    private RoleMenuMapper roleMenuMapper;
//    @Autowired
//    private RoleMapper roleMapper;

    @Override
    public boolean hasPremission(AccountBean accountBean, MenuBean menuBean) {
        RoleMenuBean roleMenuBean = new RoleMenuBean();
        roleMenuBean.setMenuId(menuBean.getMenuId());
        roleMenuBean.setRoleId(accountBean.getRoleId());
//        List<RoleMenuBean> list = roleMenuMapper.selectRoleMenuByCondition(roleMenuBean);
        // 在完成之前，默认返回true
        return true;
    }

    @Override
    public List<MenuBean> selectAccountMenuByRoleId(Long roleId) {
        // TODO: 判断角色ID，然后返回相应的菜单，这里默认返回所有菜单。
//        MenuBean condition = new MenuBean();
//        List<MenuBean> list = roleId==parameter.getConfigValue("SuperUserRole", "10000")?menuMapper.selectAllMenu():menuMapper.selectMenuByCondition();
        List<MenuBean> list = menuMapper.selectAllMenu();
        return list;
    }
}
