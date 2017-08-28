package priv.leon.hzfj.string.tool;

import priv.leon.hzfj.string.interfaces.Pattern;

import java.util.ArrayList;
/*
把所有匹配到的，收集起来返回
 */
public class Collect {
    public static ArrayList<String> collect(ArrayList<String> list, Pattern pattern){
        ArrayList<String> return_list=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            ArrayList<String> pattern_list=new ArrayList<>();
            pattern_list=pattern.matcher(list.get(i));
            if(pattern_list.size()>0){
               for(int j=0;j<pattern_list.size();j++){
                  return_list.add(pattern_list.get(j));
               }
            }
        }
        return return_list;
    }
}
