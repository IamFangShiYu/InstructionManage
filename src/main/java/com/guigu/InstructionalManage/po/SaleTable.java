package com.guigu.InstructionalManage.po;

public class SaleTable {
    private Integer saleid;

    private String salename;

    private String saleaddr;

    private Integer saletel;

    private String saleother;

    private String salepwd;

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public String getSalename() {
        return salename;
    }

    public void setSalename(String salename) {
        this.salename = salename == null ? null : salename.trim();
    }

    public String getSaleaddr() {
        return saleaddr;
    }

    public void setSaleaddr(String saleaddr) {
        this.saleaddr = saleaddr == null ? null : saleaddr.trim();
    }

    public Integer getSaletel() {
        return saletel;
    }

    public void setSaletel(Integer saletel) {
        this.saletel = saletel;
    }

    public String getSaleother() {
        return saleother;
    }

    public void setSaleother(String saleother) {
        this.saleother = saleother == null ? null : saleother.trim();
    }

    public String getSalepwd() {
        return salepwd;
    }

    public void setSalepwd(String salepwd) {
        this.salepwd = salepwd == null ? null : salepwd.trim();
    }
}