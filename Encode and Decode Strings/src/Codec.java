import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/9.
 */
public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int i=0;
        List<String> result=new ArrayList<String>();
        if(s.length()==0) return result;
        while(i<s.length()){
            int index=s.indexOf("#",i);
            int length=Integer.parseInt(s.substring(i,index));
            String str=s.substring(index+1,index+length+1);
            result.add(str);
            i=index+length+1;
        }
        return result;
    }
}