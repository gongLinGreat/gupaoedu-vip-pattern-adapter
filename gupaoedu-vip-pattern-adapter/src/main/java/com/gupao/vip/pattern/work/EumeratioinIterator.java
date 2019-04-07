package com.gupao.vip.pattern.work;

import java.util.Enumeration;
import java.util.Iterator;

public class EumeratioinIterator implements Iterator {
    Enumeration enumeration;

    public EumeratioinIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    /**
     * 枚举不支持删除
     */
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
