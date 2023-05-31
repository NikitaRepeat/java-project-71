package hexlet.code;

import java.util.Map;

public class Differ {
    public static String generate(String filepath1, String filepath2) throws Exception{
        Map<String, String> data1 = getData(filepath1);
        Map<String, String> data2 = getData(filepath2);
        StringBuilder sb = new StringBuilder();
        for(String key : data1.keySet()) {
            if(data2.containsKey(key)) {
                if(data1.get(key).equals(data2.get(key))) {
                    sb.append("\n").append("")
                            .append(key).append(": ").append(data1.get(key)).append("");
                } else {
                    sb.append("\n").append("-").append(key)
                            .append(": ").append(data1.get(key)).append("");
                    sb.append("\n").append("+").append(key)
                            .append(": ").append(data2.get(key)).append("");
                }
            } else {
                sb.append("\n").append("-").append(key)
                        .append(": ").append(data1.get(key)).append("");
            }
        }
        for (String key : data2.keySet()) {
            if (!data1.containsKey(key)) {
                sb.append("\n").append("+").append(key)
                        .append(": ").append(data2.get(key)).append("");
            }
        }
        return sb.toString();
    }
    public static Map<String, String> getData(String content) throws Exception {
        return Parser.parse(content);
    }
}

