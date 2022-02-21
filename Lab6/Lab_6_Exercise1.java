import java.lang.*;
import java.util.*;
class Lab_6_Exercise1
{
 public static List<String> getValues(HashMap<Integer,String>map1)
   {
    List<String>list = new ArrayList<String>(map1.values());
    Collections.sort(list);
    return list; 
    }
    public static void main(String[] args)
       {
          HashMap<Integer,String> map1 = new HashMap<>();
           map1.put(1,"ObjectsAndClasses");
           map1.put(3,"ExceptionHandling");
           map1.put(2,"Abstructclasses");
           map1.put(5,"Interfaces");
           map1.put(4,"Control Statements");
            List<String> list = getValues(map1);
            System.out.println(list);
        }
}