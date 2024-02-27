package manytomanybicanada.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybicanada.dto.Course;
import manytomanybicanada.dto.Student;

public class CourseDao {
	public void deleteCourse(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Course dbCourse=entityManager.find(Course.class, id);
		if(dbCourse!=null) {
//			that id is present then i can delete the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
//			dbCourse == you are having the students 
//			imagine dbCourse=sql it is taken by aryan,sandhya
			
			List<Student> students=dbCourse.getStudents();
			for(Student student:students) {
//				this students are taking many course along with the my dbCourse which i want to delete
				List<Course> courses=student.getCourses();
//				inside this list of course == java ,adv java,sql 
//				i need to remove this sql means dbCourse
				courses.remove(dbCourse);
//				now inside this course im having java adv java 
//				i have removed sql
//				i just want to reset this list of courses
				student.setCourses(courses);
			}
			entityManager.remove(dbCourse);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
}
