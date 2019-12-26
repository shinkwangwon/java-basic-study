package hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapMain {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("a",  "aa");
		hashMap.put("a",  "bb");	// 중복허용 안함 : "bb"로 덮어 씌워짐
		hashMap.put(null, null);
		System.out.println(hashMap);	// {null=null, a=bb}
		
		Map<String, String> hashTable = new Hashtable<>();
		hashTable.put("a", "aa");
		hashTable.put("a", "bb");	// 중복허용 안함 : "bb"로 덮어 씌워짐
		// hashTable.put(null, null);	// ERROR: java.lang.NullPointerException
		System.out.println(hashTable);	// {a=bb}

		Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("a", "aa");
		concurrentHashMap.put("a", "bb");	// 중복허용 안함 : "bb"로 덮어 씌워짐
		// concurrentHashMap.put(null, null);	// ERROR: java.lang.NullPointerException
		System.out.println(concurrentHashMap);
		
	}
}
