package com.dong.musicapi.secret;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class JSSecret {
    private static Invocable inv;
    public static final String encText = "encText";
    public static final String encSecKey = "encSecKey";
    File file= new File(new URI(this.getClass().getResource("/static/js/core.js").toString()));;
    /**
     * 从本地加载修改后的 js 文件到 scriptEngine
     */
    static {
        try {
            JSSecret jsSecret=new JSSecret();
            System.out.println(jsSecret.file);
            Path path = Paths.get(jsSecret.file.toURI());
            byte[] bytes = Files.readAllBytes(path);
            String js = new String(bytes);
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName("JavaScript");
            engine.eval(js);
            inv = (Invocable) engine;
            System.out.println("加载中...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JSSecret() throws URISyntaxException {
    }

    public static ScriptObjectMirror get_params(String paras) throws Exception {
        ScriptObjectMirror so = (ScriptObjectMirror) inv.invokeFunction("myFunc", paras);
        return so;
    }

    public static HashMap<String, String> getDatas(String paras) {
        try {
            ScriptObjectMirror so = (ScriptObjectMirror) inv.invokeFunction("myFunc", paras);

//            Set<Map.Entry<String, Object>> entries = so.entrySet();
//            for (Map.Entry<String,Object> map: entries) {
//                System.out.println("key:"+map.getKey());
//                System.out.println("value:"+map.getValue());
//            }
//

            HashMap<String, String> datas = new HashMap<>();
            datas.put("params", so.get(JSSecret.encText).toString());
            datas.put("encSecKey", so.get(JSSecret.encSecKey).toString());
            return datas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
