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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aliaksiej Protas
 */
public class PlanSearcher {
    
    public static List<PackagePlans> searchPlanWithInsertInternetTraffic(MobileOperator operator, int number) {
        List<PackagePlans> plan = new ArrayList<>();
          for (int i=0; i<operator.size(); i++) {
              if (operator.getPlans(i) instanceof SnatchPackagePlans) {
                  if (number == ((SnatchPackagePlans) operator.getPlans(i)).getInternetTraffic()) {
                      plan.add(operator.getPlans(i));
                  }
              }
            /**  else if (operator.getPlans(i) instanceof AllInPackagePlans) {
                  if (number == ((SnatchPackagePlans) operator.getPlans(i)).getInternetTraffic()) {
                      plan.add(operator.getPlans(i));
                  }
              }
              
              else if (operator.getPlans(i) instanceof OnlyInternetPackagePlans) {
                  if (number == ((SnatchPackagePlans) operator.getPlans(i)).getInternetTraffic()) {
                      plan.add(operator.getPlans(i));
                  }
              }
              
              
              
              
              
              
      */  }        
       return plan;
    }
    
}
