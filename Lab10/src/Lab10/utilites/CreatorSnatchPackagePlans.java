/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.utilites;

import Lab10.entity.HolyShtPlan;
import Lab10.entity.ItsARobberyPlan;
import Lab10.entity.NoFunPlan;
//import Lab10.entity.PackagePlans;
import Lab10.entity.SnatchPackagePlans;
import Lab10.exceptions.PackagePlansExceptions;
import java.io.IOException;

/**
 *
 * @author Aliaksiej Protas
 */
public class CreatorSnatchPackagePlans {
    public enum PlansOfSnatchPackage {
        NOFUN,
        ITSAROBBERY,
        HOLYSHT;
     }
     
     public static SnatchPackagePlans createPlan (String planName,int id,int payment,int outcomingToHardLife3G, int outcomingToOtherOperators2G, int internetTraffic, int numberOfUsers) throws IOException, PackagePlansExceptions {
         SnatchPackagePlans plan = null;
         if (planName.equalsIgnoreCase("NOFUN")) {
              plan= new NoFunPlan(id, payment, outcomingToHardLife3G,outcomingToOtherOperators2G, internetTraffic, numberOfUsers);
         }
         else if (planName.equalsIgnoreCase("ITSAROBBERY")) {
             plan= new ItsARobberyPlan(id, payment,outcomingToHardLife3G, outcomingToOtherOperators2G, internetTraffic, numberOfUsers );
         }
         else if (planName.equalsIgnoreCase("HOLYSHT")) {
             plan= new HolyShtPlan(id, payment,outcomingToHardLife3G, outcomingToOtherOperators2G, internetTraffic, numberOfUsers);
         }
              
         return plan;
     }
}
