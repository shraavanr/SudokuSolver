import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    Sector c11;
    Sector c12;
    Sector c13;
    Sector c21;
    Sector c22;
    Sector c23;
    Sector c31;
    Sector c32;
    Sector c33;
    List<Sector> sectors;

    public SudokuBoard() {
        c11 = new Sector(0);
        c12 = new Sector(0);
        c13 = new Sector(0);
        c21 = new Sector(0);
        c22 = new Sector(0);
        c23 = new Sector(0);
        c31 = new Sector(0);
        c32 = new Sector(0);
        c33 = new Sector(0);
        sectors = new ArrayList();
        sectors.add(c11);
        sectors.add(c12);
        sectors.add(c13);
        sectors.add(c21);
        sectors.add(c22);
        sectors.add(c23);
        sectors.add(c31);
        sectors.add(c32);
        sectors.add(c33);

    }

    public void fill (int row, int col, int num) {
        if (row == 1) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c13.fill(1, 1, num);
                }
                if (nol == 2) {
                    c13.fill(1, 2, num);
                }
                if (nol == 3) {
                    c13.fill(1, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c12.fill(1, 1, num);
                }
                if (nol == 2) {
                    c12.fill(1, 2, num);
                }
                if (nol == 3) {
                    c12.fill(1, 3, num);
                }
            }
            if (col == 1) {
                c11.fill(1, 1, num);
            }
            if (col == 2) {
                c11.fill(1, 2, num);
            }
            if (col == 3) {
                c11.fill(1, 3, num);
            }
        }

        if (row == 2) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c13.fill(2, 1, num);
                }
                if (nol == 2) {
                    c13.fill(2, 2, num);
                }
                if (nol == 3) {
                    c13.fill(2, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c12.fill(2, 1, num);
                }
                if (nol == 2) {
                    c12.fill(2, 2, num);
                }
                if (nol == 3) {
                    c12.fill(2, 3, num);
                }
            }
            if (col == 1) {
                c11.fill(2, 1, num);
            }
            if (col == 2) {
                c11.fill(2, 2, num);
            }
            if (col == 3) {
                c11.fill(2, 3, num);
            }
        }

        if (row == 3) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c13.fill(3, 1, num);
                }
                if (nol == 2) {
                    c13.fill(3, 2, num);
                }
                if (nol == 3) {
                    c13.fill(3, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c12.fill(3, 1, num);
                }
                if (nol == 2) {
                    c12.fill(3, 2, num);
                }
                if (nol == 3) {
                    c12.fill(3, 3, num);
                }
            }
            if (col == 1) {
                c11.fill(3, 1, num);
            }
            if (col == 2) {
                c11.fill(3, 2, num);
            }
            if (col == 3) {
                c11.fill(3, 3, num);
            }
        }

        if (row == 4) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c23.fill(1, 1, num);
                }
                if (nol == 2) {
                    c23.fill(1, 2, num);
                }
                if (nol == 3) {
                    c23.fill(1, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c22.fill(1, 1, num);
                }
                if (nol == 2) {
                    c22.fill(1, 2, num);
                }
                if (nol == 3) {
                    c22.fill(1, 3, num);
                }
            }
            if (col == 1) {
                c21.fill(1, 1, num);
            }
            if (col == 2) {
                c21.fill(1, 2, num);
            }
            if (col == 3) {
                c21.fill(1, 3, num);
            }
        }

        if (row == 5) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c23.fill(2, 1, num);
                }
                if (nol == 2) {
                    c23.fill(2, 2, num);
                }
                if (nol == 3) {
                    c23.fill(2, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c22.fill(2, 1, num);
                }
                if (nol == 2) {
                    c22.fill(2, 2, num);
                }
                if (nol == 3) {
                    c22.fill(2, 3, num);
                }
            }
            if (col == 1) {
                c21.fill(2, 1, num);
            }
            if (col == 2) {
                c21.fill(2, 2, num);
            }
            if (col == 3) {
                c21.fill(2, 3, num);
            }
        }

        if (row == 6) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c23.fill(3, 1, num);
                }
                if (nol == 2) {
                    c23.fill(3, 2, num);
                }
                if (nol == 3) {
                    c23.fill(3, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c22.fill(3, 1, num);
                }
                if (nol == 2) {
                    c22.fill(3, 2, num);
                }
                if (nol == 3) {
                    c22.fill(3, 3, num);
                }
            }
            if (col == 1) {
                c21.fill(3, 1, num);
            }
            if (col == 2) {
                c21.fill(3, 2, num);
            }
            if (col == 3) {
                c21.fill(3, 3, num);
            }
        }

        if (row == 7) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c33.fill(1, 1, num);
                }
                if (nol == 2) {
                    c33.fill(1, 2, num);
                }
                if (nol == 3) {
                    c33.fill(1, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c32.fill(1, 1, num);
                }
                if (nol == 2) {
                    c32.fill(1, 2, num);
                }
                if (nol == 3) {
                    c32.fill(1, 3, num);
                }
            }
            if (col == 1) {
                c31.fill(1, 1, num);
            }
            if (col == 2) {
                c31.fill(1, 2, num);
            }
            if (col == 3) {
                c31.fill(1, 3, num);
            }
        }

        if (row == 8) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c33.fill(2, 1, num);
                }
                if (nol == 2) {
                    c33.fill(2, 2, num);
                }
                if (nol == 3) {
                    c33.fill(2, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c32.fill(2, 1, num);
                }
                if (nol == 2) {
                    c32.fill(2, 2, num);
                }
                if (nol == 3) {
                    c32.fill(2, 3, num);
                }
            }
            if (col == 1) {
                c31.fill(2, 1, num);
            }
            if (col == 2) {
                c31.fill(2, 2, num);
            }
            if (col == 3) {
                c31.fill(2, 3, num);
            }
        }

        if (row == 9) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    c33.fill(3, 1, num);
                }
                if (nol == 2) {
                    c33.fill(3, 2, num);
                }
                if (nol == 3) {
                    c33.fill(3, 3, num);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    c32.fill(3, 1, num);
                }
                if (nol == 2) {
                    c32.fill(3, 2, num);
                }
                if (nol == 3) {
                    c32.fill(3, 3, num);
                }
            }
            if (col == 1) {
                c31.fill(3, 1, num);
            }
            if (col == 2) {
                c31.fill(3, 2, num);
            }
            if (col == 3) {
                c31.fill(3, 3, num);
            }
        }
    }

    public int get (int row, int col) {
        if (row == 1) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c13.get(1, 1);
                }
                if (nol == 2) {
                    return c13.get(1, 2);
                }
                if (nol == 3) {
                    return c13.get(1, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c12.get(1, 1);
                }
                if (nol == 2) {
                    return c12.get(1, 2);
                }
                if (nol == 3) {
                    return c12.get(1, 3);
                }
            }
            if (col == 1) {
                return c11.get(1, 1);
            }
            if (col == 2) {
                return c11.get(1, 2);
            }
            if (col == 3) {
                return c11.get(1, 3);
            }
        }

        if (row == 2) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c13.get(2, 1);
                }
                if (nol == 2) {
                    return c13.get(2, 2);
                }
                if (nol == 3) {
                    return c13.get(2, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return  c12.get(2, 1);
                }
                if (nol == 2) {
                    return c12.get(2, 2);
                }
                if (nol == 3) {
                    return c12.get(2, 3);
                }
            }
            if (col == 1) {
                return c11.get(2, 1);
            }
            if (col == 2) {
                return c11.get(2, 2);
            }
            if (col == 3) {
                return c11.get(2, 3);
            }
        }

        if (row == 3) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c13.get(3, 1);
                }
                if (nol == 2) {
                    return c13.get(3, 2);
                }
                if (nol == 3) {
                    return c13.get(3, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c12.get(3, 1);
                }
                if (nol == 2) {
                    return c12.get(3, 2);
                }
                if (nol == 3) {
                    return c12.get(3, 3);
                }
            }
            if (col == 1) {
                return c11.get(3, 1);
            }
            if (col == 2) {
                return c11.get(3, 2);
            }
            if (col == 3) {
                return c11.get(3, 3);
            }
        }

        if (row == 4) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c23.get(1, 1);
                }
                if (nol == 2) {
                    return c23.get(1, 2);
                }
                if (nol == 3) {
                    return c23.get(1, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c22.get(1, 1);
                }
                if (nol == 2) {
                    return c22.get(1, 2);
                }
                if (nol == 3) {
                    return c22.get(1, 3);
                }
            }
            if (col == 1) {
                return c21.get(1, 1);
            }
            if (col == 2) {
                return c21.get(1, 2);
            }
            if (col == 3) {
                return c21.get(1, 3);
            }
        }

        if (row == 5) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c23.get(2, 1);
                }
                if (nol == 2) {
                    return c23.get(2, 2);
                }
                if (nol == 3) {
                    return c23.get(2, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c22.get(2, 1);
                }
                if (nol == 2) {
                    return c22.get(2, 2);
                }
                if (nol == 3) {
                    return c22.get(2, 3);
                }
            }
            if (col == 1) {
                return c21.get(2, 1);
            }
            if (col == 2) {
                return c21.get(2, 2);
            }
            if (col == 3) {
                return c21.get(2, 3);
            }
        }

        if (row == 6) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c23.get(3, 1);
                }
                if (nol == 2) {
                    return c23.get(3, 2);
                }
                if (nol == 3) {
                    return c23.get(3, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c22.get(3, 1);
                }
                if (nol == 2) {
                    return c22.get(3, 2);
                }
                if (nol == 3) {
                    return c22.get(3, 3);
                }
            }
            if (col == 1) {
                return  c21.get(3, 1);
            }
            if (col == 2) {
                return c21.get(3, 2);
            }
            if (col == 3) {
                return c21.get(3, 3);
            }
        }

        if (row == 7) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c33.get(1, 1);
                }
                if (nol == 2) {
                    return c33.get(1, 2);
                }
                if (nol == 3) {
                    return c33.get(1, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c32.get(1, 1);
                }
                if (nol == 2) {
                    return c32.get(1, 2);
                }
                if (nol == 3) {
                    return c32.get(1, 3);
                }
            }
            if (col == 1) {
                return c31.get(1, 1);
            }
            if (col == 2) {
                return c31.get(1, 2);
            }
            if (col == 3) {
                return c31.get(1, 3);
            }
        }

        if (row == 8) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c33.get(2, 1);
                }
                if (nol == 2) {
                    return c33.get(2, 2);
                }
                if (nol == 3) {
                    return c33.get(2, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c32.get(2, 1);
                }
                if (nol == 2) {
                    return c32.get(2, 2);
                }
                if (nol == 3) {
                    return c32.get(2, 3);
                }
            }
            if (col == 1) {
                return c31.get(2, 1);
            }
            if (col == 2) {
                return c31.get(2, 2);
            }
            if (col == 3) {
                return c31.get(2, 3);
            }
        }

        if (row == 9) {
            if (col > 6) {
                int nol = col - 6;
                if (nol == 1) {
                    return c33.get(3, 1);
                }
                if (nol == 2) {
                    return c33.get(3, 2);
                }
                if (nol == 3) {
                    return c33.get(3, 3);
                }
            }
            if (col > 3) {
                int nol = col - 3;
                if (nol == 1) {
                    return c32.get(3, 1);
                }
                if (nol == 2) {
                    return c32.get(3, 2);
                }
                if (nol == 3) {
                    return c32.get(3, 3);
                }
            }
            if (col == 1) {
                return c31.get(3, 1);
            }
            if (col == 2) {
                return c31.get(3, 2);
            }
            if (col == 3) {
                return c31.get(3, 3);
            }
        }

        return 11111111;
    }

    public void view() {
        System.out.println(this.get(1,1)+"|"+this.get(1,2)+"|"+this.get(1,3)+"|"+this.get(1,4)+"|"+this.get(1,5)+"|"+this.get(1,6)+"|"+this.get(1,7)+"|"+this.get(1,8)+"|"+this.get(1,9));
        System.out.println(this.get(2,1)+"|"+this.get(2,2)+"|"+this.get(2,3)+"|"+this.get(2,4)+"|"+this.get(2,5)+"|"+this.get(2,6)+"|"+this.get(2,7)+"|"+this.get(2,8)+"|"+this.get(2,9));
        System.out.println(this.get(3,1)+"|"+this.get(3,2)+"|"+this.get(3,3)+"|"+this.get(3,4)+"|"+this.get(3,5)+"|"+this.get(3,6)+"|"+this.get(3,7)+"|"+this.get(3,8)+"|"+this.get(3,9));
        System.out.println(this.get(4,1)+"|"+this.get(4,2)+"|"+this.get(4,3)+"|"+this.get(4,4)+"|"+this.get(4,5)+"|"+this.get(4,6)+"|"+this.get(4,7)+"|"+this.get(4,8)+"|"+this.get(4,9));
        System.out.println(this.get(5,1)+"|"+this.get(5,2)+"|"+this.get(5,3)+"|"+this.get(5,4)+"|"+this.get(5,5)+"|"+this.get(5,6)+"|"+this.get(5,7)+"|"+this.get(5,8)+"|"+this.get(5,9));
        System.out.println(this.get(6,1)+"|"+this.get(6,2)+"|"+this.get(6,3)+"|"+this.get(6,4)+"|"+this.get(6,5)+"|"+this.get(6,6)+"|"+this.get(6,7)+"|"+this.get(6,8)+"|"+this.get(6,9));
        System.out.println(this.get(7,1)+"|"+this.get(7,2)+"|"+this.get(7,3)+"|"+this.get(7,4)+"|"+this.get(7,5)+"|"+this.get(7,6)+"|"+this.get(7,7)+"|"+this.get(7,8)+"|"+this.get(7,9));
        System.out.println(this.get(8,1)+"|"+this.get(8,2)+"|"+this.get(8,3)+"|"+this.get(8,4)+"|"+this.get(8,5)+"|"+this.get(8,6)+"|"+this.get(8,7)+"|"+this.get(8,8)+"|"+this.get(8,9));
        System.out.println(this.get(9,1)+"|"+this.get(9,2)+"|"+this.get(9,3)+"|"+this.get(9,4)+"|"+this.get(9,5)+"|"+this.get(9,6)+"|"+this.get(9,7)+"|"+this.get(9,8)+"|"+this.get(9,9));
    }

    public boolean onePossibility(Position pos, SudokuBoard s) {
        List<String> set = new ArrayList<>();
        for (int i=1; i<10;i++) {
            set.add(Integer.toString(i));
        }
        removenumbersinRow(pos,set,s);
        removenumbersinCol(pos,set,s);
        s.removenumbersinSector(pos,set);

        if(set.size()==1) {
            String only = set.iterator().next();
            s.fill(pos.getRow(),pos.getCol(),Integer.parseInt(only));
            //System.out.println("Row: "+pos.getRow()+" Col: "+pos.getCol());
            return true;
        }

        return false;
    }

    private void removenumbersinSector(Position pos, List<String> set) {
        int col = pos.getCol();
        int row = pos.getRow();

        while (true) {

            if (col > 6) {
                if (row > 6) {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c33.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                }
                if (row > 3) {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c23.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                } else {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c13.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                }
            }

            if (col > 3) {
                if (row > 6) {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c32.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                }
                if (row > 3) {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c22.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                } else {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c12.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                }
            }

            if (col > 0) {
                if (row > 6) {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c31.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                }
                if (row > 3) {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c21.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                } else {
                    for (int i = 0; i < 9; i++) {
                        String num = Integer.toString(c11.getter(i));
                        if (set.contains(num)) {
                            set.remove(num);
                        }
                    }
                    break;
                }
            }
        }



    }

    private void removenumbersinCol(Position pos, List<String> set, SudokuBoard s) {
        int col = pos.getCol();
        for (int i=1; i<10;i++) {
            String num = Integer.toString(s.get(i,col));
            if(set.contains(num)) {
                set.remove(num);
            }
        }
    }

    private void removenumbersinRow(Position pos, List<String> set, SudokuBoard s) {
        int row = pos.getRow();
        for (int i=1; i<10;i++) {
            String num = Integer.toString(s.get(row,i));
            if(set.contains(num)) {
                set.remove(num);
            }
        }
    }

    public void easysolve(SudokuBoard s) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (s.get(i,j)==0) {
                    Position pos = new Position(i,j);
                    if(s.onePossibility(pos,s)) {
                        System.out.println("calculating...");
                        easysolve(s);
                    }
                }
            }
        }
    }


//    public Position findfirstemptySlot() {
//        for (Sector s: sectors) {
//            if (s.hasemptyslot) {
//                break;
//            }
//
//        }
//
//    }



    public static void main(String[] args) {
        SudokuBoard s = new SudokuBoard();
        s.view();
        s.fill(1,1,3);
        s.fill(2,2,3);
        s.fill(3,3,3);
        s.fill(4,4,3);
        s.fill(5,5,3);
        s.fill(6,6,3);
        System.out.println("break");
        s.view();



    }
}
