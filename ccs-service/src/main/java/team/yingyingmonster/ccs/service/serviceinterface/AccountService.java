package team.yingyingmonster.ccs.service.serviceinterface;

import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;

import java.util.List;

public interface AccountService {
    public int accountAdd(AccountBean accountbean);//新增用户
    public List<AccountBean> accountList(PageBean pageBean);//用户列表显示
    public int ResultComm(PageBean pageBean);//获取用户总页数+模糊条件
}
