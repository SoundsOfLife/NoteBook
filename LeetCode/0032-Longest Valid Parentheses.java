class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer> stack = new Stack<Integer>();
       int max = 0;
       int left = -1;
       for (int j = 0; j < s.length(); j++) {
           if (s.charAt(j) == '(') stack.push(j);
           else {
               if (stack.isEmpty()) left = j;
               else {
                   stack.pop();
                   if (stack.isEmpty()) max = Math.max(max, j - left);
                   else max = Math.max(max, j - stack.peek());
               }
           }
       }
       return max;
   }
}

/**
 * 
 * int longestValidParentheses(string s) {
            if(s.length() <= 1) return 0;
            int curMax = 0;
            vector<int> longest(s.size(),0);
            for(int i=1; i < s.length(); i++){
                if(s[i] == ')'){
                    if(s[i-1] == '('){
                        longest[i] = (i-2) >= 0 ? (longest[i-2] + 2) : 2;
                        curMax = max(longest[i],curMax);
                    }
                    else{ // if s[i-1] == ')', combine the previous length.
                        if(i-longest[i-1]-1 >= 0 && s[i-longest[i-1]-1] == '('){
                            longest[i] = longest[i-1] + 2 + ((i-longest[i-1]-2 >= 0)?longest[i-longest[i-1]-2]:0);
                            curMax = max(longest[i],curMax);
                        }
                    }
                }
                //else if s[i] == '(', skip it, because longest[i] must be 0
            }
            return curMax;
        }
 */