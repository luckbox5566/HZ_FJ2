package priv.leon.hzfj.net;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OkHttpSingle {
    private String url="";
    private static OkHttpSingle instance=null;
    private OkHttpClient okHttpClient;
    private final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();

    private OkHttpSingle() {
        okHttpClient = new OkHttpClient.Builder()
                .cookieJar(new CookieJar() {
                    @Override
                    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                        cookieStore.put(httpUrl.host(), list);
                    }

                    @Override
                    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                        List<Cookie> cookies = cookieStore.get(httpUrl.host());
                        return cookies != null ? cookies : new ArrayList<Cookie>();
                    }
                })
                .build();
    }

    public static OkHttpSingle getInstance(){
        if(instance==null){
            instance =new OkHttpSingle();
        }
        return  instance;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}
