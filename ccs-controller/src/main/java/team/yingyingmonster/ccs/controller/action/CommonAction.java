package team.yingyingmonster.ccs.controller.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.yingyingmonster.ccs.controller.bean.ResultMessage;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.Menu;
import team.yingyingmonster.ccs.database.bean.MenuBean;
import team.yingyingmonster.ccs.service.serviceinterface.MenuService;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 13:22 2018/10/30
 * -
 **/
@Controller
@RequestMapping("/common")
public class CommonAction {
    private static final String[]
            MENU_URL = {
                "gateway/index",
                "background-management/index"
            },
            MENU_NAME = {
                "门户页面",
                "后台管理"
            };
    @Autowired
    private MenuService menuService;

    /**
     * 获取到假的菜单数据，用于测试。
     * @return 菜单列表。
     */
    @RequestMapping("/dummy-menu")
    @ResponseBody
    public List<Menu> dummyMenu() {
        List<Menu> menus = new LinkedList<>();

        for (Integer i = 0; i < MENU_URL.length; i++) {
            Menu menu = new Menu();
            menu.setMenuId(i.longValue());
            menu.setMenuUrl(MENU_URL[i]);
            menu.setMenuName(MENU_NAME[i]);
            menu.setMenuState(0);

            menus.add(menu);
        }

        return menus;
    }

    /**
     * 根据登入的对象获取菜单列表。
     * @param session
     * @return 包含菜单列表的返回值信息对象。
     */
    @RequestMapping("/get-menu")
    @ResponseBody
    public ResultMessage getMenu(HttpSession session) {
        AccountBean accountBean = (AccountBean) session.getAttribute("login-account");
        Long roleId;
        if (accountBean == null)
            roleId = 0l;
        else
            roleId = accountBean.getRoleId();

        List<MenuBean> menuList = menuService.selectAccountMenuByRoleId(roleId);
        return ResultMessage.createSuccessMessage("获取成功！", menuList);
    }

    /**
     * 获取登入账号的账号信息。
     * @param session
     * @return
     */
    @RequestMapping("/user-info")
    @ResponseBody
    public ResultMessage userInfo(HttpSession session) {
        AccountBean accountBean = (AccountBean) session.getAttribute("login-account");
        return accountBean == null?
                ResultMessage.createErrorMessage("尚未登入！", null):
                ResultMessage.createSuccessMessage("获取成功！", accountBean);
    }
}
