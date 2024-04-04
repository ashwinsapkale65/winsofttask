using System;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        int[] arr = { 10, 8, 15, 12, 6, 20, 1 };
        int[] ranks = arr.Select((value, index) => new { Value = value, Rank = index + 1 })
                         .OrderBy(item => item.Value)
                         .Select(item => item.Rank)
                         .ToArray();
        
        Console.WriteLine("Input array: " + string.Join(", ", arr));
        Console.WriteLine("Output array: " + string.Join(", ", ranks));
    }
}
