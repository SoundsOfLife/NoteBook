class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> si = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                si.push(asteroids[i]);
            } else {
                if (si.empty() || si.peek() < 0) {
                    si.push(asteroids[i]);
                } else {
                    while (!si.empty() && si.peek() > 0 && si.peek() < Math.abs(asteroids[i])) {
                        si.pop();
                    }
                    if (si.empty() || si.peek() < 0) {
                        si.push(asteroids[i]);
                    } else if (si.peek() == Math.abs(asteroids[i])) {
                        si.pop();
                    } else {
                    }
                }
            }
        }
        int[] ans = new int[si.size()];
        for (int j = si.size() - 1; j >= 0; j--) {
            ans[j] = si.pop();
        }
        return ans;
    }
}