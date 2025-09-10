import java.io.DataInputStream;

class Displaying {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        DataInputStream in = new DataInputStream(System.in);
        int num = 0;
        try {
            num = Integer.parseInt(in.readLine());
        } catch (Exception e){}
        System.out.print("You entered: " + num);
        System.out.println("\n=== Screen Displaying ===");
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=== Screen Display Done ===");
    }


}