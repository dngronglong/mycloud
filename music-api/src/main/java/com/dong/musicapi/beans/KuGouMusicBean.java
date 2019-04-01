package com.dong.musicapi.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/7/18
 * Time:11:49
 */
public class KuGouMusicBean {
    private String status;//状态
    private String err_code;//错误代码
    public Data data;//数据

    public class Data{
        @SerializedName("page")
        private String page;//当前页数
        @SerializedName("lists")
        public List<Song> list;//歌曲信息
        @SerializedName("total")
        private String total;//总页数
        @SerializedName("pagesize")
        private String pageSize;//每页显示得数量

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public List<Song> getList() {
            return list;
        }

        public void setList(List<Song> list) {
            this.list = list;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getPageSize() {
            return pageSize;
        }

        public void setPageSize(String pageSize) {
            this.pageSize = pageSize;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "page='" + page + '\'' +
                    ", list=" + list +
                    ", total='" + total + '\'' +
                    ", pageSize='" + pageSize + '\'' +
                    '}';
        }
    }

    public class Song{
        @SerializedName("SongName")
        private String songName;//音乐名字
//        @SerializedName("OriOtherName")
//        private String oriOtherName;//分类
        @SerializedName("AlbumName")
        private String albumName;//专辑名字
        @SerializedName("FileHash")
        private String fileHash;//文件hsah
        @SerializedName("FileName")
        private String fileName;//文件名字
        @SerializedName("SingerName")
        private String singerName;//歌手

        public String getSongName() {
            return songName;
        }

        public void setSongName(String songName) {
            this.songName = songName;
        }

//        public String getOriOtherName() {
//            return oriOtherName;
//        }
//
//        public void setOriOtherName(String oriOtherName) {
//            this.oriOtherName = oriOtherName;
//        }

        public String getAlbumName() {
            return albumName;
        }

        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }

        public String getFileHash() {
            return fileHash;
        }

        public void setFileHash(String fileHash) {
            this.fileHash = fileHash;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getSingerName() {
            return singerName;
        }

        public void setSingerName(String singerName) {
            this.singerName = singerName;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "songName='" + songName + '\'' +
//                    ", oriOtherName='" + oriOtherName + '\'' +
                    ", albumName='" + albumName + '\'' +
                    ", fileHash='" + fileHash + '\'' +
                    ", fileName='" + fileName + '\'' +
                    ", singerName='" + singerName + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "KuGouMusicBean{" +
                "status='" + status + '\'' +
                ", err_code='" + err_code + '\'' +
                ", data=" + data +
                '}';
    }
}
