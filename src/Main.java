public class Main {

    public static void main(String[] args) {
	// test I
        System.out.println("I(1): " + solution("I"));
        System.out.println("IV(4): " + solution("IV"));
        System.out.println("IX(9): " + solution("IX"));

        }


    public static int solution(String s){

        //I             1
        //V             5
        //X             10
        //L             50
        //C             100
        //D             500
        //M             1000

        // There are 3 characters we need to be aware of I, X and C
        // if we encounter any of these characters, we must check the next character for a "non normal" case
        // if "non normal" add the value to the accumulator and increment by an additional 1

        // non normal (Edge cases)
        // 4 IV
        // 9 IX
        // 50 XL
        // 90 XC
        // 500 CD
        // 900 CM

        int accumulator = 0;

        // iteratorate through the String
        for(int i = 0; i<s.length(); i++){

            // I character
            // 4
            if(s.charAt(i) == 'I' && ((i+1 < s.length()) && s.charAt(i+1) == 'V')){
                accumulator +=4;
                i++; // need to increment i to skip over additional character
            }
            // 9
            else if(s.charAt(i) == 'I' && ( (i+1 < s.length()) && s.charAt(i+1) == 'X')){
                accumulator +=9;
                i++; // need to increment i to skip over additional character
            }
            // normal case, just add 1
            else{
                accumulator +=1;
            }
        }

        return accumulator;
    }
}
