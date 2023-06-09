public class Assistant extends Academician{

    private String officeTime;
    public Assistant(String name_Surname, String mpNo, String gmailAdress, String department, String title,String officeTime) {
        super(name_Surname, mpNo, gmailAdress, department, title,officeTime);
        this.officeTime=officeTime;

    }

    public String getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }

    public void makeQuiz(){
        System.out.println(getName_Surname()+"DID A QUIZ ...");
    }

    @Override
    public void enterLecture(String time){
        System.out.println(getName_Surname()+" ASSISTANT HAS JOINED THE LECTURE...");
    }

}
