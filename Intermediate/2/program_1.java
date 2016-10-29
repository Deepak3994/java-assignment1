public class program_1 {

    public static void main(String[] args) {
        int var = 0;
        System.out.println("The arguments entered in the command line are " );
        for (int i = 0; i < args.length; i++) {
            var = Integer.parseInt(args[i]);
            System.out.println(+ var);
        }
        
    }
}
