/**
 * Created by Administrator on 2016/4/17.
 */
//class Solution {
//    boolean isMatch(String s, String p) {
//
//        if(p.isEmpty()) return s.isEmpty();
//
//        // p.length()==1 is the special case, as you would check p.substring(1) for '*' and non '*'cases.
//        if(p.length()==1)
//            return s.length()==1 &&
//                    ( ((p.charAt(0)=='.')&&( s.charAt(0)!= ' ')) || (p.charAt(0) == s.charAt(0)) );
//
//        // 2nd character of p is not '*'
//        if(p.charAt(1)!='*') {
//            return !s.isEmpty() && (((p.charAt(0) == '.') && (s.charAt(0) != ' ')) || (p.charAt(0) == s.charAt(0))) && isMatch(s.substring(1), p.substring(1));
//        }
//
//        //2nd character of p is '*', also take care of s.isEmpty()
//        while( !s.isEmpty() && ( p.charAt(0)==s.charAt(0) || (p.charAt(0)=='.')&&( s.charAt(0)!= ' '))){
//            //case when element before '*'appears 0 time.
//            if(isMatch(s, p.substring(2))){
//                return true;
//            }
//            s=s.substring(1); // process duplicate characters in s
//        }
//
//        //also takes care s.isEmpty() case;
//        return isMatch(s, p.substring(2));
//
//    }
//}
public class Solution {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        if (p.length() == 1) {
            if (s.length() == 1 && (s.charAt(0) == p.charAt(0) || (p.charAt(0) == '.' && s.charAt(0) != ' ')))
                return true;
            else return false;
        }

        if (p.charAt(1) != '*') {
            if (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || (p.charAt(0) == '.' && s.charAt(0) != ' ')))
                return isMatch(s.substring(1), p.substring(1));
            else return false;
        }
        while (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || (p.charAt(0) == '.' && s.charAt(0) != ' '))) {
            if (isMatch(s, p.substring(2))) return true;
            s = s.substring(1);
        }
        return isMatch(s, p.substring(2));
    }
}