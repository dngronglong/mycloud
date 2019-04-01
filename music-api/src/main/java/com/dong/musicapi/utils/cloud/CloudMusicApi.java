package com.dong.musicapi.utils.cloud;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/8/14
 * Time:14:57
 */
public class CloudMusicApi {
    private final static String BaseURL = "http://music.163.com/";

    /**
     * 获取用户歌单
     *
     * @param uid
     * @return
     */
    public static UrlParamPair getPlaylistOfUser(String uid) {
        UrlParamPair upp = new UrlParamPair();
        upp.setUrl(BaseURL + "weapi/user/playlist?csrf_token=");
        upp.addPara("offset", 0);
        upp.addPara("uid", uid);
        upp.addPara("limit", 20);
        upp.addPara("csrf_token", "nothing");
        return upp;
    }

    /**
     * 获取歌单详情
     *
     * @param playlist_id
     * @return
     */
    public static UrlParamPair getDetailOfPlaylist(String playlist_id) {
        UrlParamPair upp = new UrlParamPair();
        upp.addPara("id", playlist_id);
        upp.addPara("offset", 0);
        upp.addPara("total", "True");
        upp.addPara("limit", 100);
        upp.addPara("n", 1000);
        upp.addPara("csrf_token", "nothing");
        return upp;
    }
    //todo:analyse more api
    /**
     * 搜索歌曲
     *
     * @param s;
     * @return
     */
    public static UrlParamPair SearchMusicList(String s,String type,String offset,String limit) {
        UrlParamPair upp = new UrlParamPair();
        upp.addPara("s", s);
        upp.addPara("type",type);
        upp.addPara("offset", offset);
//        upp.addPara("total", "True");
        upp.addPara("limit", limit);
//        upp.addPara("n", 1000);
//        upp.addPara("csrf_token", "nothing");
        return upp;
    }
}
