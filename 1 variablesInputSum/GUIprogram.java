import javax.swing.JOptionPane; // this means import the JOptionPane class from the javax.swing package and this does not mean import the entire javax.swing package an we are using it here to get the input from the user and to display the output to the user
public class GUIprogram {
    public static void main(String[] args){
        //GUI = Graphical User Interface
        //JFrame = a GUI window to add components to
        //JPanel = a GUI panel to hold components
        
        String name = JOptionPane.showInputDialog("Enter your name: "); // this will display a dialog box to the user and will take the input from the user and will store it in the name variable and JOptionPane.showInputDialog() is a static method and it will return a string
        JOptionPane.showMessageDialog(null, "Hello "+name); // this will display a dialog box to the user and will display the message "Hello "+name and null is the parent component and JOptionPane.showMessageDialog() is a static method and it will return void

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); // this will display a dialog box to the user and will take the input from the user and will store it in the age variable and Integer.parseInt() is a static method and it will convert the string to an integer.
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: ")); // this will display a dialog box to the user and will take the input from the user and will store it in the height variable and Double.parseDouble() is a static method and it will convert the string to a double.
        JOptionPane.showMessageDialog(null, "Your height is "+height+"cm");
    }
}
