public class GoogleBillboard{

public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435"; 

 public static void main(String[] args){
  setup();
 }
public static void setup()  {            
 String digits = e.substring(2,12);
 
 for(int i =3; i <e.length()-10; i++){
   String substring = e.substring(i, i +10);
   double potential  =Double.parseDouble(substring);
  if(isPrime(potential)){
    System.out.println(potential);
    break;
  }
 }
}
 
 public static boolean isPrime(double num){
  boolean result = true;
  if(num <=1){
    result = false;
  }else{
  for(int i = 2; i<= Math.sqrt(num); i ++){
    if(num % i == 0){
      result = false;
      break;
    }
  }
}
  return result;
}
}
