package com.qf.vo;

import java.util.List;

public class IdsVo {

    private int id;

    private List<Integer> ids;

    private List<Integer> unIds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Integer> getUnIds() {
        return unIds;
    }

    public void setUnIds(List<Integer> unIds) {
        this.unIds = unIds;
    }

    @Override
    public String toString() {
        return "IdsVo{" +
                "id=" + id +
                ", ids=" + ids +
                ", unIds=" + unIds +
                '}';
    }
}
