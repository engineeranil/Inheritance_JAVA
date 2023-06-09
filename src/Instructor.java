public class Instructor extends Academician{
   private String doorNo;
    private int noteOne;
    private int noteTwo;
    private int noteThree;
   public Instructor(String name_Surname,String mpNo,String gmailAdress,String department,String title,String doorNo,int noteOne,int noteTwo,int noteThree){
        super(name_Surname,mpNo,gmailAdress,department,title,doorNo);
        this.doorNo=doorNo;
       this.noteOne=noteOne;
       this.noteTwo=noteTwo;
       this.noteThree= noteThree;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting(){
       System.out.println("THE SENATE HAS CONVENED...");
    }
    public void makeExam(){
       System.out.println("EXAM HAS STARTED !! ");
    }
    public int getNoteOne(){
        return noteOne;
    }
    public void setNoteOne(int noteOne){
        this.noteOne=noteOne;
    }
    public int getNoteTwo(){
        return noteTwo;
    }
    public void setNoteTwo(int noteTwo){
        this.noteTwo=noteTwo;
    }
    public int getNoteThree(){
        return noteThree;
    }
    public void setNoteThree(int noteThree){
        this.noteThree=noteThree;
    }
    public boolean isPass(){
        if(avarageQuiz()>=50){
            System.out.println(getName_Surname()+" PASSED THE EXAM SUCCESSFULY :) ");
            return true;
        }
        System.out.println(getName_Surname()+" COULD NOT PASS THE EXAM :( ");
        return false;
    }
    public double avarageQuiz(){
        double result = (this.noteOne+this.noteTwo+this.noteThree)/3;
        return result;

    }
    @Override
    public void enterLecture(String time){
       System.out.println(getName_Surname()+" INSTRUCTOR HAS JOINED THE LECTURE...");
    }
}
