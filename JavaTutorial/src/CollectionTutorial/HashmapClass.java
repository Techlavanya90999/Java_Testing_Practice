package CollectionTutorial;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashmapClass {

	public static void main(String[] args) {
Map<Object, Object >m1 = new HashMap<Object, Object>();
m1.put(101, "A");
m1.put("A", "Selenium");
m1.put(false, "B");
m1.put(false, "RestAPI");
System.out.println(m1.size()); // 7
System.out.println(m1.containsKey(101));
System.out.println(m1);
Collection c1 = m1.values();
System.out.println(c1);
Set s = m1.keySet();
System.out.println(s);
Set<Entry<Object, Object>> s2 = m1.entrySet();
System.out.println(s2);
	}

}
