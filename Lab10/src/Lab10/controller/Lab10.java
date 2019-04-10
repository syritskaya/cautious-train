/*
* Mobile communication (Mobile Communication). Determine  mobile company 
* tariff hierarchy. Create a list of company rates. Calculate total
* number of customers. 
 */
package Lab10.controller;
import Lab10.entity.MobileOperator;
import Lab10.entity.PackagePlans;
import Lab10.exceptions.PackagePlansExceptions;
import Lab10.logic.PlanComparator;
import Lab10.logic.PlanCounter;
import Lab10.logic.PlanSearcher;
import Lab10.logic.PlanSorter;
import Lab10.utilites.CreatorAllInPackagePlans;
import Lab10.utilites.CreatorMobileOperator;
import Lab10.utilites.CreatorOnlyInternetPackagePlans;
import Lab10.utilites.CreatorSnatchPackagePlans;
import java.io.IOException;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab10 {
   public static void main(String[] args) throws IOException, PackagePlansExceptions {
    
       MobileOperator operator = CreatorMobileOperator.createMobileOperator("HardLife");
      
       PackagePlans plan1 = CreatorSnatchPackagePlans.createPlan("NOFUN", 120, 200, 500, 200, 300, 22000);
       PackagePlans plan2 = CreatorSnatchPackagePlans.createPlan("ITSAROBBERY", 121, 300, 600, 200, 300, 15000);
       PackagePlans plan3 = CreatorSnatchPackagePlans.createPlan("HOLYSHT", 122, 400, 700, 200, 300, 18000);
       PackagePlans plan4 = CreatorAllInPackagePlans.createPlan("GODZILLA", 123, 5000, 20000, 10000, 50000, 200, 60, 2000);
       PackagePlans plan5 = CreatorAllInPackagePlans.createPlan("DEPRESSIVEELEPHANT", 124, 10000, 20000, 10000, 55000, 400, 60, 12000);
       PackagePlans plan6 = CreatorAllInPackagePlans.createPlan("MONEYSHREDDER", 125, 15000, 30000, 10000, 60000, 800, 60, 1000);
       PackagePlans plan7 = CreatorOnlyInternetPackagePlans.createPlan("SLOWLY", 126, 400, 20000, 1, 20000);
       PackagePlans plan8 = CreatorOnlyInternetPackagePlans.createPlan("SNAIL", 127, 500, 30000, 1, 18000);
       PackagePlans plan9 = CreatorOnlyInternetPackagePlans.createPlan("DIALUP", 128, 600, 40000, 1, 14000);

       
       
       operator.add(plan1);
       operator.add(plan2);
       operator.add(plan3);
       operator.add(plan4);
       operator.add(plan5);
       operator.add(plan6);
       operator.add(plan7);
       operator.add(plan8);
       operator.add(plan9);
      
       System.out.println(operator);
       
    
       System.out.println("\n Number of all plans users: " + PlanCounter.countPlanUsers(operator));
        
    
     
        
            
}

}
