package cn.wolfcode.rbac.util;

import java.util.Collections;
import java.util.List;

//分页
public class PageResuilt {
//    需要查询数据库
    private List data; //从数据库查询出全部的数据集
    private int totalCount;  //数据总条数

//    计算出来的
    private int totalPage; //总页数
    private int prevPage;  //上一页
    private int nextPage; //下一页

//    用户输入的
    private int currentPage; //当前页
    private int pageSize;  //每页显示多少条

//    构造器
//    有数据的情况下,调用这个全参构造器
    public PageResuilt(List data, int totalCount, int currentPage, int pageSize) {
        this.data = data;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalPage = totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1;
        this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
        this.nextPage = currentPage + 1 <= this.totalPage ? currentPage + 1 : this.totalPage;
    }

//    重载
//    没有数据的情况下,调用缺参数构造器
    public PageResuilt(int pageSize,int currentPage){
        this.data = Collections.EMPTY_LIST;
        this.totalCount = 0;
        this.pageSize = pageSize;
        this.currentPage =currentPage;

    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
