package priv.leon.hzfj.net.post;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class WeekRequestBody {
    private RequestBody body;


    public WeekRequestBody(String page) {
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
