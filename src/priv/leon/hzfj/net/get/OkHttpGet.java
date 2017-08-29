package priv.leon.hzfj.net.get;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import priv.leon.hzfj.app.net.TmsfParasApp;
import priv.leon.hzfj.net.OkHttpSingle;
import priv.leon.hzfj.net.interfaces.Get;

import java.io.IOException;
/*
通过url进行网络请求，返回结果
 */
public class OkHttpGet implements Get{

   private String url="";

    public OkHttpGet(String url) {
        this.url = url;
    }

    public String get(){

        OkHttpSingle single=OkHttpSingle.getInstance();
        OkHttpClient client=single.getOkHttpClient();
        Request request=new Request.Builder()
                .url(url)
                .addHeader("Accept", TmsfParasApp.Accept)
                .addHeader("Accept-Language",TmsfParasApp.Accept_Language)
                .addHeader("Connection",TmsfParasApp.Connection)
                .addHeader("User-Agent",TmsfParasApp.User_Agent)
                .build();
        Call call=client.newCall(request);
        try {
            Response response=call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return "出现错误："+e.toString();
        }

    }
}
