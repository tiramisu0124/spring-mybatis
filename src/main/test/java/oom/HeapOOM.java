package oom;

import java.util.ArrayList;
import java.util.List;
/**
 * java堆内存溢出异常测试
 * VM Args: -verbose:gc -Xms20m -Xmx20m -XX:+HeapDumpOnOutMemoryError
 */
public class HeapOOM {
    static class  OOMObject {
    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true) {
            list.add(new OOMObject());
        }
    }
}
