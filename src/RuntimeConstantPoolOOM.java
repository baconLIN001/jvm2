import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -XX:PermSize = 10M -XX:MaxPermSize = 10M
 * Created by baconLIN on 2017/3/12.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        int i = 0;
        while (true)
        {
            list.add(String.valueOf(i++).intern());
        }
    }
}
