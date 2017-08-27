package priv.leon.hzfj.net.post;

import okhttp3.*;

import java.io.IOException;

public class OkHttpPost {
    private String url="";
    private String page="";
    private WeekRequestBody weekRequestBody;
    private RequestBody body;

    private OkHttpClient okHttpClient;

    public OkHttpPost(String url, String page) {
        this.url = url;
        this.page = page;
        weekRequestBody=new WeekRequestBody(page);
        body=weekRequestBody.getBody();
        okHttpClient= OkHttpSingle.getInstance().getOkHttpClient();
    }

    public String post(){
        Request request=new Request.Builder()
                .url(url)
                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                //.addHeader("Accept-Encoding","gzip, deflate")
                .addHeader("Accept-Language","zh-CN,zh;q=0.8")
                .addHeader("Cache-Control:","max-age=0")
                .addHeader("Content-Length","47")
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .addHeader("Cookie","UM_distinctid=15e1974c2e670-030e49fba3c732-5d4e211f-15f900-15e1974c2e73ef; bdshare_firstime=1503665636466; Hm_lvt_5bbc90d068807d82c72909ecd298e11a=1503665773; CNZZDATA4179430=cnzz_eid%3D1037667381-1503662547-null%26ntime%3D1503662547; ROUTEID=.lb9; JSESSIONID=CCC06838BBB3046305D5FD79099A21C5.lb9; CNZZDATA1253675216=1563976535-1503665636-null%7C1503819374; Hm_lvt_bbb8b9db5fbc7576fd868d7931c80ee1=1503665333,1503665632,1503811025; Hm_lpvt_bbb8b9db5fbc7576fd868d7931c80ee1=1503821757")
                .addHeader("Host","www.tmsf.com")
                .addHeader("Origin","http://www.tmsf.com")
                .addHeader("Proxy-Connection","keep-alive")
                .addHeader("Referer","http://www.tmsf.com/info/search_infolist.htm")
                .addHeader("Upgrade-Insecure-Requests","1")
                .addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
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
