public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        for (int i = 0; i <= 15; i = i + 1) {
            System.out.println(i); 
        }
        System.out.println(" ");
        for (int j = 10; j >= 0; j = j - 2) {
            System.out.println(j);
        }
        System.out.println(" ");
        for (int k = 10; k != 0; k = k - 3) {
            System.out.println(k);
        }
    } 
    
    
    public static void main(String[] args)
    {
        HelloWorld hw = new HelloWorld();
        hw.run(); 
    }
}
    
    
    