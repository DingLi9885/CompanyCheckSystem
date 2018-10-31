package team.yingyingmonster.ccs.service.serviceimplement;

import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;
import team.yingyingmonster.ccs.database.mapper.AccountMapper;
import team.yingyingmonster.ccs.service.serviceinterface.AccountService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DingLi <br/>
 * - project: CompanyCheckSystem
 * - create: 14:51 2018/10/30
 * - 专门用于，账户管理，显示，增删改查
 **/

public class AccountServiceImplement implements AccountService {
    private String flag;
    private List accountList;
    @Resource
    AccountMapper accountMapper;
    //用户新增
    @Override
    public int accountAdd(AccountBean accountbean) {

        return accountMapper.accountAdd(accountbean);
    }
    //用户管理数据页面显示，
    @Override
    public List<AccountBean> accountList(PageBean pageBean) {
        // TODO Auto-generated method stub
        pageBean.setPrevPageNum(pageBean.getPage()*5);
        pageBean.setNextPageNum((pageBean.getPage()*5-5)+1);
        accountList=accountMapper.accountList(pageBean);
        return accountList;
    }
    //获取用户总页数+模糊条件
    @Override
    public int ResultComm(PageBean pageBean) {
        // TODO Auto-generated method stub
        int pageTotal= accountMapper.resultPage(pageBean);
        return pageTotal;
    }
}
