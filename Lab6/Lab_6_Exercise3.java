import java.util.*;
class Lab_2_Exercise3
{
public static HashMap<Integer, Integer> getSquares(int[] a)
{
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int n : a)
          {
          map.put(n,n*n);
         }
         return map;
}
public static void main(String[] args)
{
   int[] a = {1,2,3,4,5,6,7};
    HashMap<Integer,Integer> map = getSquares(a);
    Iterator<Integer> L = map.keySet().iterator();
    while(L.hasNext()){
    Integer key = L.next();
    System.out.println(key+":"+map.get(key));
           }
}
}