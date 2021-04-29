package odev2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId("1");
		student1.setName("Emre Serbes");
		student1.schoolName = "Sakarya fen lisesi";
		
		Educator educator1 = new Educator();
		educator1.setKursNumber(0);
		educator1.setId("1");
        educator1.setName("Engin Demiroð");
        
        StudentManager studentManager = new StudentManager();
        studentManager.addEducator(educator1);
        
        EducatorManager edicatorManager = new EducatorManager();
        edicatorManager.addCourse(educator1);
	}

}
