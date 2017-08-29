package priv.leon.hzfj.net.builder;

import java.util.ArrayList;

public abstract class NetBuilder {
    /*
    设置参数
    设置Url
     */
    public abstract void setParas(String[] list);
    public abstract void setUrl(String url);
    public abstract ArrayList<String> getResult();
}
