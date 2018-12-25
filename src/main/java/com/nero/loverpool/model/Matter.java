package com.nero.loverpool.model;

import java.util.Date;

public class Matter {
    private String matterid;

    private String mattername;

    private Date createtime;

    private Date completetime;

    private String categoryid;

    public String getMatterid() {
        return matterid;
    }

    public void setMatterid(String matterid) {
        this.matterid = matterid;
    }

    public String getMattername() {
        return mattername;
    }

    public void setMattername(String mattername) {
        this.mattername = mattername;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
}