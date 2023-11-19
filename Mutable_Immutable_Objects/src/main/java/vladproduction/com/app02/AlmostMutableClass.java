package vladproduction.com.app02;

import java.util.HashMap;
import java.util.Map;

public class AlmostMutableClass {
    private String field;
    private Map<String, String> fieldMap;

    public AlmostMutableClass(String field, Map<String, String> fieldMap) {
        this.field = field;
        Map<String, String> deepCopy = new HashMap<>();
        for (String key: fieldMap.keySet()) {
            deepCopy.put(key, fieldMap.get(key));
        }
        this.fieldMap = deepCopy;
    }

    public String getField() {
        return field;
    }

    public Map<String, String> getFieldMap() {
        Map<String, String> deepCopy = new HashMap<>();
        for (String key: fieldMap.keySet()) {
            deepCopy.put(key, fieldMap.get(key));
        }
        return deepCopy;
    }
}
