package cn.wolfcode.rbac.util;


public class QueryObject {
    //接收用户传递进来的参数
    private int currentPage = 1; //当前页
    private int pageSize = 5;   //每页显示多少数据

//    起始索引
    public int getStart(){
        return (currentPage-1)*pageSize;
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
