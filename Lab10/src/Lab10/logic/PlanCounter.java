/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.logic;

import Lab10.entity.AllInPackagePlans;
import Lab10.entity.MobileOperator;
import Lab10.entity.OnlyInternetPackagePlans;
import Lab10.entity.PackagePlans;
import Lab10.entity.SnatchPackagePlans;

/**
 *
 * @author Aliaksiej Protas
 */
public class PlanCounter {
    
    public static int countPlanUsers(MobileOperator operator) {
        int count = 0;
        for (int i=0; i<operator.size(); i++)
          if (operator.getPlans(i) instanceof OnlyInternetPackagePlans) {
                count += ((OnlyInternetPackagePlans) operator.getPlans(i)).getNumberOfUsers();
            }
        else if (operator.getPlans(i) instanceof SnatchPackagePlans) {
                count += ((SnatchPackagePlans) operator.getPlans(i)).getNumberOfUsers();
            }
        else if (operator.getPlans(i) instanceof AllInPackagePlans) {
                count += ((AllInPackagePlans) operator.getPlans(i)).getNumberOfUsers();
            }
        
        return count;
    }
    
}
      
