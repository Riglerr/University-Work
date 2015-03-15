using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HashFunction
{
    class Program
    {
        static void Main(string[] args)
        {
            String myName = "Robert";
            double sum = 0;


            for (int i = 0; i < myName.Length; i++) {

               sum += (myName[i]) * Math.Pow(i+5,i+1);

            }
            Console.WriteLine("Hash Function of " + myName + ": " + sum);
            Console.ReadLine();
        }
    }
}
