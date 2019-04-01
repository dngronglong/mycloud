package com.dong.musicapi.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MusicHQ implements Serializable {
    @SerializedName("mid")
    private String mid;
    @SerializedName("m4a")
    private String m4a;
    @SerializedName("mp3_l")
    private String mp3_l;
    @SerializedName("mp3_h")
    private String mp3_h;
    @SerializedName("flac")
    private String flac;
    @SerializedName("songname")
    private String songName;
    @SerializedName("albumname")
    private String albumName;
    @SerializedName("singerName")
    private String singerName;
    @SerializedName("pic")
    private String pic;

    public MusicHQ() {
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getM4a() {
        return m4a;
    }

    public void setM4a(String m4a) {
        this.m4a = m4a;
    }

    public String getMp3_l() {
        return mp3_l;
    }

    public void setMp3_l(String mp3_l) {
        this.mp3_l = mp3_l;
    }

    public String getMp3_h() {
        return mp3_h;
    }

    public void setMp3_h(String mp3_h) {
        this.mp3_h = mp3_h;
    }

    public String getFlac() {
        return flac;
    }

    public void setFlac(String flac) {
        this.flac = flac;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "MusicHQ{" +
                "mid='" + mid + '\'' +
                ", m4a='" + m4a + '\'' +
                ", mp3_l='" + mp3_l + '\'' +
                ", mp3_h='" + mp3_h + '\'' +
                ", flac='" + flac + '\'' +
                ", songName='" + songName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", singerName='" + singerName + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
