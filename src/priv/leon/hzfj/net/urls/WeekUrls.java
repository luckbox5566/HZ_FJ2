package priv.leon.hzfj.net.urls;

import java.util.ArrayList;

public class WeekUrls {
    private static final int START=1;
    private static final int END=44;
    private static int[] pages=new int[END];


    public static int[] pages(){

        for(int i=0;i<END;i++){
          pages[i]=i+1;
        }

        return pages;
    }

}
