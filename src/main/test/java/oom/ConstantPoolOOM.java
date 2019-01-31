package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致的内存溢出异常
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 */
public class ConstantPoolOOM {
	public static void main(String[] args) {
		// 使用List保持常量池，避免Full GC回收常量池行为
		List<String> list = new ArrayList<>();
		// 10M的PermSize在integer范围做够产生OOM
		int i = 0;
		while(true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
