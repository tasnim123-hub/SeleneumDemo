package seleniumDemo;

public class StringConcept {

	public static void main(String[] args) {
		//String class method
		
		//equals()-return->true/false
		String text ="String Concept";
		String text1 ="String Concept";
		System.out.println(text.equals(text1));  //equals function compare the value of two different variable (text and text1)
		
		System.out.println(text == text1);  //compares memory address of String variable
		
		//Same memory address/location ,If we want to save same value
		 System.out.println(System.identityHashCode(text));  //identityHashCode()
		System.out.println(System.identityHashCode(text1));

		//Total count of String
		String text2 ="Learning String";
System.out.println(text2.length());

//Concatenation-concat() [join more then one String] two String
System.out.println(text.concat(text2));
System.out.println(text+"   "+text2);

//If you want to 'concat' different data-type variable ,we use +
String num = "20";
String num1="30";
int a = 10;
int b=50;
String firstname="Tasnim";
String lastname="Chowdhury";

System.out.println(num+num1);
System.out.println(num+a);
System.out.println(a+b);
System.out.println(firstname+lastname);
System.out.println(firstname+"  "+lastname);

//toLowerCase()-convert all of the string as lower case
System.out.println(firstname.toLowerCase());

//toUpperCase()- convert all of the string as upper case
System.out.println(text2.toUpperCase());

	}

}
