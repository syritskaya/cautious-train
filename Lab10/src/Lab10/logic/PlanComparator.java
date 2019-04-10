/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.logic;

import Lab10.entity.AllInPackagePlans;
import Lab10.entity.OnlyInternetPackagePlans;
import Lab10.entity.PackagePlans;
import Lab10.entity.SnatchPackagePlans;
import java.util.Comparator;

/**
 *
 * @author Aliaksiej Protas
 */
public  class PlanComparator  {
    
     

    
    
    
    public static Comparator<PackagePlans> numberComparator = new Comparator<PackagePlans>() {

    @Override
    public int compare(PackagePlans ob1, PackagePlans ob2) {
        return ob1.getPlanNumber().compareTo(ob2.getPlanNumber());
    }
    };
            
    
    public static Comparator<PackagePlans> paymentComparator = new Comparator<PackagePlans>() {

    @Override
    public int compare(PackagePlans ob1, PackagePlans ob2) {
        
        if (ob1 instanceof SnatchPackagePlans) {
           if (ob2 instanceof SnatchPackagePlans) {
            return compPlan(
                    ((SnatchPackagePlans)ob1).getPayment(),
                    ((SnatchPackagePlans)ob2).getPayment());
        }
           else if (ob2 instanceof OnlyInternetPackagePlans) {
               return 1;
           }
           else if (ob2 instanceof AllInPackagePlans) {
               return -1;
           }
        }
        else if (ob1 instanceof OnlyInternetPackagePlans){
            if (ob2 instanceof OnlyInternetPackagePlans) {
                return 0;
            }
             else {
                return 1;
            }
        }
        else {
            if (ob2 instanceof AllInPackagePlans) {
                return 0;
            } else {
                return -1;
            }
        }
        
       return 0;
    }
};
    
    
    
    
    private static int compPlan(int a, int b) {
        return (a<b)? 1: (a==b)? 0:-1; 
    }
    
    
    
    
    
}