
import java.rmi.*;

public interface ICalc extends Remote
{
    public double sum(double operand1, double operand2) throws RemoteException;
    public double substraction(double operand1, double operand2) throws RemoteException;
    public double multiplication(double operand1, double operand2) throws RemoteException;
    public double division(double operand1, double operand2) throws RemoteException;
    public double inverse(double operand) throws RemoteException;
    public double exponentiation(double operand1, double operand2) throws RemoteException;
    public double factorial(double operand) throws RemoteException;
    public double squareRoot(double operand) throws RemoteException;
}
