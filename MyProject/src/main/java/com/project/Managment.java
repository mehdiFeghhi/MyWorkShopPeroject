package com.project;

import java.util.ArrayList;

public class Managment implements RoleOfWorkShape {
    ArrayList<Workshape>workshapes ;
    Type type = Type.management;
    public Managment(){
    }
    public boolean addToWorkshape(Workshape workShape){
        workshapes.add(workShape);
        return true;
    }
    public boolean addToWorksahpes(Workshape workshape){
        return true;

    }

    @Override
    public Type getType() {
        return type;
    }
}
