package Chapter4;

public class SwitchEx1 {
  public static void main(String[] args) {
    int rank = 2;
    char medalColor;
    switch (rank) {
      case 1:
        medalColor = 'G';
        break;
      case 2:
        medalColor = 'S';
        break;
      case 3:
        medalColor = 'B';
      default:
        medalColor = 'A';

    }
    System.out.println("메딜 색상은? " + medalColor + '!');
  }
}
