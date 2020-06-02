package home.Lesson.Lesson1;

public class FizzPrint implements FizzBuzz{

    public static Integer iFrom = 1;
    public static Integer iTo = 25;

    public void print(int iFrom, int iTo) {
        String string =  new String();
        for (int i =iFrom;  i <= iTo; i++) {

            string = "";
            if (i%3 == 0) {             string += "Fizz";         }

            if (i%5 == 0) {string += "Bizz";
            }
            if (string=="") {string = Integer.toString(i);}

            System.out.println(string);
        }
    }

    public static void main (String... args){
        FizzBuzz fizzBuzz = new FizzPrint();
        fizzBuzz.print (iFrom, iTo);
    }
}
