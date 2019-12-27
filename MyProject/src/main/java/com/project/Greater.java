package com.project;

public class Greater implements RoleOfWorkShape{
   private Type type = Type.Greater;
   private String  user;
   public Greater(String user){
       this.user = user;
   }
   public Type getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
