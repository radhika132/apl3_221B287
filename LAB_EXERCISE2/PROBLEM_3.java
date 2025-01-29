/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Pack1 {
    protected void display() {
        System.out.println("Display method in Pack1");
    }
}

public class Main extends Pack1 {  
    public static void main(String[] args) {
        Main obj = new Main();  
        obj.display(); 
    }
}