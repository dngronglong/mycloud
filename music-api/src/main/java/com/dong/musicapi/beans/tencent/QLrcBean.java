package com.dong.musicapi.beans.tencent;

import java.io.Serializable;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/8/15
 * Time:16:09
 */
public class QLrcBean implements Serializable {
    private int retcode;
    private int code;
    private int subcode;
    private String lyric;

    public QLrcBean() {
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSubcode() {
        return subcode;
    }

    public void setSubcode(int subcode) {
        this.subcode = subcode;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    @Override
    public String toString() {
        return "QLrcBean{" +
                "retcode=" + retcode +
                ", code=" + code +
                ", subcode=" + subcode +
                ", lyric='" + lyric + '\'' +
                '}';
    }
}
