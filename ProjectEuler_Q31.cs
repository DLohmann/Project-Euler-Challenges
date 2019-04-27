using System;
//using System.IO;
namespace Euler {
	public class Euler_Solver {

        /*
        Coin sums
        Problem 31 

        In England the currency is made up of pound, L, and pence, p, and there are eight coins in general circulation:
        1p, 2p, 5p, 10p, 20p, 50p, L1 (100p) and L2 (200p).
        It is possible to make L2 in the following way:
        1*L1 + 1*50p + 2*20p + 1*5p + 1*2p + 3*1p
        How many different ways can L2 be made using any number of coins?
        */

        // Each node represents a certain sum of money (certain amount of pence)
        // A nodes position in array represents its value in pence
        
        /*
        public struct node {
            int numWaysToSum;
            List<int> nextNodes;
        }
        */

        //*
        static int N = 200; // The amount of currency to calculate to, in pence

        //node currencyArr = new node [N + 1];    // The currency amounts will go from 0 to N
        static ulong [] currencyArr = new ulong [N + 1];

        static int [] currencyTypes = {1, 2, 5, 10, 20, 50, 100, 200};

        static void Main (string [] args) {
			Console.WriteLine("Project Euler Question 31\n");
            // This is going to use a dynamic programming approach

            // INITIALIZE ARRAY, INDICATING HOW MANY WAYS THERE ARE TO MAKE EACH TYPE OF CHANGE
            currencyArr[0] = 1; // There is only 1 way to get to 0 pence. And this is to start with 0 pence. Adding more coins will not bring you back to 0 pence.
            for (int i = 1; i < currencyArr.Length; i++) {
                currencyArr [i] = 0;
            }
            
            // The problem is that all these ways include duplicate ways
            /*
            for (int amount = 0; amount < currencyArr.Length; amount++) {
                
                Console.WriteLine("Number of ways to get to " + amount + " pence = " + currencyArr[amount]);

                for (int coinType = 0; coinType < currencyTypes.Length; coinType++) {
                    if (            amount + currencyTypes[coinType] < currencyArr.Length) {
                        currencyArr[amount + currencyTypes[coinType]] += currencyArr[amount];
                    } else {    // no more currency amounts within range of the coins
                        break;
                    }
                }

            }
            */

            // This takes advantage of the fact that numWaysToSum(n) = numWaysToSum(n-1) + numWaysToSum(n-2) + numWaysToSum(n-5) + numWaysToSum(n-10) + ... for each coin type
            // So numWaysToSum(n) = sum(numWaysToSum(n - coinAmount) for coinAmount in coinAmounts where n - coinAmount >= 0)
            /*
            for (int amount = 1; amount < currencyArr.Length; amount++) {
                ulong sumWays = 0;
                for (int coinType = 0; coinType < currencyTypes.Length; coinType++) {
                    if (amount - currencyTypes[coinType] >= 0) {
                        sumWays += currencyArr[amount - currencyTypes[coinType]];
                    } else {
                        break;
                    }
                    
                }
                currencyArr[amount] = sumWays;
            }
            */




            /* 
            for (int coinType = 1; coinType < currencyTypes.Length; coinType++) {
                for (int amount = currencyTypes[coinType]; amount < currencyArr.Length; amount++) {
                    currencyArr[amount] += 1;
                }
            }
            */

            /*
            int [] coinAmount = new int[currencyTypes.Length];  // C# pre-allocates this with 0's
            // Adjust 1 coin amount at a time to ensure that it is still under n. Sort of like an optimization algorithm does.
            for (int amount = 1; amount < currencyArr.Length; amount++) {
                int sumWays
            }
            */

            // Adjust 1 coin amount at a time to ensure it is still under 200. Then recored the appropriate sum
            //while

            // Print the entire currency array
            Console.WriteLine ("\n\nEntire Coin Array:");
            for (int i = 0; i < currencyArr.Length; i++) {
                Console.WriteLine (i + " p:\t" + currencyArr[i]);
            }
		}
        //*/
        /*
        static void Main (string [] args) {
            int count =0;
            for (int TwoPounds = 0; TwoPounds <= 1; TwoPounds++)
            {
                for (int OnePound = 0; OnePound <= 200 - (TwoPounds * 200); OnePound++)
                {
                    for (int FiftyPence = 0; FiftyPence <= 200 - (OnePound * 100 + TwoPounds * 200); FiftyPence++)
                    {
                        for (int TwentyPence = 0; TwentyPence <= 200 - (FiftyPence * 50 + OnePound * 100 + TwoPounds * 200); TwentyPence++)
                        {
                            for (int TenPence = 0; TenPence <= 200 - (TwentyPence * 20 + FiftyPence * 50 + OnePound * 100 + TwoPounds * 200); TenPence++)
                            {
                                for (int FivePence = 0; FivePence <= 200 - (TenPence * 10 + TwentyPence * 20 + FiftyPence * 50 + OnePound * 100 + TwoPounds * 200); FivePence++)
                                {
                                    for (int TwoPence = 0; TwoPence <= 200 - (FivePence * 5 + TenPence * 10 + TwentyPence * 20 + FiftyPence * 50 + OnePound * 100 + TwoPounds * 200); TwoPence++)
                                    {
                                        for (int OnePence = 0; OnePence <= 200 - (TwoPence *2 + FivePence *5 + TenPence * 10 + TwentyPence *20 + FiftyPence * 50 + OnePound * 100 + TwoPounds * 200 ); OnePence++)
                                        {
                                            int sum = 0;
                                            sum = TwoPounds * 200 + OnePound * 100 + FiftyPence * 50 + TwentyPence * 20
                                                                    + TenPence * 10 + FivePence * 5 + TwoPence * 2
                                                                    + OnePence * 1;
                                            if (sum == 200)
                                                count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Console.WriteLine(count);
        }
         */
	}
}