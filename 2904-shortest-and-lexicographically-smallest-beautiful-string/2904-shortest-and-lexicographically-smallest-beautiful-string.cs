// Runtime : 5 ms
// Memory  : 42.81 MB

public class Solution {
    public string ShortestBeautifulSubstring(string s, int k) {
        
        // Initializing variables.
        int front = 0, rear = 0, size = 0;
        string answer = "";
        
        // Finding the first substring with 'k' 1's.
        int index, count;
        for (index = count = 0; index < s.Length && count < k; index++)
            count += (s[index] == '1') ? 1 : 0;
        
        // Returning value if no. of 1 < k.
        if (count < k)
            return answer;
        
        // Initializing values of all variables.
        rear = index;
        size = rear - front;
        answer = s.Substring(front, size);
        
        // Finding the lexicographically smallest substring.
        while (rear <= s.Length) {
            char digit = s[front];
            count -= (digit == '1') ? 1 : 0;
            front++;
            while (count < k && rear < s.Length) {
                count += (s[rear] == '1') ? 1 : 0;
                rear++;
            }
            if (count < k)
                return answer;
            if (size > rear - front || (size == rear - front && answer.CompareTo(s.Substring(front, rear - front)) > 0)) {
                size = rear - front;
                answer = s.Substring(front, size);
            }
        }
        
        // Returning the value.
        return answer;
    }
}