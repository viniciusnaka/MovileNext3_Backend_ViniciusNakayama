package com.sc.person;

import com.sc.helper.EnumHelper;
import com.sc.team.Team;
import org.joda.time.DateTime;

import java.util.Date;

public class Coach extends Person {

    private final Team team;
    private final Date contractStartDate;
    private final Date contractEndDate;

    public Coach(String firstName, String lastName, DateTime bornDate, EnumHelper.Gender gender, Team team, Date contractStartDate, Date contractEndDate) {
        super(firstName, lastName, bornDate, gender);

        if(team == null){
            throw new NullPointerException("Object Team cannot be null.");
        }

        if(contractStartDate == null){
            throw new NullPointerException("ContractStartDate cannot be null.");
        } else if(contractStartDate.before(new Date())){
            throw new NullPointerException("ContractStartDate cannot be before today.");
        }

        if(contractEndDate == null){
            throw new NullPointerException("ContractEndDate cannot be null.");
        } else if(contractEndDate.before(new Date())){
            throw new NullPointerException("ContractEndDate cannot be before today.");
        }

        this.team = team;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
    }

    public Team getTeam() {
        return team;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

}
