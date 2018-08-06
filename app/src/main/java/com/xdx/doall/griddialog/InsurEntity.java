package com.xdx.doall.griddialog;

/**
 * Created by xdx on 2018/7/30.
 */
public class InsurEntity {
    boolean isSelect;
    String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public InsurEntity() {
    }

    public InsurEntity(String name, boolean isSelect) {
        this.isSelect = isSelect;
        this.name = name;
    }
}
