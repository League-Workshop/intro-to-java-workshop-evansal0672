package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("who are you");
JOptionPane.showMessageDialog(null,"hello"+ name);
}
}
