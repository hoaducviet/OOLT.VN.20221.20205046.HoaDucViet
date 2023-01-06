import javax.swing.JOptionPane;

public class Calculate{
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Result: \n";
        // Input
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        // double num1 = Double.parseDouble (strNum1);
        // double num2 = Double.parseDouble (strNum2);
        double Sum = Double.parseDouble(strNum1) + Double.parseDouble(strNum2) ;
        double Sub = Double.parseDouble(strNum1) - Double.parseDouble(strNum2) ;
        double Mul = Double.parseDouble(strNum1) * Double.parseDouble(strNum2) ;
        double Div = Double.parseDouble(strNum1) / Double.parseDouble(strNum2) ;
        strNotification += strNum1 + " + " + strNum2 + " = " + Sum + "\n";
        strNotification += strNum1 + " - " + strNum2 + " = " + Sub + "\n";
        strNotification += strNum1 + " * " + strNum2 + " = " + Mul + "\n";
        strNotification += strNum1 + " / " + strNum2 + " = " + Math.ceil(Div * 1000) / 1000 + "\n";
        JOptionPane.showMessageDialog(null, strNotification, "Ket Qua", JOptionPane.INFORMATION_MESSAGE);
    }
}