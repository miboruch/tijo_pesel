package pl.edu.pwsztar;

class Main {
    public static void main(String[] args) {
        System.out.println("--- PESEL ---");
        UserId firstUser = new UserId("83070477662");

        firstUser.isCorrect();
    }
}
