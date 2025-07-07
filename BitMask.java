public class BitMask {
    public static void main(String[] args) {
        final int READ = 1 << 0;
        final int WRITE = 1 << 1;
        final int EXCUTE = 1 << 2;

        int Permission = 0 ;
        Permission |= READ ;
        Permission |= WRITE ;

        if(( Permission & WRITE) != 0 ){
            System.out.println("User hava Write Permission");
        }else{
            System.out.println("Not Write Permission");
        }

    }
    
}
