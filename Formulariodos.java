import javax.swing.*;
/*
 *@author Silvia Martinez
 */
public class Formulariodos extends JFrame{
    public Formulariodos() {
        setLayout(null);
    }

    public static void main(String[] ar) {
        Formulariodos formulario1 = new Formulariodos();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}