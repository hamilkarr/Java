package TeamStudy;

public abstract class GirlandBoyIdol {
  public abstract void singing();

  public abstract void dancing();

  public void showEnd() {
    System.out.println("공연을 마칩니다.");
  }

  public void encore() {

  }

  public final void hitSongMedly() {
    singing();
    dancing();
    showEnd();
    encore();
  }
}
