package hackerRank;
public class COMPLEX {
    int real;
    int imaginary;

    COMPLEX(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public COMPLEX ADD(int a, COMPLEX s2) {
        COMPLEX c2 = new COMPLEX(0,0);
        c2.real = a + s2.real;
        c2.imaginary = s2.imaginary;
        return c2;
    }

    public COMPLEX ADD(COMPLEX s1, COMPLEX s2) {
        COMPLEX c2 = new COMPLEX(0,0);
        c2.real = s1.real + s2.real;
        c2.imaginary = s1.imaginary + s2.imaginary;
        return c2;
    }

    public void display(){
        System.out.println("Real:: " + this.real + " Imaginary:: " + this.imaginary);
    }

    public static void main(String[] args) {
        COMPLEX c1 = new COMPLEX(1,2);
        COMPLEX c2 = new COMPLEX(3,2);
        int a = 100;
        System.out.println("c1:: ");
        c1.display();
        System.out.println("c2:: ");
        c2.display();
        System.out.println("a:: " + a);
        
        COMPLEX c4 = new COMPLEX(0, 0);
        c4 = c4.ADD(a, c1);
        System.out.println("a + c1:: ");
        c4.display();

        c4 = c4.ADD(c1, c2);
        System.out.println("c1 + c2:: ");
        c4.display();
    }
}