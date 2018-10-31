package team.yingyingmonster.ccs.service.serviceinterface;

import com.github.pagehelper.PageInfo;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;

import java.util.List;

public interface AccountService {
    int insertAccount(AccountBean accountbean);//新增用户
    PageInfo<AccountBean> selectAccountPage(Integer pageNum, Integer pageSize);
}
