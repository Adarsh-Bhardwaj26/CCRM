package edu.ccrm.domain;




public class Instructor   extends Person
{
    private String   departments ;

    public Instructor (String id, String fullName, String email, String departments)
    {
        super(id, fullName, email) ;
        this.departments =   departments  ;
    }

    @Override
    public String getProfile()


    {



        return String.format("Instructor: %s (Dept: %s)", getFullName(), departments) ;
    }

    public String getDepartment()

    {


        return departments ;
    }




    public void setDepartment(String departments) {
        this.departments    = departments;
    }
}
