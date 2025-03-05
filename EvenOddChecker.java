using System;

class EvenOddChecker
{
    
    public static int GetIntegerInput()
    {
        Console.Write("Enter an integer: ");
        int number = Convert.ToInt32(Console.ReadLine()); 
        return number; 
    }

    
    public static string CheckEvenOrOdd(int number)
    {
        
        if (number % 2 == 0)
        {
            return number + " is an Even number."; 
        }
        else
        {
            return number + " is an Odd number."; 
        }
    }

    
    public static void Main(string[] args)
    {
        
        int number = GetIntegerInput();
        
       
        string result = CheckEvenOrOdd(number);
        
      
        Console.WriteLine(result);
    }
}
