public class Conversion {
    public static void main(String[] args){
        //Implicit conversion
        int radius = 400;
        double newRadius = radius;
        System.out.println(newRadius);

        //Explicit conversion
        double diameter = 3.78;
        int newDiameter = (int) diameter;
        System.out.println(newDiameter);

        long diameter2 = 7895241255L;
        int newDiameter2 = (int) diameter2;
        System.out.println(newDiameter2);
    }
}
