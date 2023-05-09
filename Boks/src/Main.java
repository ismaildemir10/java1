public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tyson",10,98,79,50);
        Fighter f2 = new Fighter("Anthony",20,95,80,20);
        Match match = new Match(f1,f2,75,85);
        match.run();



    }
}