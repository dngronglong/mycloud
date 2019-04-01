package com.dong.musicapi.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/7/16
 * Time:15:45
 */

public class TopBean {
    private String code;
    private String date;
    @SerializedName("songlist")
    private List<SongList> songList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<SongList> getSongList() {
        return songList;
    }

    public void setSongList(List<SongList> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "TopBean{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", songList=" + songList +
                '}';
    }

    public class SongList{



        @SerializedName("data")
        private Song song;

        public Song getSong() {
            return song;
        }

        public void setSong(Song song) {
            this.song = song;
        }

    }
    public class Singer{
        @SerializedName("name")
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Singer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public class Song{
        @SerializedName("singer")
        private List<Singer> listSinger;
        @SerializedName("f")
        private String f;
        @SerializedName("songname")
        private String musicName;
        @SerializedName("fsinger")
        private String singer;
        @SerializedName("albumdesc")
        private String album;
        @SerializedName("songmid")
        private String mid;
        private String lyricSrc;
        private String pic;
        public List<Singer> getListSinger() {
            return listSinger;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public void setListSinger(List<Singer> listSinger) {
            this.listSinger = listSinger;
        }

        public String getF() {
            return f;
        }

        public void setF(String f) {
            this.f = f;
        }

        public String getMusicName() {
            return musicName;
        }

        public void setMusicName(String musicName) {
            this.musicName = musicName;
        }

        public String getSinger() {
            return singer;
        }

        public void setSinger(String singer) {
            this.singer = singer;
        }

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getLyricSrc() {
            return lyricSrc;
        }

        public void setLyricSrc(String lyricSrc) {
            this.lyricSrc = lyricSrc;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "f='" + f + '\'' +
                    ", musicName='" + musicName + '\'' +
                    ", singer='" + singer + '\'' +
                    ", album='" + album + '\'' +
                    ", mid='" + mid + '\'' +
                    ", lyricSrc='" + lyricSrc + '\'' +
                    '}';
        }
    }
}
