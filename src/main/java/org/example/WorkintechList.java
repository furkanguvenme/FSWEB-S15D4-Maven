package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
           return false;
        }
        return super.add(o);
    }

    public void sort(){
        Collections.sort(this);
    }

    public boolean remove(Object obj) {
        Iterator copyList = this.iterator();

        while(copyList.hasNext()){
            if (copyList.next().equals(obj)) {
               copyList.remove();
           }
        }
        this.sort();
        return true;
    }
}
