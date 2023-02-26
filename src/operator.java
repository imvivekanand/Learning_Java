public class operator {
    public static void main(String[] args){
        //Arithmatic Operator
        int result = 9 % 2;
        int result1 = 9 / 2;
        float result2 = 9 / 2;
        float result3 = 9.0f / 2;
        float result4 = 9 / 2.0f;
        float result5 = (float) 9 / 2;
        double result6 = 9.5 / 2;
        int result7 = 9 - 2;
        int result8 = 9 + 2;
        int result9 = 9 * 2;

        int result10 = 3 + 1 - 7 * 5 % 3 / 2;
        System.out.println(result);

        // => 3 + 1 - 7 * 5 % 3 / 2
        // => 3 + 1 - 35 % 3 / 2
        // => 3 + 1 - 2 / 2
        // => 3 + 1 - 1
        // => 4 - 1
        // => 3


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);



        //Relational Operator

        int x = 2;
        int y = 3;
        int z = 5;

        //Greater than and Greater than equal to
        boolean r1 = x > y;
        boolean r2 = y >= x;

        //Less than and Less than equal to
        boolean r3 = x < y;
        boolean r4 = y <= x;

        //Is equal to and Is Not equal to
        boolean r5 = y == z;
        boolean r6 = z != x;



        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


    }
}
