package task;

import java.util.Collections;
import java.util.List;

public class ListRevert {
    public List revertList(List data) {
        Collections.reverse(data);
        return data;
    }
    public List revertList2(List data) {
        for(int i=0;i<data.size()/2;i++){
            Object old=data.set(i,data.size()-1);
            data.set(data.size()-1,old);
        }
        return data;
    }



}
