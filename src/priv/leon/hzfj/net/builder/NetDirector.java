package priv.leon.hzfj.net.builder;

import java.util.ArrayList;

public class NetDirector {
    private String[] paras=null;
    private String url=new String();

    public NetDirector(String[] paras, String url) {
        this.paras = paras;
        this.url = url;
    }

    public void construct(NetBuilder builder){
        builder.setParas(paras);
        builder.setUrl(url);
    }
}
