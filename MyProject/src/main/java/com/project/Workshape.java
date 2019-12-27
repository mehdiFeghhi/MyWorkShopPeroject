package com.project;

import org.omg.CORBA.Request;

import java.util.ArrayList;
import java.util.Date;

public class Workshape {
    private String Id;
    private String nameOfWorkshape;
    private String detaills;
    private Date firstWorkshape ;
    private Date endWorksahpe ;
    private Date dayOfWeakStart;
    private Date dayOfWeakEnd;
    private Date hourStart;
    private Date hourEnd;
    private int numberStudent;
    private int numberGreater;
    private ArrayList<GroupGS> allGroupGreaterAndStudent;
    private ArrayList<Requests> allRequest;
    public Workshape(String id,String name){
        this.Id = id;
        this.nameOfWorkshape = name;
    }
    public Workshape(String nameOfWorkshape, Date firstWorkshape, Date endWorksahpe, Date dayOfWeakStart, Date dayOfWeakEnd, Date hourStart, Date hourEnd, int numberStudent, int numberGreater) {
        this.nameOfWorkshape = nameOfWorkshape;
        this.firstWorkshape = firstWorkshape;
        this.endWorksahpe = endWorksahpe;
        this.dayOfWeakStart = dayOfWeakStart;
        this.dayOfWeakEnd = dayOfWeakEnd;
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.numberStudent = numberStudent;
        this.numberGreater = numberGreater;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public boolean AddToRequestList(RequestStudent request){
        RequestStudent requestStudent;
        for (Requests i : this.allRequest){
            if (i.getClass() == request.getClass()){
                requestStudent = (RequestStudent) i;
                if (requestStudent.student.getUser().equals(request.getStudent().getUser()))
                    return false;
            }
        }
        this.allRequest.add(request);
        return true;
    }
    public boolean deleteStudentFromRequestList(String User){
        RequestStudent requestStudent = null;
        for (Requests i : this.allRequest){
            if(i.getClass() == requestStudent.getClass()){
                requestStudent = (RequestStudent) i;
                if (requestStudent.student.getUser().equals(User)) {
                    this.allRequest.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public String getNameOfWorkshape() {
        return nameOfWorkshape;
    }

    public void setNameOfWorkshape(String nameOfWorkshape) {
        this.nameOfWorkshape = nameOfWorkshape;
    }

    public Date getFirstWorkshape() {
        return firstWorkshape;
    }

    public void setFirstWorkshape(Date firstWorkshape) {
        this.firstWorkshape = firstWorkshape;
    }

    public Date getEndWorksahpe() {
        return endWorksahpe;
    }

    public void setEndWorksahpe(Date endWorksahpe) {
        this.endWorksahpe = endWorksahpe;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public int getNumberGreater() {
        return numberGreater;
    }

    public void setNumberGreater(int numberGreater) {
        this.numberGreater = numberGreater;
    }

}
