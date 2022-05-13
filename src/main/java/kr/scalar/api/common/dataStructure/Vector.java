package kr.scalar.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

/**
 * packageName: kr.scalar.api.common.dataStructure
 * fileName   : Trunk
 * author     : parkjungkwan
 * date       : 2022-05-12
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-12   parkjungkwan  최초 생성
 */
@Data @Component @Lazy
public class Vector<T> {
    private ArrayList<T> list;
    // add, set, remove, get(), X, get(i), size, X, clear
    // save, update, delete, findAll, findByName, findById, count, existsById, clear

    public Vector() {
        this.list = new ArrayList<>();
    }

    public void add(T t){list.add(t);}
    public void set(int i,T t){list.set(i, t);}
    public void remove(T t){list.remove(t);}
    public ArrayList<T> get(){return list;}
    public T get(int i){return list.get(i);}
    public int size(){return list.size();}
    public void clear(){list.clear();}
}
