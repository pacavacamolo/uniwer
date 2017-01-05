/**
 * Created by Николай on 05.01.2017.
 */
public class Main { //класс
    public static void main(String[] args){  // метод
        Uniwer uniwer1 = new Uniwer(15); // создал обьект касса с 1-им параметром
        uniwer1.setStudies(16);
        Uniwer uniwer2 = new Uniwer(12, 2); //создал обьект касса с 2-я параметрами
        System.out.println(uniwer1.getStudies());
        System.out.println("Количество студентов: " + uniwer2.getStudies() + "\nКоличество учителей: " + uniwer2.getTeachers());
    }
}
