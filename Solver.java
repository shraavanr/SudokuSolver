public class Solver {


//    public void easysolve(SudokuBoard s) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (s.get(i,j)==0) {
//                    Position pos = new Position(i,j);
//                    if(s.onePossibility(pos,s)) {
//                        easysolve(s);
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        SudokuBoard fiftyminboard = new SudokuBoard();
        fiftyminboard.fill(1,1,1);
        fiftyminboard.fill(1,5,9);
        fiftyminboard.fill(1,6,2);
        fiftyminboard.fill(2,2,5);
        fiftyminboard.fill(2,3,8);
        fiftyminboard.fill(2,4,1);
        fiftyminboard.fill(2,5,6);
        fiftyminboard.fill(2,6,3);
        fiftyminboard.fill(3,2,2);
        fiftyminboard.fill(3,6,8);
        fiftyminboard.fill(3,7,1);
        fiftyminboard.fill(3,9,5);
        fiftyminboard.fill(4,2,6);
        fiftyminboard.fill(4,5,8);
        fiftyminboard.fill(4,7,4);
        fiftyminboard.fill(4,8,9);
        fiftyminboard.fill(4,9,1);
        fiftyminboard.fill(5,2,4);
        fiftyminboard.fill(5,8,8);
        fiftyminboard.fill(6,1,7);
        fiftyminboard.fill(6,2,8);
        fiftyminboard.fill(6,3,3);
        fiftyminboard.fill(6,5,4);
        fiftyminboard.fill(6,8,6);
        fiftyminboard.fill(7,1,3);
        fiftyminboard.fill(7,3,4);
        fiftyminboard.fill(7,4,6);
        fiftyminboard.fill(7,8,7);
        fiftyminboard.fill(8,4,8);
        fiftyminboard.fill(8,5,1);
        fiftyminboard.fill(8,6,9);
        fiftyminboard.fill(8,7,3);
        fiftyminboard.fill(8,8,5);
        fiftyminboard.fill(9,4,7);
        fiftyminboard.fill(9,5,3);
        fiftyminboard.fill(9,9,6);
        fiftyminboard.view();
        System.out.println("break");
        fiftyminboard.easysolve(fiftyminboard);
        fiftyminboard.view();



    }
}
