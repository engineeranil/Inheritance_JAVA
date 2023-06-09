public class LabAssistant extends Assistant{
    public LabAssistant(String name_Surname, String mpNo, String gmailAdress, String department, String title, String officeTime) {
        super(name_Surname, mpNo, gmailAdress, department, title, officeTime);
    }
    public void enterLabs(){
        System.out.println(getName_Surname()+" HAS JOINED THE LAB...");
    }


}
