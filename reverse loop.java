import java.util.Scanner;
class reverseloop
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
System.out.print("enter the string");
     String str= sc.nextLine();   
    String reversedString = ("");
    for(int i = str.length()-1; i>=0; i--){
      reversedString = reversedString + str.charAt(i);
    }
    
    System.out.println(reversedString);
  }
}

output



enter the string  123344556
655443321
