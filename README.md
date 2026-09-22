# TCS Research PPO — DSA Preparation 🚀

Java-based offline Data Structures and Algorithms (DSA) preparation repository for the TCS Research PPO interview.

---

## 📊 Progress Tracker

- [ ] Arrays
- [ ] Strings
- [ ] Hashing
- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Binary Search
- [ ] Linked List
- [ ] Stack / Queue
- [ ] Heap
- [ ] Trees / BST
- [ ] Backtracking
- [ ] Greedy
- [ ] Graphs
- [ ] Dynamic Programming

---

## 🛠️ Workflow Rules

For every problem, follow this disciplined routine:
1. **Understand** the problem and identify edge cases.
2. **Design** the approach from scratch.
3. **Implement** the complete Java program locally.
4. **Compile and run** tests.
5. **Submit** to LeetCode.
6. **Mark progress** in this repository.

---

## 📥 How to Take Input from Scratch (`BufferedReader`)

For competitive programming and efficient input handling in Java interviews, use `BufferedReader` combined with `StringTokenizer`. 

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1. Read a full line and tokenize it by whitespace
        st = new StringTokenizer(br.readLine()); 

        // 2. Extract and parse tokens sequentially using nextToken()
        int n = Integer.parseInt(st.nextToken());
        
        // Example: Reading subsequent tokens or next lines
        // String name = st.nextToken();
    }
}