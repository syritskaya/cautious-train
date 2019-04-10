/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.entity;
import Lab10.exceptions.PackagePlansExceptions;
import java.io.IOException;
import java.util.Objects;
/**
 *
 * @author Aliaksiej Protas
 */
public abstract class PackagePlans  {
    final int id ;
    private String planNumber;
    int n;

    public PackagePlans(int id) throws PackagePlansExceptions {
        if (id<=0) {
            throw new PackagePlansExceptions("ID must be above 0");
        }
        else {
        this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) throws PackagePlansExceptions {
        
        if (planNumber == null) {
            throw new PackagePlansExceptions("Number must be above 0");
        }
        else {
            this.planNumber = planNumber;
        }
    }
     public abstract String connectItems();

    public abstract String disconnectItems();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.planNumber);
        hash = 73 * hash + this.n;
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
        final PackagePlans other = (PackagePlans) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.n != other.n) {
            return false;
        }
        if (!Objects.equals(this.planNumber, other.planNumber)) {
            return false;
        }
        return true;
    }
    
    

}
