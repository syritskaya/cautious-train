/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.logic;

import Lab10.entity.PackagePlans;
import Lab10.entity.SnatchPackagePlans;
import java.util.Comparator;

/**
 *
 * @author Aliaksiej Protas
 */
public abstract class Sorter implements Comparator {
   
    
     private static Comparator<PackagePlans> cs = new Comparator<PackagePlans>() {

       @Override
        public int compare(PackagePlans cs1, PackagePlans cs2) {
            
            return ((SnatchPackagePlans) cs1).getNumberOfUsers() - ((SnatchPackagePlans) cs2).getNumberOfUsers();
        }

   };

       
    
}
