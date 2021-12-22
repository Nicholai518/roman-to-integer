public class Main {

    public static void main(String[] args) {
	    // test I
        System.out.println("I(1): " + solution("I"));
        System.out.println("IV(4): " + solution("IV"));
        System.out.println("IX(9): " + solution("IX"));

        //space
        System.out.println();

        // test V
        System.out.println("V(5): " + solution("V"));

        //space
        System.out.println();

        // test X
        System.out.println("X(10): " + solution("X"));
        System.out.println("XL(40): " + solution("XL"));
        System.out.println("XC(90): " + solution("XC"));

        //space
        System.out.println();

        // test L
        System.out.println("L(50): " + solution("L"));

        //space
        System.out.println();

        // test C
        System.out.println("C(100): " + solution("C"));
        System.out.println("CD(400): " + solution("CD"));
        System.out.println("CM(900): " + solution("CM"));

        //space
        System.out.println();

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

            switch(s.charAt(i)) {
                case 'I':
                    // 4
                    if(((i+1 < s.length()) && s.charAt(i+1) == 'V')){
                        accumulator +=4;
                        i++; // need to increment i to skip over additional character
                    }

                    // 9
                    else if ( (i+1 < s.length()) && s.charAt(i+1) == 'X'){
                        accumulator +=9;
                        i++; // need to increment i to skip over additional character
                    }
                    // normal case, just add 1
                    // (s.charAt(i) == 'I' && ( (i+1 < s.length()) && s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X'))
                    else  {
                        accumulator +=1;
                    }

                    break;



                // V has no special cases
                case 'V':
                    accumulator +=5;
                    break;




                case 'X':

                    // 40
                    if( ((i+1 < s.length()) && s.charAt(i+1) == 'L')){
                        accumulator +=40;
                        i++; // need to increment i to skip over additional character
                    }
                    // 90
                    else if(( (i+1 < s.length()) && s.charAt(i+1) == 'C')){
                        accumulator +=90;
                        i++; // need to increment i to skip over additional character
                    }
                    // normal case, just add 10
                    // (s.charAt(i) == 'X' && ( (i+1 < s.length()) && s.charAt(i+1) != 'L' && s.charAt(i+1) != 'C'))
                    else {
                        accumulator +=10;
                    }

                    break;



                // L has no special cases
                case 'L':
                    accumulator +=50;
                    break;




                case 'C':
                    // 400
                    if( ((i+1 < s.length()) && s.charAt(i+1) == 'D')){
                        accumulator +=400;
                        i++; // need to increment i to skip over additional character
                    }
                    // 900
                    else if(( (i+1 < s.length()) && s.charAt(i+1) == 'M')){
                        accumulator +=900;
                        i++; // need to increment i to skip over additional character
                    }
                    // normal case, just add 100
                    // (s.charAt(i) == 'X' && ( (i+1 < s.length()) && s.charAt(i+1) != 'L' && s.charAt(i+1) != 'C'))
                    else {
                        accumulator +=100;
                    }
                    break;





                case 'D':
                    // code block
                    break;

                case 'M':
                    // code block
                    break;

                default:
                    // code block
            } // end of switch



        } // end of for loop

        return accumulator;

    }
}







