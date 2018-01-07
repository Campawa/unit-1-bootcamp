/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

    public int calculateSquare(int s){
      int square = s*s;
      return square;
    }

    public double calculateSquareRoot(int sr){
      double sqrt = Math.sqrt(sr);
      return sqrt;
  }

  public string toLowerCase(String word){
    return word.toLowerCase();
  }

  public int isMultiple(int one, int two){
    if (two%one == 0){
      System.out.println(two + " is a multiple of " + one);
    }
    else{
      System.out.println("false");
    }
  }

  public int prettyInteger(){

  }

  public int random(){

  }


  }
}
