using System;
using System.Collections.Generic;

class Program
{
    public static int length(string s)
    {
        int maxLength = 0;
        int left = 0;
        Dictionary<char, int> lastIndex = new Dictionary<char, int>();

        for (int right = 0; right < s.Length; right++)
        {
            if (lastIndex.ContainsKey(s[right]) && lastIndex[s[right]] >= left)
            {
                left = lastIndex[s[right]] + 1;
            }

            lastIndex[s[right]] = right;
            maxLength = Math.Max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    static void Main(string[] args)
    {
        string s1 = "abcabcbb";
        string s2 = "bbbbb";
        string s3 = "pwwkew";

        Console.WriteLine("length of longest substring in '" + s1 + "': " + length(s1));
        Console.WriteLine("length of longest substring in '" + s2 + "': " + length(s2));
        Console.WriteLine("length of longest substring in '" + s3 + "': " + length(s3));
    }
}
