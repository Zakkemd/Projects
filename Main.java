public class Main {
    public static void main(String[] args) {
        Draw draw = new Draw();


        System.out.println("\nHello, Hello, Welcome to the game! You have to guess the number that Java Machine drew.\nIt is only a demo version of the game so it can only choose number between 0-10. Goodluck!\n");

        while (draw.getStoredNumber() instanceof Integer) {
            draw.draw();
            draw.setStoredNumber();
            if (draw.getStoredNumber() instanceof Integer) {

                draw.count();
                draw.winOrLose();
            }
            else {
                break;
            }



            if (draw.getCount() == 3) {
                break;
            }




        }



    }
}