/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.utilites;

import Lab10.entity.DialUpPlan;
import Lab10.entity.OnlyInternetPackagePlans;
import Lab10.entity.SlowlyPlan;
import Lab10.entity.SnailPlan;
import Lab10.exceptions.PackagePlansExceptions;
import java.io.IOException;

/**
 *
 * @author Aliaksiej Protas
 */
public class CreatorOnlyInternetPackagePlans {
    public enum PlansOfOnlyInternetPackage {
        SLOWLY,
        SNAIL,
        DIALUP;
     }
     
     public static OnlyInternetPackagePlans createPlan (String planName,int id, int payment, int internetTraffic,int price1Mb, int numberOfUsers) throws IOException, PackagePlansExceptions {
         OnlyInternetPackagePlans plan = null;
         if (planName.equalsIgnoreCase("SLOWLY")) {
              plan= new SlowlyPlan(id, payment, internetTraffic, price1Mb, numberOfUsers);
         }
         else if (planName.equalsIgnoreCase("SNAIL")) {
             plan= new SnailPlan(id,payment, internetTraffic, price1Mb, numberOfUsers);
         }
         else if (planName.equalsIgnoreCase("DIALUP")) {
             plan= new DialUpPlan(id,payment, internetTraffic, price1Mb, numberOfUsers);
         }
              
         return plan;
     }
}
