public  class Employee {
    private String name_Surname;
    private String mpNo;
    private String gmailAdress;

   public Employee(String name_Surname,String mpNo,String gmailAdress){
        this.name_Surname = name_Surname;
        this.mpNo = mpNo;
        this.gmailAdress = gmailAdress;
    }

    public String getName_Surname() {
        return name_Surname;
    }

    public void setName_Surname(String name_Surname) {
        this.name_Surname = name_Surname;
    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getGmailAdress() {
        return gmailAdress;
    }

    public void setGmailAdress(String gmailAdress) {
        this.gmailAdress = gmailAdress;
    }

    public void login(){
        System.out.println(getName_Surname()+" LOGGED IN SUCCESSFUL:) ");
    }
    public void logOut(){
        System.out.println(getName_Surname()+" LOGGED OUT SUCCESFUL :) ");
    }
    public void refactory(){
        System.out.println(getName_Surname()+" ENTERED THE REFACTORY : ) ");
    }

    public static void loginUsers(Employee[] users){
       for(Employee user:users){
           user.login();
       }
    }


}
