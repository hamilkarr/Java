package chapter7.chapter7_4;

public class Subject {
  private String name;
  private int score;

  public Subject(String name, int score) {
    this.setName(name);
    this.setScore(score);
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
