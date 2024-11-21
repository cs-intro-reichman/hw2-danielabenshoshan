// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String crowdWord = args[0];
            int Ntimes = Integer.parseInt(args[1]);
            int counter =0;
            int ascii=0;
            String UpperCaseWord = "";
            String letterBank = "AEFHILMNORSX";
            char ch;
            for ( int i =0; i<crowdWord.length(); i++){
                ch = crowdWord.charAt(i);
                ascii = (int) ch;
                if (ascii >= 97 && ascii <= 122 ){ //lower case
                        ascii = ascii -32;
                        ch = (char) ascii;
                }
                UpperCaseWord = UpperCaseWord + ch;
                if (letterBank.indexOf(ch) == -1){
                        System.out.println("Give me a  "+ch+": "+ch+"!");
                } else {
                        System.out.println("Give me an "+ch+": "+ch+"!");
                }
            }
            System.out.println("What does that spell?");
            while(Ntimes>counter){
                System.out.println(UpperCaseWord+"!!!");
                counter++;
            }
        }
}
 