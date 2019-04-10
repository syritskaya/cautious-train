/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.utilites;

import Lab10.entity.MobileOperator;

/**
 *
 * @author Aliaksiej Protas
 */
public class CreatorMobileOperator {
    public static MobileOperator createMobileOperator(String operatorName) {
     
     return new MobileOperator(operatorName);

    }
    
}
