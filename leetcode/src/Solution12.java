import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xicoll6
 * @Description: 罗马数字转整数
 * @date 2019/12/2214:29
 */

public class Solution12 {

    public int romaToInt(String roma) {
        int numInt = 0;
        switch (roma) {
            case "I":
                numInt = 1;
                break;
            case "V":
                numInt = 5;
                break;
            case "X":
                numInt = 10;
                break;
            case "L":
                numInt = 50;
                break;
            case "C":
                numInt = 100;
                break;
            case "D":
                numInt = 500;
                break;
            case "M":
                numInt = 1000;
                break;
        }
        return numInt;
    }

    public int romanToInt(String s) {
        int result = 0;
        List<String> results = new ArrayList<>();
        results.addAll(Arrays.asList(s.split("")));

        for (int i = 0; i < results.size(); i++) {
            if ((i + 1) < results.size() && romaToInt(results.get(i)) < romaToInt(results.get(i + 1))) {
                result += (romaToInt(results.get(i + 1)) - romaToInt(results.get(i)));
                i++;
            } else {
                result += romaToInt(results.get(i));
            }
        }
        return result;
    }
}
