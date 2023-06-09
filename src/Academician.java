public  abstract  class  Academician extends Employee {
    private String department;
    private String title;


  public  Academician(String name_Surname,String mpNo,String gmailAdress,String department,String title,String officeTime){
        super(name_Surname,mpNo,gmailAdress);
        this.department=department;
        this.title=title;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void enterLecture(String time);




}
