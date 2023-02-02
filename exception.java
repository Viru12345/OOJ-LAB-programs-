import java.util.Scanner;

class IllogicalAgeException extends Exception {
    private String message;

    IllogicalAgeException(String error_text) {
        this.message = error_text;
    }

    @Override
    public String toString() {
        return "IllogicalAgeException: " + this.message;
    }
}

class Father {
    private int age;
    Father(int age) throws IllogicalAgeException {
        if(age < 0)
            throw new IllogicalAgeException("Age is negative");
        this.age = age;
    }
    int getAge() {return this.age;}
}

class Son extends Father{
    private int age;
    Son(int age_son, int age_father) throws IllogicalAgeException {
        super(age_father);
        if(age_son < 0)
            throw new IllogicalAgeException("Age is negative");
        if(age_son >= age_father)
            throw new IllogicalAgeException("Age of son is greater than or equal to father");
        this.age = age_son;
    }
    int getAge() {return this.age;}
    int getParentAge() {return super.getAge();}
}

class Main {
    public static void main(String[] args) throws IllogicalAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of son and father:");
        Son son = new Son(sc.nextInt(), sc.nextInt());

        System.out.println("Age of father is: " + son.getParentAge());
        System.out.println("Age of son is: " + son.getAge());
        sc.close();
    }
}
