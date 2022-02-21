import java.util.*;
import java.time.*;
class Lab_3_Exercise9{
  public static void main(String[] args)
{
         LocalDate date = LocalDate.of(2000,03,15);
         differences(date);
}
    public static void differences(LocalDate date){
           LocalDate current = LocalDate.now();
           Period diff = Period.between(date,current);
           System.out.printf("\nDifference is %d years, %d months and %d days old\n\n",diff.getYears(), diff.getMonths(), diff.getDays());
     
}
}