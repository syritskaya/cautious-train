/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.entity;

import Lab10.exceptions.PackagePlansExceptions;

/**
 *
 * @author Aliaksiej Protas
 */
public abstract class OnlyInternetPackagePlans extends PackagePlans {
    private int payment;
    private  int internetTraffic;
    private  int price1Mb;
    private int numberOfUsers;

    public OnlyInternetPackagePlans(int id) throws PackagePlansExceptions {
        super(id);
    }

    
     
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    

   

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }
    
    public int getPrice1Mb() {
        return price1Mb;
    }

    public void setPrice1Mb(int price1Mb) {
        this.price1Mb = price1Mb;
    }
     public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }
     @Override
     public abstract String connectItems();
     public abstract String disconnectItems();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.payment;
        hash = 89 * hash + this.internetTraffic;
        hash = 89 * hash + this.price1Mb;
        hash = 89 * hash + this.numberOfUsers;
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
        final OnlyInternetPackagePlans other = (OnlyInternetPackagePlans) obj;
        if (this.payment != other.payment) {
            return false;
        }
        if (this.internetTraffic != other.internetTraffic) {
            return false;
        }
        if (this.price1Mb != other.price1Mb) {
            return false;
        }
        if (this.numberOfUsers != other.numberOfUsers) {
            return false;
        }
        return true;
    }
     
}
