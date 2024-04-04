using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        string str = "aabbccdefgh";
        Dictionary<char, int> frequency = new Dictionary<char, int>();

        foreach (char c in str)
        {
            if (!frequency.ContainsKey(c))
            {
                frequency[c] = 1;
            }
            else
            {
                frequency[c]++;
            }
        }

        var nonRepeatingChars = frequency.Where(pair => pair.Value == 1).Select(pair => pair.Key);

        Console.WriteLine("Non-repeating characters in '" + str + "': " + string.Join(", ", nonRepeatingChars));
    }
}
