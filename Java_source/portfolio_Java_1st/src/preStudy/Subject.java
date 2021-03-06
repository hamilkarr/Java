package preStudy;

import java.util.ArrayList;
import utils.Define;

public class Subject {
  private String subjectName;
  private int subjectID;
  private int gradeType;

  private ArrayList<Student> studentList = new ArrayList<>();

  public Subject(String subjectName, int subjectID) {
    this.subjectName = subjectName;
    this.subjectID = subjectID;
    this.gradeType = Define.AB_TYPE;
  }

  public void register(Student student) {
    studentList.add(student);
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getSubjectID() {
    return subjectID;
  }

  public void setSubjectID(int subjectID) {
    this.subjectID = subjectID;
  }

  public int getGradeType() {
    return gradeType;
  }

  public void setGradeType(int gradeType) {
    this.gradeType = gradeType;
  }

  public ArrayList<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(ArrayList<Student> studentList) {
    this.studentList = studentList;
  }

}
