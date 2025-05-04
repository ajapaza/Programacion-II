interface AInterfaces {
     public class A {
        public static int x; 
        public static int z; 
    }

    default void A(int x, int z) {
        A.x = x; 
        A.z = z; 
    }
    default void incrementaXZ() {
        A.x = A.x + 1; 
        A.z = A.z + 1; 
        System.out.println("x= " + A.x + ", z= " + A.z); 
    }
    default void incrementaZ() { 
        A.z = A.z + 1; 
        System.out.println("z= " + A.z ); 
    }
}