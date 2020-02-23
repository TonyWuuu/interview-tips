package com.tony.interview;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;


//main.java.com.tony.interview.SynchronizedMap<K,V>
public class SynchronizedMap<K,V> implements Serializable {
    private static final long serialVersionUID = 1978198479659022715L;

    private final Map<K,V> m;     // Backing Map
    final Object      mutex;        // Object on which to synchronize

    public SynchronizedMap(Map<K,V> m) {
        if (m==null)
            throw new NullPointerException();
        this.m = m;
        mutex = this;
    }


    public SynchronizedMap(Map<K,V> m, Object mutex) {
        this.m = m;
        this.mutex = mutex;
    }

    public int size() {
        synchronized(mutex) {return m.size();}
    }
    //重写map的emty方法
    public boolean isEmpty() {
        synchronized(mutex) {return m.isEmpty();}
    }
    public boolean containsKey(Object key) {
        synchronized(mutex) {return m.containsKey(key);}
    }
    public boolean containsValue(Object value) {
        synchronized(mutex) {return m.containsValue(value);}
    }
    public V get(Object key) {
        synchronized(mutex) {return m.get(key);}
    }

    public V put(K key, V value) {
        synchronized(mutex) {return m.put(key, value);}
    }
    public V remove(Object key) {
        synchronized(mutex) {return m.remove(key);}
    }
    public void putAll(Map<? extends K, ? extends V> map) {
        synchronized(mutex) {m.putAll(map);}
    }
    public void clear() {
        synchronized(mutex) {m.clear();}
    }

    private transient Set<K> keySet = null;
    private transient Set<Map.Entry<K,V>> entrySet = null;
    private transient Collection<V> values = null;


    public boolean equals(Object o) {
        synchronized(mutex) {return m.equals(o);}
    }
    public int hashCode() {
        synchronized(mutex) {return m.hashCode();}
    }
    public String toString() {
        synchronized(mutex) {return m.toString();}
    }
    private void writeObject(ObjectOutputStream s) throws IOException {
        synchronized(mutex) {s.defaultWriteObject();}
    }
}