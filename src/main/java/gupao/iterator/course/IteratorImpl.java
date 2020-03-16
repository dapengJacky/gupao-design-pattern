package gupao.iterator.course;

import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class IteratorImpl<E> implements Iterator<E> {
    private List<E> list;
    private E element;
    private int cursor;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor!=list.size();
    }

    @Override
    public E next() {
        System.out.println("当前位置下标"+cursor);
        element = list.get(cursor);
        cursor++;
        return element;
    }
}
