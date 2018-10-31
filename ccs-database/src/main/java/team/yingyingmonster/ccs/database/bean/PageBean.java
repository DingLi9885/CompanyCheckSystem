package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author DingLi <br/>
 * - project: CompanyCheckSystem
 * - create: 15:42 2018/10/30
 * - 分页专用实体类
 **/
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PageBean {
    private int pageNum=1;//当前页数

    private Integer currentPageNum;//当前页数
    private Integer pageSize; //每页显示的数据条数
    private Integer totalPage; //总页数
    private Integer totalRecord;//记录总条数

    private int page=1;//初始页数

    private List records; //记录

    private Integer startIndex; //开始索引
    private Integer endIndex; //每页记录末尾的索引值
    //页面显示页码
    private Integer prevPageNum; //上一页码
    private Integer nextPageNum; //下一页页码

    private String userName; //账户名称
    private String typeofparameter; //账户状态
    private String adminName; //后台用户姓名
    private Timestamp registerDate;

    public PageBean(int currentPageNum,int totalRecord,int pageSize) {
        super();
        this.currentPageNum = currentPageNum;
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
        //计算总页数
        totalPage = totalRecord % pageSize == 0 ? totalRecord/pageSize : totalRecord/pageSize + 1;
        prevPageNum = currentPageNum - 1 > 0 ? currentPageNum - 1 :1;//初始化上一页的值
        nextPageNum  = currentPageNum + 1 > totalPage ? currentPageNum //初始化下一页的值
                :currentPageNum + 1;

        //计算每页开始的索引值
        startIndex = (currentPageNum - 1) * pageSize; //初始化上一页的值
        endIndex = currentPageNum * pageSize + 1; //初始化下一页的值
    }
}
