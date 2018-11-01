package team.yingyingmonster.ccs.controller.action;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import team.yingyingmonster.ccs.commons.PageUtil;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;
import team.yingyingmonster.ccs.service.serviceinterface.AccountBiz;

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
@RequestMapping("/background-management")
public class AccountHandle {
    private List accountList;
@Resource
private AccountBiz accountBiz;
// 获取用户管理的显示数据,需要分页和模糊查找

    @RequestMapping(value = "/accountListAction")
    public ModelAndView userList(HttpServletRequest request, PageBean pageBean) {
        //带入搜索条件
        accountList=accountBiz.accountList(pageBean);

        int pageNumber=accountBiz.ResultComm(pageBean);
        int pageTotal= PageUtil.pageTotal(pageNumber);
        //总页数带模糊查找的总页数
        ModelAndView mav = new ModelAndView();
        mav.addObject("accountlist",accountList);//相当于req.sett
        mav.addObject("blurred",pageBean);//模糊查找的对象
        mav.addObject("pagenum",pageNumber);
        mav.addObject("pageTotal",pageTotal);//返回总页数
        mav.setViewName("background-management/account-management");
        return mav;
    }
    //新增用户
    @RequestMapping(value="/accountAdd")
    public ModelAndView accountAdd(HttpServletRequest request,AccountBean accountBean) {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("background-management/account-managerment-add");
        return modelAndView;
    }

    //用户增加插入到数据库
    @RequestMapping(value="/accountAddSave")
    public String accountAddSave(HttpServletRequest request,AccountBean accountBean,
                                  int roleId) {
        int roleid = roleId;
        accountBiz.accountAdd(accountBean);


        return "redirect:accountList";
    }
}
