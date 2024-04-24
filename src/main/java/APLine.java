public class APLine
{
  private myX = 0;
  private myY = 0;
  private myA = 0;
  private myB = 0;
  private myC = 0;

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
