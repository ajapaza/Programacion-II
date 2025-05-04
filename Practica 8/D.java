public class D implements AInterfaces, BInterfaces {
    public D(int x, int y, int z) {
        A(x, z); 
        B(y, z); 
    }
    public void incrementaXYZ() {
        incrementaXZ(); 
        incrementaYZ(); 
    }
}