package com.sc.sport.person;

import com.sc.helper.EnumHelper;
import org.joda.time.DateTime;

import java.util.Date;

public class Coach extends Person {

    private Date contractStartDate;
    private Date contractEndDate;

    public Coach(String firstName, String lastName, DateTime bornDate, EnumHelper.Gender gender) {
        super(firstName, lastName, bornDate, gender);
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        if(contractStartDate == null){
            throw new NullPointerException("ContractStartDate cannot be null.");
        } else if(contractStartDate.before(new Date())){
            throw new NullPointerException("ContractStartDate cannot be before today.");
        }

        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        if(contractEndDate == null){
            throw new NullPointerException("ContractEndDate cannot be null.");
        } else if(contractEndDate.before(new Date())){
            throw new NullPointerException("ContractEndDate cannot be before today.");
        }

        this.contractEndDate = contractEndDate;
    }
}
