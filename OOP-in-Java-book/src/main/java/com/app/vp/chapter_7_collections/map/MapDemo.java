package com.app.vp.chapter_7_collections.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * */
public interface MapDemo {

    //Methods (abstract):
    Map<Integer, Object> map = new Map<Integer, Object>() {

        //return size of map
        @Override
        public int size() {
            return 0;
        }

        //return true if map has element/s
        @Override
        public boolean isEmpty() {
            return false;
        }

        //true if map contain such key
        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        //true if map contain such value
        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        //return value by this key
        @Override
        public Object get(Object key) {
            return null;
        }

        //connect defined value with this key
        @Override
        public Object put(Integer key, Object value) {
            return null;
        }

        //Removes the mapping for a key from this map
        @Override
        public Object remove(Object key) {
            return null;
        }

        //Copies all the mappings from the specified map to this map
        @Override
        public void putAll(Map<? extends Integer, ?> m) {
        }

        //Removes all the mappings from this map
        @Override
        public void clear() {
        }

        //Returns a Set view of the keys contained in this map
        @Override
        public Set<Integer> keySet() {
            return null;
        }

        //Returns a Collection view of the values contained in this map
        @Override
        public Collection<Object> values() {
            return null;
        }

        //Returns a Set view of the mappings contained in this map (key, value)
        @Override
        public Set<Entry<Integer, Object>> entrySet() {
            return null;
        }
    };
}
