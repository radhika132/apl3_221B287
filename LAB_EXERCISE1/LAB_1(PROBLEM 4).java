/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class One {
    One(int x) {
        System.out.println("One's constructor with parameter: " + x);
    }
}

class Two extends One {
  
    Two(int x) {
        super(x); 
        System.out.println("Two's constructor with parameter: " + x);
    }
}

class Application4 {
    public static void main(String[] args) {
        Two obj = new Two(10); 
    }
}
