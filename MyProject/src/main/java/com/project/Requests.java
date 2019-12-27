package com.project;

enum Type{
    Greater,Student, Admin, management;
}
enum Type_Request{
    BeGreater,BeInvolve;
}
enum Accetply{
    Accept,Reject,Pending;
}


abstract public class Requests {
    private String massage;
    private Accetply accetply = Accetply.Pending;
    public Requests(String request) {
        this.massage = request;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Accetply getAccetply() {
        return accetply;
    }

    public void setAccetply(Accetply accetply) {
        this.accetply = accetply;
    }
}
