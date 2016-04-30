
import java.rmi.*;

public class CalcServer 
{
    public static void main(String[] args) throws Exception
    {
        CalcImpl myCalc = new CalcImpl();
        String objectName = "rmi://" + "localhost" + "/CalculatorImplementation";
        Naming.bind(objectName, myCalc);
        System.out.println("Server is now ready, waiting for clients!");
    } 
}
