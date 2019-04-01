package com.dong.musicapi.beans;

import java.io.Serializable;

public class SongListBean implements Serializable {
    private int id;
    private String name;
    private int u_id;
    public SongListBean() {
    }

    public int getId() {
        return id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SongListBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", u_id=" + u_id +
                '}';
    }
}
