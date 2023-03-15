public class Circle {
    public static void main(String[] args) {

        int padding  = 2;
        int radius = 12;
        //x^2 + y^2 = r^2

        int max = radius + padding;
        int radiusSq = radius * radius;
        for (int y = max; y >= - max; y--) {
            for (int x = - max; x <= max; x++){
                if ((x*x + y*y) > radiusSq){
                    System.out.print("..");
                } else {
                    System.out.print("OO");
                }
            }
            System.out.println();
         }
    }
}

