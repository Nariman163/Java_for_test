public class Hello {
    public static void main(String[] args) {

           var x = 1;
           var y = -1;
           if (y==0) {
               System.out.println("Делить на ноль запрещено");
           } else {
               var z = devide(x, y);
               System.out.println("Hello Nariman!");
           }

    }

    private static int devide(int x, int y) {
        var z = x / y;
        return z;
    }
}
