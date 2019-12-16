package extneds;

public class FinalChild {

	// extends FinalClass 작성시 에러
	// 클래스가 final로 선언된 경우는 상속 불가
	
	  private final int value;

	  public FinalChild(int value) {
	    this.value = value;
	  }

	  public int getValue() {
	    return value;
	  }
}
