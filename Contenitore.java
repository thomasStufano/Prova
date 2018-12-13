import javax.swing.*;
import java.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenitore extends JFrame {

    String partenza = "";
    JButton[][] bottoni = new JButton[3][];

    public Contenitore() {
        super("Tris");		// metodi di Frame
        setLayout(new GridLayout(3, 3));
        partenza = JOptionPane.showInputDialog("Chi vuole iniziare?");
        while(partenza.equals("o") || partenza.equals("x"))
            partenza = JOptionPane.showInputDialog("Chi vuole iniziare?(SOLO MAIUSCOLE)");
        for (int i = 0; i < 3; i++) {
            bottoni[i] = new JButton[3];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bottoni[i][j] = new JButton(String.valueOf(i) + String.valueOf(j));
                add(bottoni[i][j]);
            }
        }
        setSize(150, 150);
        pack();
        setBounds(0, 0, 400, 400);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bottoni[i][j].addActionListener(new Ascoltatore());
            }
        }

    }

    public class Ascoltatore implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 9; i++) {
                vittoria();
                String pressione = e.getActionCommand();
                switch (Integer.valueOf(pressione)) {
                    case 00:
                        bottoni[0][0].setText(partenza);
                        bottoni[0][0].setEnabled(false);
                        break;
                    case 01:
                        bottoni[0][1].setText(partenza);
                        bottoni[0][1].setEnabled(false);
                        break;
                    case 02:
                        bottoni[0][2].setText(partenza);
                        bottoni[0][2].setEnabled(false);
                        break;
                    case 10:
                        bottoni[1][0].setText(partenza);
                        bottoni[1][0].setEnabled(false);
                        break;
                    case 11:
                        bottoni[1][1].setText(partenza);
                        bottoni[1][1].setEnabled(false);
                        break;
                    case 12:
                        bottoni[1][2].setText(partenza);
                        bottoni[1][2].setEnabled(false);
                        break;
                    case 20:
                        bottoni[2][0].setText(partenza);
                        bottoni[2][0].setEnabled(false);
                        break;
                    case 21:
                        bottoni[2][1].setText(partenza);
                        bottoni[2][1].setEnabled(false);
                        break;
                    case 22:
                        bottoni[2][2].setText(partenza);
                        bottoni[2][2].setEnabled(false);
                        break;
                }
                if (partenza.equals("X"))
                    partenza="O";
                            else partenza="X";
            }
            
        }
        public void vittoria(){
            if(bottoni[0][0].getText().equals("X") && bottoni[0][1].getText().equals("X") && bottoni[0][2].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[0][0].getText().equals("O") && bottoni[0][1].getText().equals("O") && bottoni[0][2].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[1][0].getText().equals("X") && bottoni[1][1].getText().equals("X") && bottoni[1][2].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[1][0].getText().equals("O") && bottoni[1][1].getText().equals("O") && bottoni[1][2].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[2][0].getText().equals("X") && bottoni[2][1].getText().equals("X") && bottoni[2][2].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[2][0].getText().equals("O") && bottoni[2][1].getText().equals("O") && bottoni[2][2].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[0][0].getText().equals("X") && bottoni[1][0].getText().equals("X") && bottoni[2][0].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[0][0].getText().equals("O") && bottoni[1][0].getText().equals("O") && bottoni[2][0].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[0][1].getText().equals("X") && bottoni[1][1].getText().equals("X") && bottoni[2][1].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[0][1].getText().equals("O") && bottoni[1][1].getText().equals("O") && bottoni[2][1].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[0][2].getText().equals("X") && bottoni[1][2].getText().equals("X") && bottoni[2][2].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[0][2].getText().equals("O") && bottoni[1][2].getText().equals("O") && bottoni[2][2].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[0][0].getText().equals("X") && bottoni[1][1].getText().equals("X") && bottoni[2][2].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[0][0].getText().equals("O") && bottoni[1][1].getText().equals("O") && bottoni[2][2].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
            else if(bottoni[0][2].getText().equals("X") && bottoni[1][1].getText().equals("X") && bottoni[2][0].getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' X");
                System.exit(0);
            }
            else if(bottoni[0][2].getText().equals("O") && bottoni[1][1].getText().equals("O") && bottoni[2][0].getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Il vincitore e' O");
                System.exit(0);
            }
        }
    }
}
