package hexlet.code;

import java.util.HashMap;
import java.util.Map;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parser {
    public static Map<String, String> parse(String file) throws Exception {
        Map<String, String> map = new HashMap<>();
        for (String str : file.substring(1, file.length() - 1).split(",")) {
            String[] stringData = str.split(":");
            map.put(stringData[0], stringData[1]);
        }
        return map;
    }
}
