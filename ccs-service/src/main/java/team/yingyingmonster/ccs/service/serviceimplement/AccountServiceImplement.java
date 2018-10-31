package team.yingyingmonster.ccs.service.serviceimplement;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
@Service
public class AccountServiceImplement implements AccountService {
    private String flag;
    private List accountList;
    @Autowired
    private AccountMapper accountMapper;

    //用户新增
    @Override
    public int insertAccount(AccountBean accountbean) {
        return accountMapper.insertAccount(accountbean);
    }

    @Override
    public PageInfo<AccountBean> selectAccountPage(Integer pageNum, Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 5;

        Page<AccountBean> page = PageHelper.startPage(pageNum, pageSize);
        List<AccountBean> list = accountMapper.selectAllAccount();

        return new PageInfo<>(page);
    }

    //用户管理数据页面显示，
//    @Override
//    public List<AccountBean> accountList(PageBean pageBean) {
//        pageBean.setPrevPageNum(pageBean.getPage()*5);
//        pageBean.setNextPageNum((pageBean.getPage()*5-5)+1);
//        accountList = accountMapper.accountList(pageBean);
//        return accountList;
//    }

    //获取用户总页数+模糊条件
//    @Override
//    public int ResultComm(PageBean pageBean) {
//        // TODO Auto-generated method stub
//        int pageTotal= accountMapper.resultPage(pageBean);
//        return pageTotal;
//    }
}
