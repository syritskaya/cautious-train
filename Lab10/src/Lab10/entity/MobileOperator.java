/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aliaksiej Protas
 */
public class MobileOperator {
     private String operatorName;
   
    
    public static final int DEFAULT_CAPACITY = 20;
    
    public List<PackagePlans> plans;
             
    
    public MobileOperator(String operatorName) {
        plans = new ArrayList<>(DEFAULT_CAPACITY);
        this.operatorName = operatorName;
        
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    

    

        
    public PackagePlans getPlans(int i){
        return plans.get(i);
    }
    
    public void setPlans(ArrayList<PackagePlans> plans){
        this.plans=plans;
    }
    
    
    
    public void add(PackagePlans plan){
        plans.add(plan);
    };


    public List<PackagePlans> getPlans(){
        return plans;
    }
   
    public MobileOperator() {
        plans = new ArrayList<>(DEFAULT_CAPACITY);
    }
    
    
    public int size() {
        return plans.size();
    }
    
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about mobile operator: " + "\n").append("Operator name: ").append(getOperatorName()).append("\n");
         msg.append("Mobile operator propose the line of plans: ").append(getPlans());
        
         
         return msg.toString();
   
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.operatorName);
        hash = 73 * hash + Objects.hashCode(this.plans);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MobileOperator other = (MobileOperator) obj;
        if (!Objects.equals(this.operatorName, other.operatorName)) {
            return false;
        }
        if (!Objects.equals(this.plans, other.plans)) {
            return false;
        }
        return true;
    }
     
}


