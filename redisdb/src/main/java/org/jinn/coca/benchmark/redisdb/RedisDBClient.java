package org.jinn.coca.benchmark.redisdb;

import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.Status;
import com.yahoo.ycsb.StringByteIterator;

import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

/**
 * Created by gumingcn on 16/2/6.
 */
public class RedisDBClient extends DB {

    @Override
    public Status read(String s, String s1, Set<String> set, HashMap<String, ByteIterator> hashMap) {
        try {
            String[] fieldArray =
                    (String[]) set.toArray(new String[set.size()]);
            RedisHandler.getServer().hmget(s1,fieldArray);
        }catch (Exception e){
            e.printStackTrace();
            return Status.ERROR;
        }
        return Status.OK;
    }

    @Override
    public Status scan(String s, String s1, int i, Set<String> set, Vector<HashMap<String, ByteIterator>> vector) {
        return read(s,s1,set,null);
    }

    @Override
    public Status update(String s, String s1, HashMap<String, ByteIterator> hashMap) {
        try {

            RedisHandler.getServer().hmset(s1, StringByteIterator.getStringMap(hashMap));
        }catch (Exception e){
            e.printStackTrace();
            return Status.ERROR;
        }
        return Status.OK;
    }

    @Override
    public Status insert(String s, String s1, HashMap<String, ByteIterator> hashMap) {
        try {
//            System.out.println(hashMap.keySet().size());
            RedisHandler.getServer().hmset(s1, StringByteIterator.getStringMap(hashMap));
        }catch (Exception e){
            e.printStackTrace();
            return Status.ERROR;
        }
        return Status.OK;
    }

    @Override
    public Status delete(String s, String s1) {
        try {
            RedisHandler.getServer().hdel(s1);
        }catch (Exception e){
            e.printStackTrace();
            return Status.ERROR;
        }
        return Status.OK;
    }

    public static void main(String[] args) {

    }
}
