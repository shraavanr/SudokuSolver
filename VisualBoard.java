import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VisualBoard extends JFrame {
    private JLabel label;
    private JButton button;

    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private JTextField textfield5;
    private JTextField textfield6;
    private JTextField textfield7;
    private JTextField textfield8;
    private JTextField textfield9;
    private JTextField textfield10;
    private JTextField textfield11;
    private JTextField textfield12;
    private JTextField textfield13;
    private JTextField textfield14;
    private JTextField textfield15;
    private JTextField textfield16;
    private JTextField textfield17;
    private JTextField textfield18;
    private JTextField textfield19;
    private JTextField textfield20;
    private JTextField textfield21;
    private JTextField textfield22;
    private JTextField textfield23;
    private JTextField textfield24;
    private JTextField textfield25;
    private JTextField textfield26;
    private JTextField textfield27;
    private JTextField textfield28;
    private JTextField textfield29;
    private JTextField textfield30;
    private JTextField textfield31;
    private JTextField textfield32;
    private JTextField textfield33;
    private JTextField textfield34;
    private JTextField textfield35;
    private JTextField textfield36;
    private JTextField textfield37;
    private JTextField textfield38;
    private JTextField textfield39;
    private JTextField textfield40;
    private JTextField textfield41;
    private JTextField textfield42;
    private JTextField textfield43;
    private JTextField textfield44;
    private JTextField textfield45;
    private JTextField textfield46;
    private JTextField textfield47;
    private JTextField textfield48;
    private JTextField textfield49;
    private JTextField textfield50;
    private JTextField textfield51;
    private JTextField textfield52;
    private JTextField textfield53;
    private JTextField textfield54;
    private JTextField textfield55;
    private JTextField textfield56;
    private JTextField textfield57;
    private JTextField textfield58;
    private JTextField textfield59;
    private JTextField textfield60;
    private JTextField textfield61;
    private JTextField textfield62;
    private JTextField textfield63;
    private JTextField textfield64;
    private JTextField textfield65;
    private JTextField textfield66;
    private JTextField textfield67;
    private JTextField textfield68;
    private JTextField textfield69;
    private JTextField textfield70;
    private JTextField textfield71;
    private JTextField textfield72;
    private JTextField textfield73;
    private JTextField textfield74;
    private JTextField textfield75;
    private JTextField textfield76;
    private JTextField textfield77;
    private JTextField textfield78;
    private JTextField textfield79;
    private JTextField textfield80;
    private JTextField textfield81;
    private SudokuBoard fiftyminboard;
    private ArrayList<JTextField> liste;
    private ArrayList<JTextField> soliste;
    private JTextField solfield1;
    private JTextField solfield2;
    private JTextField solfield3;
    private JTextField solfield4;
    private JTextField solfield5;
    private JTextField solfield6;
    private JTextField solfield7;
    private JTextField solfield8;
    private JTextField solfield9;
    private JTextField solfield10;
    private JTextField solfield11;
    private JTextField solfield12;
    private JTextField solfield13;
    private JTextField solfield14;
    private JTextField solfield15;
    private JTextField solfield16;
    private JTextField solfield17;
    private JTextField solfield18;
    private JTextField solfield19;
    private JTextField solfield20;
    private JTextField solfield21;
    private JTextField solfield22;
    private JTextField solfield23;
    private JTextField solfield24;
    private JTextField solfield25;
    private JTextField solfield26;
    private JTextField solfield27;
    private JTextField solfield28;
    private JTextField solfield29;
    private JTextField solfield30;
    private JTextField solfield31;
    private JTextField solfield32;
    private JTextField solfield33;
    private JTextField solfield34;
    private JTextField solfield35;
    private JTextField solfield36;
    private JTextField solfield37;
    private JTextField solfield38;
    private JTextField solfield39;
    private JTextField solfield40;
    private JTextField solfield41;
    private JTextField solfield42;
    private JTextField solfield43;
    private JTextField solfield44;
    private JTextField solfield45;
    private JTextField solfield46;
    private JTextField solfield47;
    private JTextField solfield48;
    private JTextField solfield49;
    private JTextField solfield50;
    private JTextField solfield51;
    private JTextField solfield52;
    private JTextField solfield53;
    private JTextField solfield54;
    private JTextField solfield55;
    private JTextField solfield56;
    private JTextField solfield57;
    private JTextField solfield58;
    private JTextField solfield59;
    private JTextField solfield60;
    private JTextField solfield61;
    private JTextField solfield62;
    private JTextField solfield63;
    private JTextField solfield64;
    private JTextField solfield65;
    private JTextField solfield66;
    private JTextField solfield67;
    private JTextField solfield68;
    private JTextField solfield69;
    private JTextField solfield70;
    private JTextField solfield71;
    private JTextField solfield72;
    private JTextField solfield73;
    private JTextField solfield74;
    private JTextField solfield75;
    private JTextField solfield76;
    private JTextField solfield77;
    private JTextField solfield78;
    private JTextField solfield79;
    private JTextField solfield80;
    private JTextField solfield81;


    public VisualBoard() {
        setLayout(new FlowLayout());
//        label = new JLabel("Enter your Sudoku Board below:");
//        add(label);

        fiftyminboard = new SudokuBoard();

        liste = new ArrayList();
        soliste = new ArrayList();

        textfield1 = new JTextField(2);
        add(textfield1);
        liste.add(textfield1);
        textfield2 = new JTextField(2);
        add(textfield2);
        liste.add(textfield2);
        textfield3 = new JTextField(2);
        add(textfield3);
        liste.add(textfield3);
        textfield4 = new JTextField(2);
        add(textfield4);
        liste.add(textfield4);
        textfield5 = new JTextField(2);
        add(textfield5);
        liste.add(textfield5);
        textfield6 = new JTextField(2);
        add(textfield6);
        liste.add(textfield6);
        textfield7 = new JTextField(2);
        add(textfield7);
        liste.add(textfield7);
        textfield8 = new JTextField(2);
        add(textfield8);
        liste.add(textfield8);
        textfield9 = new JTextField(2);
        add(textfield9);
        liste.add(textfield9);

        textfield10 = new JTextField(2);
        add(textfield10);
        liste.add(textfield10);
        textfield11 = new JTextField(2);
        add(textfield11);
        liste.add(textfield11);
        textfield12 = new JTextField(2);
        add(textfield12);
        liste.add(textfield12);
        textfield13 = new JTextField(2);
        add(textfield13);
        liste.add(textfield13);
        textfield14 = new JTextField(2);
        add(textfield14);
        liste.add(textfield14);
        textfield15 = new JTextField(2);
        add(textfield15);
        liste.add(textfield15);
        textfield16 = new JTextField(2);
        add(textfield16);
        liste.add(textfield16);
        textfield17 = new JTextField(2);
        add(textfield17);
        liste.add(textfield17);
        textfield18 = new JTextField(2);
        add(textfield18);
        liste.add(textfield18);

        textfield19 = new JTextField(2);
        add(textfield19);
        liste.add(textfield19);
        textfield20 = new JTextField(2);
        add(textfield20);
        liste.add(textfield20);
        textfield21 = new JTextField(2);
        add(textfield21);
        liste.add(textfield21);
        textfield22 = new JTextField(2);
        add(textfield22);
        liste.add(textfield22);
        textfield23 = new JTextField(2);
        add(textfield23);
        liste.add(textfield23);
        textfield24 = new JTextField(2);
        add(textfield24);
        liste.add(textfield24);
        textfield25 = new JTextField(2);
        add(textfield25);
        liste.add(textfield25);
        textfield26 = new JTextField(2);
        add(textfield26);
        liste.add(textfield26);
        textfield27 = new JTextField(2);
        add(textfield27);
        liste.add(textfield27);

        textfield28 = new JTextField(2);
        add(textfield28);
        liste.add(textfield28);
        textfield29 = new JTextField(2);
        add(textfield29);
        liste.add(textfield29);
        textfield30 = new JTextField(2);
        add(textfield30);
        liste.add(textfield30);
        textfield31 = new JTextField(2);
        add(textfield31);
        liste.add(textfield31);
        textfield32 = new JTextField(2);
        add(textfield32);
        liste.add(textfield32);
        textfield33 = new JTextField(2);
        add(textfield33);
        liste.add(textfield33);
        textfield34 = new JTextField(2);
        add(textfield34);
        liste.add(textfield34);
        textfield35 = new JTextField(2);
        add(textfield35);
        liste.add(textfield35);
        textfield36 = new JTextField(2);
        add(textfield36);
        liste.add(textfield36);


        textfield37 = new JTextField(2);
        add(textfield37);
        liste.add(textfield37);
        textfield38 = new JTextField(2);
        add(textfield38);
        liste.add(textfield38);
        textfield39 = new JTextField(2);
        add(textfield39);
        liste.add(textfield39);
        textfield40 = new JTextField(2);
        add(textfield40);
        liste.add(textfield40);
        textfield41 = new JTextField(2);
        add(textfield41);
        liste.add(textfield41);
        textfield42 = new JTextField(2);
        add(textfield42);
        liste.add(textfield42);
        textfield43 = new JTextField(2);
        add(textfield43);
        liste.add(textfield43);
        textfield44 = new JTextField(2);
        add(textfield44);
        liste.add(textfield44);
        textfield45 = new JTextField(2);
        add(textfield45);
        liste.add(textfield45);

        textfield46 = new JTextField(2);
        add(textfield46);
        liste.add(textfield46);
        textfield47 = new JTextField(2);
        add(textfield47);
        liste.add(textfield47);
        textfield48 = new JTextField(2);
        add(textfield48);
        liste.add(textfield48);
        textfield49 = new JTextField(2);
        add(textfield49);
        liste.add(textfield49);
        textfield50 = new JTextField(2);
        add(textfield50);
        liste.add(textfield50);
        textfield51 = new JTextField(2);
        add(textfield51);
        liste.add(textfield51);
        textfield52 = new JTextField(2);
        add(textfield52);
        liste.add(textfield52);
        textfield53 = new JTextField(2);
        add(textfield53);
        liste.add(textfield53);
        textfield54 = new JTextField(2);
        add(textfield54);
        liste.add(textfield54);

        textfield55 = new JTextField(2);
        add(textfield55);
        liste.add(textfield55);
        textfield56 = new JTextField(2);
        add(textfield56);
        liste.add(textfield56);
        textfield57 = new JTextField(2);
        add(textfield57);
        liste.add(textfield57);
        textfield58 = new JTextField(2);
        add(textfield58);
        liste.add(textfield58);
        textfield59 = new JTextField(2);
        add(textfield59);
        liste.add(textfield59);
        textfield60 = new JTextField(2);
        add(textfield60);
        liste.add(textfield60);
        textfield61 = new JTextField(2);
        add(textfield61);
        liste.add(textfield61);
        textfield62 = new JTextField(2);
        add(textfield62);
        liste.add(textfield62);
        textfield63 = new JTextField(2);
        add(textfield63);
        liste.add(textfield63);

        textfield64 = new JTextField(2);
        add(textfield64);
        liste.add(textfield64);
        textfield65 = new JTextField(2);
        add(textfield65);
        liste.add(textfield65);
        textfield66 = new JTextField(2);
        add(textfield66);
        liste.add(textfield66);
        textfield67 = new JTextField(2);
        add(textfield67);
        liste.add(textfield67);
        textfield68 = new JTextField(2);
        add(textfield68);
        liste.add(textfield68);
        textfield69 = new JTextField(2);
        add(textfield69);
        liste.add(textfield69);
        textfield70 = new JTextField(2);
        add(textfield70);
        liste.add(textfield70);
        textfield71 = new JTextField(2);
        add(textfield71);
        liste.add(textfield71);
        textfield72 = new JTextField(2);
        add(textfield72);
        liste.add(textfield72);

        textfield73 = new JTextField(2);
        add(textfield73);
        liste.add(textfield73);
        textfield74 = new JTextField(2);
        add(textfield74);
        liste.add(textfield74);
        textfield75 = new JTextField(2);
        add(textfield75);
        liste.add(textfield75);
        textfield76 = new JTextField(2);
        add(textfield76);
        liste.add(textfield76);
        textfield77 = new JTextField(2);
        add(textfield77);
        liste.add(textfield77);
        textfield78 = new JTextField(2);
        add(textfield78);
        liste.add(textfield78);
        textfield79 = new JTextField(2);
        add(textfield79);
        liste.add(textfield79);
        textfield80 = new JTextField(2);
        add(textfield80);
        liste.add(textfield80);
        textfield81 = new JTextField(2);
        add(textfield81);
        liste.add(textfield81);

        button = new JButton("                                Click me                               ");
        add(button);

        solfield1 = new JTextField(2);
        add(solfield1);
        soliste.add(solfield1);
        solfield2 = new JTextField(2);
        add(solfield2);
        soliste.add(solfield2);
        solfield3 = new JTextField(2);
        add(solfield3);
        soliste.add(solfield3);
        solfield4 = new JTextField(2);
        add(solfield4);
        soliste.add(solfield4);
        solfield5 = new JTextField(2);
        add(solfield5);
        soliste.add(solfield5);
        solfield6 = new JTextField(2);
        add(solfield6);
        soliste.add(solfield6);
        solfield7 = new JTextField(2);
        add(solfield7);
        soliste.add(solfield7);
        solfield8 = new JTextField(2);
        add(solfield8);
        soliste.add(solfield8);
        solfield9 = new JTextField(2);
        add(solfield9);
        soliste.add(solfield9);

        solfield10 = new JTextField(2);
        add(solfield10);
        soliste.add(solfield10);
        solfield11 = new JTextField(2);
        add(solfield11);
        soliste.add(solfield11);
        solfield12 = new JTextField(2);
        add(solfield12);
        soliste.add(solfield12);
        solfield13 = new JTextField(2);
        add(solfield13);
        soliste.add(solfield13);
        solfield14 = new JTextField(2);
        add(solfield14);
        soliste.add(solfield14);
        solfield15 = new JTextField(2);
        add(solfield15);
        soliste.add(solfield15);
        solfield16 = new JTextField(2);
        add(solfield16);
        soliste.add(solfield16);
        solfield17 = new JTextField(2);
        add(solfield17);
        soliste.add(solfield17);
        solfield18 = new JTextField(2);
        add(solfield18);
        soliste.add(solfield18);

        solfield19 = new JTextField(2);
        add(solfield19);
        soliste.add(solfield19);
        solfield20 = new JTextField(2);
        add(solfield20);
        soliste.add(solfield20);
        solfield21 = new JTextField(2);
        add(solfield21);
        soliste.add(solfield21);
        solfield22 = new JTextField(2);
        add(solfield22);
        soliste.add(solfield22);
        solfield23 = new JTextField(2);
        add(solfield23);
        soliste.add(solfield23);
        solfield24 = new JTextField(2);
        add(solfield24);
        soliste.add(solfield24);
        solfield25 = new JTextField(2);
        add(solfield25);
        soliste.add(solfield25);
        solfield26 = new JTextField(2);
        add(solfield26);
        soliste.add(solfield26);
        solfield27 = new JTextField(2);
        add(solfield27);
        soliste.add(solfield27);

        solfield28 = new JTextField(2);
        add(solfield28);
        soliste.add(solfield28);
        solfield29 = new JTextField(2);
        add(solfield29);
        soliste.add(solfield29);
        solfield30 = new JTextField(2);
        add(solfield30);
        soliste.add(solfield30);
        solfield31 = new JTextField(2);
        add(solfield31);
        soliste.add(solfield31);
        solfield32 = new JTextField(2);
        add(solfield32);
        soliste.add(solfield32);
        solfield33 = new JTextField(2);
        add(solfield33);
        soliste.add(solfield33);
        solfield34 = new JTextField(2);
        add(solfield34);
        soliste.add(solfield34);
        solfield35 = new JTextField(2);
        add(solfield35);
        soliste.add(solfield35);
        solfield36 = new JTextField(2);
        add(solfield36);
        soliste.add(solfield36);


        solfield37 = new JTextField(2);
        add(solfield37);
        soliste.add(solfield37);
        solfield38 = new JTextField(2);
        add(solfield38);
        soliste.add(solfield38);
        solfield39 = new JTextField(2);
        add(solfield39);
        soliste.add(solfield39);
        solfield40 = new JTextField(2);
        add(solfield40);
        soliste.add(solfield40);
        solfield41 = new JTextField(2);
        add(solfield41);
        soliste.add(solfield41);
        solfield42 = new JTextField(2);
        add(solfield42);
        soliste.add(solfield42);
        solfield43 = new JTextField(2);
        add(solfield43);
        soliste.add(solfield43);
        solfield44 = new JTextField(2);
        add(solfield44);
        soliste.add(solfield44);
        solfield45 = new JTextField(2);
        add(solfield45);
        soliste.add(solfield45);

        solfield46 = new JTextField(2);
        add(solfield46);
        soliste.add(solfield46);
        solfield47 = new JTextField(2);
        add(solfield47);
        soliste.add(solfield47);
        solfield48 = new JTextField(2);
        add(solfield48);
        soliste.add(solfield48);
        solfield49 = new JTextField(2);
        add(solfield49);
        soliste.add(solfield49);
        solfield50 = new JTextField(2);
        add(solfield50);
        soliste.add(solfield50);
        solfield51 = new JTextField(2);
        add(solfield51);
        soliste.add(solfield51);
        solfield52 = new JTextField(2);
        add(solfield52);
        soliste.add(solfield52);
        solfield53 = new JTextField(2);
        add(solfield53);
        soliste.add(solfield53);
        solfield54 = new JTextField(2);
        add(solfield54);
        soliste.add(solfield54);

        solfield55 = new JTextField(2);
        add(solfield55);
        soliste.add(solfield55);
        solfield56 = new JTextField(2);
        add(solfield56);
        soliste.add(solfield56);
        solfield57 = new JTextField(2);
        add(solfield57);
        soliste.add(solfield57);
        solfield58 = new JTextField(2);
        add(solfield58);
        soliste.add(solfield58);
        solfield59 = new JTextField(2);
        add(solfield59);
        soliste.add(solfield59);
        solfield60 = new JTextField(2);
        add(solfield60);
        soliste.add(solfield60);
        solfield61 = new JTextField(2);
        add(solfield61);
        soliste.add(solfield61);
        solfield62 = new JTextField(2);
        add(solfield62);
        soliste.add(solfield62);
        solfield63 = new JTextField(2);
        add(solfield63);
        soliste.add(solfield63);

        solfield64 = new JTextField(2);
        add(solfield64);
        soliste.add(solfield64);
        solfield65 = new JTextField(2);
        add(solfield65);
        soliste.add(solfield65);
        solfield66 = new JTextField(2);
        add(solfield66);
        soliste.add(solfield66);
        solfield67 = new JTextField(2);
        add(solfield67);
        soliste.add(solfield67);
        solfield68 = new JTextField(2);
        add(solfield68);
        soliste.add(solfield68);
        solfield69 = new JTextField(2);
        add(solfield69);
        soliste.add(solfield69);
        solfield70 = new JTextField(2);
        add(solfield70);
        soliste.add(solfield70);
        solfield71 = new JTextField(2);
        add(solfield71);
        soliste.add(solfield71);
        solfield72 = new JTextField(2);
        add(solfield72);
        soliste.add(solfield72);

        solfield73 = new JTextField(2);
        add(solfield73);
        soliste.add(solfield73);
        solfield74 = new JTextField(2);
        add(solfield74);
        soliste.add(solfield74);
        solfield75 = new JTextField(2);
        add(solfield75);
        soliste.add(solfield75);
        solfield76 = new JTextField(2);
        add(solfield76);
        soliste.add(solfield76);
        solfield77 = new JTextField(2);
        add(solfield77);
        soliste.add(solfield77);
        solfield78 = new JTextField(2);
        add(solfield78);
        soliste.add(solfield78);
        solfield79 = new JTextField(2);
        add(solfield79);
        soliste.add(solfield79);
        solfield80 = new JTextField(2);
        add(solfield80);
        soliste.add(solfield80);
        solfield81 = new JTextField(2);
        add(solfield81);
        soliste.add(solfield81);

        event click =  new event();
        button.addActionListener(click);

    }

    public class event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(textfield1.getText());
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(1,i+1,helper(i));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(2,i+1,helper(i+9));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(3,i+1,helper(i+18));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(4,i+1,helper(i+27));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(5,i+1,helper(i+36));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(6,i+1,helper(i+45));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(7,i+1,helper(i+54));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(8,i+1,helper(i+63));
            }
            for(int i=0;i<9;i++) {
                fiftyminboard.fill(9,i+1,helper(i+72));
            }

            fiftyminboard.view();
            System.out.println("break");
            fiftyminboard.easysolve(fiftyminboard);
            fiftyminboard.view();

            for(int i=0;i<9;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(1,i+1)));
            }
            for(int i=9;i<18;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(2,i-8)));
            }
            for(int i=18;i<27;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(3,i-17)));
            }
            for(int i=27;i<36;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(4,i-26)));
            }
            for(int i=36;i<45;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(5,i-35)));
            }
            for(int i=45;i<54;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(6,i-44)));
            }
            for(int i=54;i<63;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(7,i-53)));
            }
            for(int i=63;i<72;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(8,i-62)));
            }
            for(int i=72;i<81;i++) {
                soliste.get(i).setText(Integer.toString(fiftyminboard.get(9,i-71)));
            }

        }

        public int helper(int i) {
            if(liste.get(i).getText().equals("")){
                return 0;
            } else return Integer.parseInt(liste.get(i).getText());
        }
    }

    public static void main(String[] args) {
        VisualBoard gui = new VisualBoard();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(300,540);
        gui.setTitle("Sudoku Solver");

//        SudokuBoard fiftyminboard = new SudokuBoard();
//        fiftyminboard.view();
//        System.out.println("break");
//        fiftyminboard.easysolve(fiftyminboard);
//        fiftyminboard.view();
    }
}
