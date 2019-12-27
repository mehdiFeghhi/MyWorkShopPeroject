package com.project;

import java.util.ArrayList;

public class GroupGS {
    private String name;
    private ArrayList<RequestGreater> greatersWhoAccept ;
    private ArrayList<RequestStudent> studentWhoPayAllOfPayment;
    public GroupGS(String name){
        this.name = name;
    }
    public boolean addToGreaterList(RequestGreater greater){
        for (RequestGreater i : greatersWhoAccept) {
            if (i.getGreater().getUser().equals(greater.getGreater().getUser()))
                return false; //if we add this person before
        }
        greater.setAcceptly(Accetply.Accept);
        greatersWhoAccept.add(greater);
        return true;
    }
    public boolean addToStudentAccept(RequestStudent student){
            for (RequestStudent i : this.studentWhoPayAllOfPayment){
                if (i.student.getUser().equals(student.getStudent().getUser()))
                    return false;
            }
            if (!student.pay.isPayComplite())
                return false;
            student.setAccetply(Accetply.Accept);
            this.studentWhoPayAllOfPayment.add(student);
            return true;
    }
}
