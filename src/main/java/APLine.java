public class APLine
{
  private myX;
  private myY;
  private myA;
  private myB;
  private myC;

  public void APLine(int a, int b, int c){
    myA = a;
    myB = b;
    myC = c;
  }

  public double getSlope(){
    return -1*myA/myB;
  }

  public boolean isOnLine(int x, int y){
    myX = x;
    myY = y;
    if ((myA*myX) + (myB*myY) + myC == 0){
      return true;
    }
    return false;
  }
}
