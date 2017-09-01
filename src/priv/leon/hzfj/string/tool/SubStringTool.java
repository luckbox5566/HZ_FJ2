package priv.leon.hzfj.string.tool;

public class SubStringTool {
    public static String sub(String s,String start,String end){
        int w1=s.indexOf(start)+start.length();
        int w2=s.indexOf(end);
        if(w1<0||w2<0){
            return "0";
        }else{
            return  s.substring(w1,w2).trim();
        }

    }
}
