interface BInterfaces {
   public class B {
        public static int y; 
        public static int z; 
   }
    default void B(int y, int z) {
        B.y = y; 
        B.z = z; 
    }
    default void incrementaYZ() {
        B.y = B.y + 1; 
        B.z = B.z + 1; 
        System.out.println("y= " + B.y + ", z= " + B.z); 
    }
    default void incramentaZ() {
        B.z = B.z + 1; 
        System.out.println("z= " + B.z ); 
    }
}