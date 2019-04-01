package com.dong.musicapi.beans.cloud;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by MiChong on 2017/11/22 0022.
 */
public class Comment {

    @SerializedName("result")
    private ResultEntity result;
    @SerializedName("code")
    private int code;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ResultEntity getResult() {
        return result;
    }

    public int getCode() {
        return code;
    }

    public class ResultEntity {
        @SerializedName("songs")
        private List<SongsEntity> songs;

        public void setSongs(List<SongsEntity> songs) {
            this.songs = songs;
        }

        public List<SongsEntity> getSongs() {
            return songs;
        }


        public class SongsEntity {
            @SerializedName("ar")
            private List<ArtistsEntity> artists;
            private String name;
            @SerializedName("al")
            private ImgageEntity img;

            private List<?> alias;
            private int id;

            public void setArtists(List<ArtistsEntity> artists) {
                this.artists = artists;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }

            public void setId(int id) {
                this.id = id;
            }

            public List<ArtistsEntity> getArtists() {
                return artists;
            }

            public String getName() {
                return name;
            }

            public List<?> getAlias() {
                return alias;
            }

            public int getId() {
                return id;
            }

            public ImgageEntity getImg() {
                return img;
            }

            public void setImg(ImgageEntity img) {
                this.img = img;
            }

            public class ArtistsEntity {
                @SerializedName("name")
                private String name;
                @SerializedName("alias")
                private List<?> alias;
                private int id;

                public void setName(String name) {
                    this.name = name;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public int getId() {
                    return id;
                }

            }
            public class ImgageEntity{
                private int id;
                private String name;
                private String picUrl;
                private String pic_str;
                private String pic;

                public int getId() {
                    return id;
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

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getPic_str() {
                    return pic_str;
                }

                public void setPic_str(String pic_str) {
                    this.pic_str = pic_str;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                @Override
                public String toString() {
                    return "ImgageEntity{" +
                            "id=" + id +
                            ", name='" + name + '\'' +
                            ", picUrl='" + picUrl + '\'' +
                            ", pic_str='" + pic_str + '\'' +
                            ", pic='" + pic + '\'' +
                            '}';
                }
            }

        }
    }
}
