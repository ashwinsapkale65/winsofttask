using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        int[] numbers = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        Dictionary<int, int> frequency = new Dictionary<int, int>();

        foreach (int num in numbers)
        {
            if (!frequency.ContainsKey(num))
            {
                frequency[num] = 1;
            }
            else
            {
                frequency[num]++;
            }
        }

        foreach (var kvp in frequency)
        {
            Console.WriteLine("Element: " + kvp.Key + ", Frequency: " + kvp.Value);
        }
    }
}
