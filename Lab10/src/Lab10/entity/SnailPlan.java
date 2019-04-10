/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.entity;

import Lab10.exceptions.PackagePlansExceptions;
import java.io.IOException;

/**
 *
 * @author Aliaksiej Protas
 */
public class SnailPlan extends OnlyInternetPackagePlans{

    public SnailPlan(int id, int payment, int internetTraffic,int price1Mb, int numberOfUsers ) throws IOException, PackagePlansExceptions {
        super(id);
        setPayment(payment);
        setInternetTraffic(internetTraffic);
        setPrice1Mb(price1Mb);
        setNumberOfUsers(numberOfUsers);   
        
        }

     @Override
     public String connectItems(){return "Activate new plan";};
     public String disconnectItems(){return "Deactivate plan";};
     
     
     
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about Snail plan: " + "\n");
         msg.append("The payment is ").append(getPayment()).append(", \n");
         msg.append("Volume of internet traffic ").append(getInternetTraffic()).append("\n");
         msg.append("The cost for1Mb is ").append(getPrice1Mb()).append(", \n");
         msg.append("The Number of users ").append(getNumberOfUsers()).append("\n");
         
         return msg.toString();
     }
}
