/**
 * Created by Николай on 05.01.2017.
 */
public class Uniwer {
    private int studies;
    private int teachers;

    public Uniwer(int studies) { // конструктор с 1-им параметрам
        this.studies = studies;
    }

    public int getStudies() {
        return studies;
    }

    public int getTeachers() { //метод, возвращающий количество учителей
        return teachers;
    }

    public void setStudies(int studies){ // метод для установки учеников
        this.studies = studies;
    }
    public void setTeachers(int teachers){
        this.teachers = teachers;
    }

    public Uniwer(int studies,int teachers){ // конструктор с 2-я параметрами
        this.studies = studies;
        this.teachers = teachers;
    }

}
