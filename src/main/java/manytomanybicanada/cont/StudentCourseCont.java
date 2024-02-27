package manytomanybicanada.cont;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybicanada.dao.CourseDao;
import manytomanybicanada.dao.StudentDao;
import manytomanybicanada.dto.Course;
import manytomanybicanada.dto.Student;

public class StudentCourseCont {
public static void main(String[] args) {
//	Student student1=new Student();
//	student1.setId(1);
//	student1.setName("Poojitha");
//	student1.setAddress("India");
//	
//	Student student2=new Student();
//	student2.setId(2);
//	student2.setName("Aryan");
//	student2.setAddress("canada");
//	
//	Student student3=new Student();
//	student3.setId(3);
//	student3.setName("Sandhya");
//	student3.setAddress("India");
//	
//	Course course1=new Course();
//	course1.setId(101);
//	course1.setName("Java");
//	course1.setFees(5000);
//	
//	Course course2=new Course();
//	course2.setId(102);
//	course2.setName("AdvJava");
//	course2.setFees(5000);
//	
//	Course course3=new Course();
//	course3.setId(103);
//	course3.setName("SQL");
//	course3.setFees(5000);
//	
//	
//	List<Course> coursesOfPoojitha=new ArrayList<Course>();
//	coursesOfPoojitha.add(course1);
//	coursesOfPoojitha.add(course2);
//	coursesOfPoojitha.add(course3);
//	
//	student1.setCourses(coursesOfPoojitha);
//	
//	student2.setCourses(coursesOfPoojitha);
//	
//	student3.setCourses(coursesOfPoojitha);
//	
	
//	
//	List<Student> students=new ArrayList<Student>();
//	students.add(student3);
//	students.add(student2);
//	students.add(student1);
//	
//	course1.setStudents(students);
//	
//	course2.setStudents(students);
//	
//	course3.setStudents(students);
//	
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(course1);
//	entityManager.persist(course2);
//	entityManager.persist(course3);
//	entityManager.persist(student1);
//	entityManager.persist(student2);
//	entityManager.persist(student3);
//	entityTransaction.commit();
	
//	StudentDao studentDao=new StudentDao();
//	studentDao.deleteStudent(1);
	
	
	CourseDao courseDao=new CourseDao();
	courseDao.deleteCourse(102);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
