import org.apache.commons.math3.complex.Complex;

public class pr1maven {
    public static void main(String args[]){
        Complex nr1 = new Complex(9.99, 4.22);
        Complex nr2 = new Complex(1.99, 11.22);

        Complex equal = nr1.add(nr2);
        System.out.println("Suma este: " + equal);
    }
}