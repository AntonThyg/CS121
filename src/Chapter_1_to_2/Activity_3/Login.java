//**********************************************************************************************************************
//                              Activity 3 part 2
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  User enters username and password.
//  If the username and password match preset variables then "Welcome to CS121" dialogue is shown
//  Specifies if username or password are incorrect or if both.
//**********************************************************************************************************************
package Chapter_1_to_2.Activity_3;
import javax.swing.*;
public class Login {
    public static void main(String[] args) {
        String username = "admin",password="password";
        String inpUser= JOptionPane.showInputDialog("Username: "),inpPass=JOptionPane.showInputDialog("Password: ");
        boolean correctUser=inpUser.equals(username),correctPass=inpPass.equals(password);
        if(correctUser&&correctPass){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Welcome to CS121");
        }else if(!correctPass&&correctUser){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Password is incorrect!");
        }else if(!correctUser&&correctPass){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Username is incorrect!");
        }else if(!correctPass&&!correctUser){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Username and Password are incorrect");
        }
    }
}
