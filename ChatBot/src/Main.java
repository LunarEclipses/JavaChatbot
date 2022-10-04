import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int byr = 2022;

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, name+", you're "+age);

        String sport = JOptionPane.showInputDialog("What is your favorite sport?");
        JOptionPane.showMessageDialog(null, name+", I think that "+sport+" is a cool sport.");

        int year= Integer.parseInt(JOptionPane.showInputDialog(null,"Hey, btw, what year is it?"));

        int compage = Integer.parseInt(JOptionPane.showInputDialog(null, "Can you guess my age?"));

        int nyr = year - byr;
        while (compage != nyr) {
            if(compage > nyr) {
                JOptionPane.showMessageDialog(null,"too high.");
            } else if (compage < nyr) {
                JOptionPane.showMessageDialog(null,"too low");
            }
            compage = Integer.parseInt(JOptionPane.showInputDialog(null, "guess again?"));
        }
        JOptionPane.showMessageDialog(null,"correct!");
        JOptionPane.showMessageDialog(null,"very cool anyways, goodbye.");
    }
}
