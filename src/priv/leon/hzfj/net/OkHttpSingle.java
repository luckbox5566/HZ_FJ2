package priv.leon.hzfj.net;

import okhttp3.OkHttpClient;

public class OkHttpSingle {
    private String url="";
    private static OkHttpSingle instance=null;
    private OkHttpClient okHttpClient;

    private OkHttpSingle() {
        okHttpClient=new OkHttpClient();
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
