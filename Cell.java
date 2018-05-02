public class Cell {
    int row;
    int col;
    int sector;
    int num;

    public Cell(int r, int c, int s, int n) {
        row = r;
        col = c;
        sector = s;
        num = n;
    }

    public int get () {
        return num;
    }

    public void set (int num) {
        this.num = num;
    }

    public void reset (int num) {
        this.num = 0;
    }

}
