
import java.rmi.*;
import java.rmi.server.*;

public class CalcImpl extends UnicastRemoteObject implements ICalc
{
    public CalcImpl() throws RemoteException {}

    @Override
    public double sum(double operand1, double operand2) throws RemoteException 
    {
         return operand1 + operand2;
    }

    @Override
    public double substraction(double operand1, double operand2) throws RemoteException 
    {
        return operand1 - operand2;
    }

    @Override
    public double multiplication(double operand1, double operand2) throws RemoteException 
    {
        return operand1 * operand2;
    }

    @Override
    public double division(double operand1, double operand2) throws RemoteException 
    {   
        if(operand2 == 0)
            return Double.NaN;
        
        return operand1/operand2;
    }

    @Override
    public double inverse(double operand) throws RemoteException 
    {   
        if(operand == 0)
            return Double.NaN;
        
        return 1/operand;
    }

    @Override
    public double exponentiation(double operand1, double operand2) throws RemoteException 
    {    
        return Math.pow(operand1, operand2);
    }

    @Override
    public double factorial(double operand) throws RemoteException 
    {       
        if(operand != (int)operand || operand < 0)
            return Double.NaN;
        
        double result = 1;
        for(int i=2; i<=operand; i++)
            result *= i;
        return result;
    }

    @Override
    public double squareRoot(double operand) throws RemoteException 
    {   
        if(operand < 0)
            return Double.NaN;
        
        return Math.sqrt(operand);
    }
}
