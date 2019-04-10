/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.logic;

import Lab10.entity.MobileOperator;
import Lab10.entity.PackagePlans;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Aliaksiej Protas
 */
public class PlanSorter  { /**{
    public void sortplans(SnatchPackagePlanEnum comparator) {
        plans.sort(comparator.get());
    }
  */  


    private static final long serialVersionUID = 1L;
    
    public static void sortByNumber(MobileOperator operator, Comparator<PackagePlans> comparator) {
        Collections.sort(operator.plans, comparator);
    }
    
      public static void sortByPayment(MobileOperator operator, Comparator<PackagePlans> comparator) {
        Collections.sort(operator.plans, comparator);
    }
    
    
}
