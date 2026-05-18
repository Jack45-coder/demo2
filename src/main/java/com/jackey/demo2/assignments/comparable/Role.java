package com.jackey.demo2.assignments.comparable;


public enum Role {
    PRINCIPAL("Principal"),
    VICE_PRINCIPAL("Vice Principal"),
    HOD("Hod"),
    PROFESSOR("Professor"),
    ASSISTANT_PROFESSOR("Assistant Professor"),
    CLASS_TEACHER("Class Teacher"),
    SUBJECT_TEACHER("Subject Teacher");


    private final  String roleName;

    Role(String roleName){
        this.roleName = roleName;
    }

    public String getRoleName(){
        return roleName;
    }

}

