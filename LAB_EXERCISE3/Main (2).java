/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {

    void fight() {
        System.out.println("Fighting...");
    }

    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    void obey() {
        System.out.println("Obeying...");
    }

    @Override
    void kind() {
        System.out.println("Being kind...");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    void obey() {
        System.out.println("Disobeying...");
    }

    @Override
    void kind() {
        System.out.println("Being cruel...");
    }
}


class Arjun extends Pandav {

}


class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println("Being less kind...");
    }
}

class Duryodhan extends Kaurav {
    
}


class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Obeying...");
    }

    @Override
    void kind() {
        System.out.println("Being kind...");
    }
}

public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
