package com.odianyun.internship.model;

import java.util.List;


public class ListResult<T> {

    private Long total;

    private Integer pages;

    private List<T> list;


    public ListResult(){}

    public ListResult(Long total, Integer pages, List<T> list){
        this.total = total;
        this.pages = pages;
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list=list;
    }
}
