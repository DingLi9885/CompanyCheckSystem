package team.yingyingmonster.ccs.controller.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import team.yingyingmonster.ccs.controller.bean.ResultMessage;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;
import team.yingyingmonster.ccs.service.serviceinterface.AccountService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author DingLi <br/>
 * - project: CompanyCheckSystem
 * - create: 11:54 2018/10/30
 * - 账号管理
 **/
@Controller
@RequestMapping("/account-management")
public class AccountHandle {
    private List accountList;
@Resource
private AccountService accountService;
// 获取用户管理的显示数据,需要分页和模糊查找

    @RequestMapping(value = "/account-list-action")
    @ResponseBody
    public ResultMessage userList(HttpServletRequest request, PageBean pageBean) {
        //带入搜索条件
        accountList=accountService.accountList(pageBean);

        int pageNumber=accountService.ResultComm(pageBean);
        int pageTotal= PageUtil.pageTotal(pageNumber);
        //总页数带模糊查找的总页数
        ResultMessage resultMessage = ResultMessage.createSuccessMessage(null,accountList);

        return resultMessage;
    }
    //新增用户
    @RequestMapping(value="/account-add")
    public ModelAndView accountAdd(HttpServletRequest request,AccountBean accountBean) {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("background-management/account-managerment-add");
        return modelAndView;
    }

    //用户增加插入到数据库
    @RequestMapping(value="/account-add-save")
    public String accountAddSave(HttpServletRequest request,AccountBean accountBean,
                                  int roleId) {
        int roleid = roleId;
        accountService.accountAdd(accountBean);


        return "redirect:accountList";
    }
}
