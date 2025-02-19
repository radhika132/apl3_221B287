/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

interface Testable {
    void display();
}

class Test implements Testable {

    public void display() {
        System.out.println("Displaying from Test class.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display(); 
    }
}
