package Practice._2023_02_16;

import java.util.HashMap;
import java.util.Map;

public class STR {
    public static void main(String[] args) {
        String s = "ASD"; //
        String в = "ASD"; //ссылка на один и тот же объект в пуле строк (кэше)
        s = s + "QWE" + "ZXC" + "RTY"; // создается новая строка в пуле строк (кэше) и ссылка на нее в s

        StringBuilder sb = new StringBuilder("ASD"); // для однопоточности (быстрее)
        sb.append("QWE").append("ZXC").append("RTY");

        StringBuffer sbf = new StringBuffer("ASD");  // для многопоточности (синхронизация)
        sbf.append("QWE").append("ZXC").append("RTY");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ASD");
        map.put(2, "QWE");
        map.put(3, "ZXC");
        map.put(4, "RTY");
        map.put(5, "FV");
        map.put(6, "GH");

        System.out.println(map);
    }
}
