import java.util.ArrayList;
import java.util.List;

public class Sector {
    Cell c11;
    Cell c12;
    Cell c13;
    Cell c21;
    Cell c22;
    Cell c23;
    Cell c31;
    Cell c32;
    Cell c33;
    List<Cell> cells;


    public Sector(int num) {
        c11 = new Cell(1, 1, num, 0);
        c12 = new Cell(1, 2, num, 0);
        c13 = new Cell(1, 3, num, 0);
        c21 = new Cell(2, 1, num, 0);
        c22 = new Cell(2, 2, num, 0);
        c23 = new Cell(2, 3, num, 0);
        c31 = new Cell(3, 1, num, 0);
        c32 = new Cell(3, 2, num, 0);
        c33 = new Cell(3, 3, num, 0);
        cells = new ArrayList<>();
        cells.add(c11);
        cells.add(c12);
        cells.add(c13);
        cells.add(c21);
        cells.add(c22);
        cells.add(c23);
        cells.add(c31);
        cells.add(c32);
        cells.add(c33);
    }

    public void fill(int row, int col, int num) {
        if (row == 1) {
            if (col == 1) {
                c11.set(num);
            }
            if (col == 2) {
                c12.set(num);
            }
            if (col == 3) {
                c13.set(num);
            }
        }
        if (row == 2) {
            if (col == 1) {
                c21.set(num);
            }
            if (col == 2) {
                c22.set(num);
            }
            if (col == 3) {
                c23.set(num);
            }
        }
        if (row == 3) {
            if (col == 1) {
                c31.set(num);
            }
            if (col == 2) {
                c32.set(num);
            }
            if (col == 3) {
                c33.set(num);
            }
        }
    }

    public int get(int row, int col) {

        if (row == 1) {
            if (col == 1) {
                return c11.get();
            }
            if (col == 2) {
                return c12.get();
            }
            if (col == 3) {
                return c13.get();
            }
        }
        if (row == 2) {
            if (col == 1) {
                return c21.get();
            }
            if (col == 2) {
                return c22.get();
            }
            if (col == 3) {
                return c23.get();
            }
        }
        if (row == 3) {
            if (col == 1) {
                return c31.get();
            }
            if (col == 2) {
                return c32.get();
            }
            if (col == 3) {
                return c33.get();
            }
        }
        return 111111;
    }

    public int getter(int i) {
        return cells.get(i).get();
    }

//    public boolean hasemptyslot() {
//
//    }


}
