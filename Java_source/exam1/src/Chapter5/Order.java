package Chapter5;

public class Order {
  long orderNum;
  String memId;
  String orderDate;
  String memNm;
  String orderGoodsNum;
  String address;
  // 힙에 있는 변수들

  public void setOrder(long orderNum, String memId, String orderDate, String memNm, String orderGoodsNum,
      String address /* 스택에 있는 변수들 */
  ) {
    this.orderNum = orderNum;
    this.memId = memId;
    this.orderDate = orderDate;
    this.memNm = memNm;
    this.orderGoodsNum = orderGoodsNum;
    this.address = address;
  }

  public void showInfo() {
    System.out.println("주문번호 : " + orderNum);
    System.out.println("주문자 아이디 : " + memId);
    System.out.println("주문 날짜 : " + orderDate);
    System.out.println("주문자 이름 : " + memNm);
    System.out.println("주문 상품 번호 : " + orderGoodsNum);
    System.out.println("배송 주소 : " + address);
  }
}
