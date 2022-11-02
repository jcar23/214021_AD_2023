public class Main {
    public static void main(String[] args) {
        Human_Being h1 = new Human_Being();
        Human_Being h2 = new Human_Being(8,3,"a lot of nonsense ","to much about his/her on life! ");

        System.out.println(h2.toString());
        System.out.println(h2.getEat());
    }
}