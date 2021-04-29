package odev2;

public class EducatorManager {
    public void addCourse(Educator course) {
    	course.setKursNumber(course.getKursNumber() + 1) ;
    	System.out.println(course.getKursNumber() + " yeni toplam kurs sayınız.");
    	
    }
    
}
