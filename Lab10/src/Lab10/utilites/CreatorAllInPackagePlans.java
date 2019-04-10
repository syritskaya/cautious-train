/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.utilites;

import Lab10.entity.AllInPackagePlans;
import Lab10.entity.DepressiveElephantPlan;
import Lab10.entity.GodzillaPlan;
import Lab10.entity.MoneyShredderPlan;
import Lab10.exceptions.PackagePlansExceptions;
import java.io.IOException;

/**
 *
 * @author Aliaksiej Protas
 */
public class CreatorAllInPackagePlans {
     public enum PlansOfAllInPackage {
        GODZILLA,
        DEPRESSIVEELEPHANT,
        MONEYSHREDDER;
     }
     
     public static AllInPackagePlans createPlan (String planName,int id,int payment,int outcomingToHardLife3G, int outcomingToOtherOperators2G, int internetTraffic,int internationalCalls, int alJazeeraTVChannel, int numberOfUsers) throws IOException, PackagePlansExceptions {
         AllInPackagePlans plan = null;
         if (planName.equalsIgnoreCase("GODZILLA")) {
              plan= new GodzillaPlan( id, payment, outcomingToHardLife3G, outcomingToOtherOperators2G, internetTraffic, internationalCalls, alJazeeraTVChannel, numberOfUsers);
         }
         else if (planName.equalsIgnoreCase("DEPRESSIVEELEPHANT")) {
             plan= new DepressiveElephantPlan(id, payment, outcomingToHardLife3G, outcomingToOtherOperators2G, internetTraffic, internationalCalls, alJazeeraTVChannel, numberOfUsers);
         }
         else if (planName.equalsIgnoreCase("MONEYSHREDDER")) {
             plan= new MoneyShredderPlan(id,payment,outcomingToHardLife3G, outcomingToOtherOperators2G, internetTraffic, internationalCalls, alJazeeraTVChannel, numberOfUsers);
         }
              
         return plan;
     }
}
