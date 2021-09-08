package chapter14.throwsExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
  public Class loadClass(String filename, String ClassName) throws FileNotFoundException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(filename);
    Class cls = Class.forName(ClassName);
    return cls;
  }

  public static void main(String[] args) {
    ThrowsException ex = new ThrowsException();
    try {
      ex.loadClass("test.java", "java.lang.String");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
