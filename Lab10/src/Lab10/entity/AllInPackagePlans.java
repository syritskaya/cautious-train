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
public abstract class AllInPackagePlans extends PackagePlans {
 
    private int payment;
    private int outcomingToHardLife3G;
    private int outcomingToOtherOperators2G;
    private int internetTraffic;
    private int internationalCalls;
    private int alJazeeraTVChannel;
    private int numberOfUsers;

    public AllInPackagePlans(int id) throws PackagePlansExceptions {
        super(id);
    }

    
     
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getOutcomingToHardLife3G() {
        return outcomingToHardLife3G;
    }

    public void setOutcomingToHardLife3G(int outcomingToHardLife3G) {
        this.outcomingToHardLife3G = outcomingToHardLife3G;
    }

    public int getOutcomingToOtherOperators2G() {
        return outcomingToOtherOperators2G;
    }

    public void setOutcomingToOtherOperators2G(int outcomingToOtherOperators2G) {
        this.outcomingToOtherOperators2G = outcomingToOtherOperators2G;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }
    
    public int getInternationalCalls() {
        return internationalCalls;
    }

    public void setInternationalCalls(int internationalCalls) {
        this.internationalCalls = internationalCalls;
    }
    public int getAlJazeeraTVChannel() {
        return alJazeeraTVChannel;
    }

    public void setAlJazeeraTVChannel(int alJazeeraTVChannel) {
        this.alJazeeraTVChannel = alJazeeraTVChannel;
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
        int hash = 5;
        hash = 17 * hash + this.payment;
        hash = 17 * hash + this.outcomingToHardLife3G;
        hash = 17 * hash + this.outcomingToOtherOperators2G;
        hash = 17 * hash + this.internetTraffic;
        hash = 17 * hash + this.internationalCalls;
        hash = 17 * hash + this.alJazeeraTVChannel;
        hash = 17 * hash + this.numberOfUsers;
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
        final AllInPackagePlans other = (AllInPackagePlans) obj;
        if (this.payment != other.payment) {
            return false;
        }
        if (this.outcomingToHardLife3G != other.outcomingToHardLife3G) {
            return false;
        }
        if (this.outcomingToOtherOperators2G != other.outcomingToOtherOperators2G) {
            return false;
        }
        if (this.internetTraffic != other.internetTraffic) {
            return false;
        }
        if (this.internationalCalls != other.internationalCalls) {
            return false;
        }
        if (this.alJazeeraTVChannel != other.alJazeeraTVChannel) {
            return false;
        }
        if (this.numberOfUsers != other.numberOfUsers) {
            return false;
        }
        return true;
    }
     
     
    
}
