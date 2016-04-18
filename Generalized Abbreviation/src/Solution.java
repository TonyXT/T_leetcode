import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/1.
 */
public class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<String>();
        dfs(res, "", 0, word);
        return res;
    }

    public void dfs(List<String> res, String curr, int start, String s) {

        // 表示数字替换已经越界，recursion终止
        if (start > s.length())
            return;

        // 用之前结束位置存入当前符合条件的结果
        res.add(curr + s.substring(start));

        // 定义新的起始位置
        int i = 0;

        // 除了最开始，起始位置都要与之前结尾位置隔一个
        if (start > 0) {
            i = start + 1;
        }

        for (; i < s.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                // 数字之前的字符串要append上
                dfs(res, curr + s.substring(start, i) + j, i + j, s);
            }
        }
    }
}