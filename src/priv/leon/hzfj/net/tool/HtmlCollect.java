package priv.leon.hzfj.net.tool;

import priv.leon.hzfj.net.interfaces.Get;
import priv.leon.hzfj.net.interfaces.Post;

import java.util.ArrayList;

public class HtmlCollect {
    private Get get=null;
    private Post post=null;

    public HtmlCollect(Get get) {
        this.get = get;
    }

    public HtmlCollect(Post post) {
        this.post = post;
    }

    public String collect(){
        if(post!=null){
            return post.post();
        }else if(get!=null){
            return  get.get();
        }
        return null;
    }
}
