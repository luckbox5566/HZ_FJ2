package priv.leon.hzfj.net.post.body;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class WeekPostBody {
    private RequestBody body;


    public WeekPostBody(String page) {
        body = new FormBody.Builder()
                .add("page", page)
                .add("keywords","")
                .add("cid","25163444")
                .add("sid","33")
                .add("pid","")
                .add("type","")
                .build();
    }

    public RequestBody getBody() {
        return body;
    }
}
