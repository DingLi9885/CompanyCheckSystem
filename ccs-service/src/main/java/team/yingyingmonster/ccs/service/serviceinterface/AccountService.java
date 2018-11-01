package team.yingyingmonster.ccs.service.serviceinterface;

<<<<<<< HEAD
=======
import com.github.pagehelper.PageInfo;
>>>>>>> 38c93c0b62ac921835b4f39eda276f9c576868a0
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;

import java.util.List;

public interface AccountService {
<<<<<<< HEAD
    public int accountAdd(AccountBean accountbean);//新增用户
    public List<AccountBean> accountList(PageBean pageBean);//用户列表显示
    public int ResultComm(PageBean pageBean);//获取用户总页数+模糊条件
=======
    int insertAccount(AccountBean accountbean);//新增用户
    PageInfo<AccountBean> selectAccountPage(Integer pageNum, Integer pageSize);
>>>>>>> 38c93c0b62ac921835b4f39eda276f9c576868a0
}
