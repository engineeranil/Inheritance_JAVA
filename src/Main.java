public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("ANIL KELES", "0531", "keles@gmail.com");

        //Academician a1 = new Academician("ANIL CEM KAYA", "05321327137", "cemkaya@gmail.com", "CENG", "PROF");
        Instructor i1 = new Instructor("ANIL SMOKE ", "053387217", "smoke@gmail.com", "EEE", "DR", "131", 49, 53, 55);
        Assistant as1 = new Assistant("BARAN KELES ", "053366769", "rain@gmail.com", "BIO", "PROF", "45");
        LabAssistant l1 = new LabAssistant("GUNEY KAYA", "056237312", "south@gmail.com", "MATH", "JR", "18");
        // l1.enterLabs();
        //as1.makeQuiz();
        //a1.login();

        Employee[] list = {e1,i1, as1, l1};
        e1.loginUsers(list);


    }
}
