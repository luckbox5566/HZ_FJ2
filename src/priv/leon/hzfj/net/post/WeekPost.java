package priv.leon.hzfj.net.post;

import okhttp3.*;
import priv.leon.hzfj.app.net.TmsfParasApp;
import priv.leon.hzfj.net.OkHttpSingle;
import priv.leon.hzfj.net.interfaces.Post;
import priv.leon.hzfj.net.post.body.WeekPostBody;

import java.io.IOException;

public class WeekPost implements Post{
    private String url="";
    private String page="";
    private WeekPostBody weekPostBody;
    private RequestBody body;

    private OkHttpClient okHttpClient;

    public WeekPost(String url, String page) {
        this.url = url;
        this.page = page;
        weekPostBody =new WeekPostBody(page);
        body= weekPostBody.getBody();
        okHttpClient= OkHttpSingle.getInstance().getOkHttpClient();
    }

    public String post(){
        Request request=new Request.Builder()
                .url(url)
                .addHeader("Accept", TmsfParasApp.Accept)
                //.addHeader("Accept-Encoding","gzip, deflate")
                .addHeader("Accept-Language",TmsfParasApp.Accept_Language)
                .addHeader("Cache-Control:",TmsfParasApp.Cache_Control)
                .addHeader("Content-Length",TmsfParasApp.Content_Length)
                .addHeader("Content-Type",TmsfParasApp.Content_Type)
                .addHeader("Cookie",TmsfParasApp.Cookie)
                .addHeader("Host",TmsfParasApp.Host)
                .addHeader("Proxy-Connection",TmsfParasApp.Proxy_Connection)
                .addHeader("Upgrade-Insecure-Requests",TmsfParasApp.Upgrade_Insecure_Requests)
                .addHeader("User-Agent",TmsfParasApp.User_Agent)
                .post(body)
                .build();

        Call call=okHttpClient.newCall(request);
        try {
            Response response=call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return "出现错误："+e.toString();
        }


    }


}
