<div align="center">

# ☕ Java DSA Mastery — Pattern by Pattern

### *Stop grinding randomly. Start thinking in patterns.*

[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![LeetCode](https://img.shields.io/badge/Platform-LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/jeevithswarup/)
[![Status](https://img.shields.io/badge/Status-Active%20🔥-brightgreen?style=for-the-badge)](https://github.com/jeevithswarup/java-basics)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![Last Commit](https://img.shields.io/github/last-commit/jeevithswarup/java-basics?style=for-the-badge&color=purple)](https://github.com/jeevithswarup/java-basics/commits/main)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-45%2B-orange?style=for-the-badge)](https://github.com/jeevithswarup/java-basics/tree/main/LeetCode)

</div>

---

## 🧭 About This Repo

This is my structured DSA preparation repository where I solve problems **pattern by pattern**, not randomly. Each folder maps to a specific algorithmic pattern — once I understand the pattern deeply, I move to the next.

**Why pattern-based over random solving?**
Random grinding builds familiarity with individual problems. Pattern-based learning builds the *mental model* to recognize and solve *any* problem in that category — which is exactly what interviews test.

This repo is for students and developers who want to crack SWE interviews by building real problem-solving intuition, not just memorizing solutions.

---

## 🗺️ Progress Tracker

| # | Pattern | Status | Problems Solved | Difficulty |
|---|---------|--------|:--------------:|------------|
| 1 | 📦 Arrays (Fundamentals) | ✅ Done | 28+ | Easy – Medium |
| 2 | 👉 Two Pointers | ✅ Done | 5+ | Easy – Medium |
| 3 | 🪟 Sliding Window | ✅ Done | 8+ | Medium |
| 4 | ➕ Prefix Sum | ✅ Done | 7+ | Easy – Medium |
| 5 | 📈 Kadane's Algorithm | ✅ Done | 3+ | Medium |
| 6 | 🔀 Sorting Algorithms | ✅ Done | 4+ | Easy – Hard |
| 7 | 🔍 Binary Search | ✅ Done | 10+ | Medium – Hard |
| 8 | 🔁 Recursion | 🔄 In Progress | [XX] | Medium |
| 9 | 🌿 Backtracking | 🔒 Coming Soon | — | — |
| 10 | 🔗 Linked Lists | 🔒 Coming Soon | — | — |
| 11 | 📚 Stacks & Queues | 🔒 Coming Soon | — | — |
| 12 | 🌳 Trees & BST | 🔒 Coming Soon | — | — |
| 13 | 🏔️ Heaps & Priority Queue | 🔒 Coming Soon | — | — |
| 14 | 🕸️ Graphs (BFS / DFS) | 🔒 Coming Soon | — | — |
| 15 | 💡 Dynamic Programming | 🔒 Coming Soon | — | — |
| 16 | 🤑 Greedy Algorithms | 🔒 Coming Soon | — | — |
| 17 | 🌲 Tries | 🔒 Coming Soon | — | — |
| 18 | 🔢 Bit Manipulation | 🔒 Coming Soon | — | — |

---

## 📂 Repo Structure

```
📦 java-basics
 ┣ 📂 ArrayPlay              ← Arrays, Two Pointers, Sliding Window,
 ┃ ┣ 📜 TwoPointersArray.java    Prefix Sum, Kadane's, Sorting
 ┃ ┣ 📜 PrefixSum.java
 ┃ ┣ 📜 Kadenes_algo.java
 ┃ ┣ 📜 Selection_Sort.java
 ┃ ┣ 📜 Longest_Substring.java
 ┃ ┗ 📜 ... (28 files)
 ┣ 📂 LeetCode               ← Pattern-tagged LeetCode solutions
 ┃ ┣ 📜 LC001_TwoSum.java
 ┃ ┣ 📜 LC_704.java          ← Binary Search
 ┃ ┣ 📜 LC_560.java          ← Prefix Sum
 ┃ ┣ 📜 LC_003.java          ← Sliding Window
 ┃ ┣ 📜 LC_53.java           ← Kadane's
 ┃ ┗ 📜 ... (45+ files)
 ┣ 📂 Recursion              ← Recursion problems (In Progress)
 ┣ 📂 HackerRank             ← HackerRank practice
 ┣ 📂 PreInsta               ← PrepInsta problems
 ┗ 📜 README.md
```

---

## 🧠 Pattern Cheat Sheet

<details>
<summary><b>📦 1. Arrays (Fundamentals)</b></summary>

**When to use:** Any problem involving traversal, searching, or manipulation of a linear collection of elements.

**Key techniques:** Two-pass, HashMap for frequency/lookup, in-place modification.

```java
// Frequency count using HashMap
Map<Integer, Integer> freq = new HashMap<>();
for (int num : nums) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
```

**Classic problems from this repo:**
- [LC001 - Two Sum](LeetCode/LC001_TwoSum.java)
- [LC283 - Move Zeroes](LeetCode/LC283.java)
- [LC238 - Product of Array Except Self](LeetCode/LC_238.java)
- [LC075 - Sort Colors](LeetCode/LC_075.java)

</details>

<details>
<summary><b>👉 2. Two Pointers</b></summary>

**When to use:** Sorted array problems, pair/triplet finding, palindrome checks, or any problem where you need to compare elements from both ends.

**Key template:**
```java
int left = 0, right = nums.length - 1;
while (left < right) {
    if (condition) {
        left++;
    } else {
        right--;
    }
}
```

**Classic problems from this repo:**
- [LC344 - Reverse String](LeetCode/LC_344.java)
- [LC018 - 4Sum](LeetCode/LC_018.java)
- [LC011 - Container With Most Water](LeetCode/LC_11.java)
- [Valid Palindrome](ArrayPlay/Valid_Palindrome.java)

</details>

<details>
<summary><b>🪟 3. Sliding Window</b></summary>

**When to use:** Contiguous subarray or substring problems with a constraint (max/min length, sum, distinct chars, etc.).

**Key template:**
```java
int left = 0, maxLen = 0;
Map<Character, Integer> window = new HashMap<>();

for (int right = 0; right < s.length(); right++) {
    // expand: add s[right] to window
    window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);

    // shrink: while window is invalid, move left
    while (/* window invalid */) {
        window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
        left++;
    }

    maxLen = Math.max(maxLen, right - left + 1);
}
```

**Classic problems from this repo:**
- [LC003 - Longest Substring Without Repeating](LeetCode/LC_003.java)
- [LC209 - Minimum Size Subarray Sum](LeetCode/LC_209.java)
- [LC1004 - Max Consecutive Ones III](LeetCode/LC_1004.java)
- [LC424 - Longest Repeating Character Replacement](LeetCode/LC_424.java)
- [LC643 - Maximum Average Subarray](LeetCode/LC_643.java)
- [LC713 - Subarray Product Less Than K](LeetCode/LC_713.java)
- [LC1343 - Number of Sub-arrays of Size K](LeetCode/LC_1343.java)

</details>

<details>
<summary><b>➕ 4. Prefix Sum</b></summary>

**When to use:** Range sum queries, subarray sum problems, or when you need cumulative information up to index `i` in O(1) after O(n) preprocessing.

**Key template:**
```java
int[] prefix = new int[nums.length + 1];
for (int i = 0; i < nums.length; i++) {
    prefix[i + 1] = prefix[i] + nums[i];
}
// Sum of subarray [l, r] = prefix[r+1] - prefix[l]
```

**Classic problems from this repo:**
- [LC303 - Range Sum Query](LeetCode/LC_303.java)
- [LC1480 - Running Sum of 1D Array](LeetCode/LC_1480.java)
- [LC560 - Subarray Sum Equals K](LeetCode/LC_560.java)
- [LC523 - Continuous Subarray Sum](LeetCode/LC_523.java)
- [LC525 - Contiguous Array](LeetCode/LC_525.java)
- [LC724 - Find Pivot Index](LeetCode/LC_724.java)
- [LC974 - Subarray Sums Divisible by K](LeetCode/LC_974.java)

</details>

<details>
<summary><b>📈 5. Kadane's Algorithm</b></summary>

**When to use:** Maximum/minimum subarray sum problems. Extends to 2D arrays and circular arrays.

**Key template:**
```java
int maxSum = nums[0];
int currentSum = nums[0];

for (int i = 1; i < nums.length; i++) {
    currentSum = Math.max(nums[i], currentSum + nums[i]);
    maxSum = Math.max(maxSum, currentSum);
}
```

**Classic problems from this repo:**
- [LC053 - Maximum Subarray](LeetCode/LC_53.java)
- [LC121 - Best Time to Buy and Sell Stock](LeetCode/LC_121.java)
- [LC152 - Maximum Product Subarray](LeetCode/LC_152.java)

</details>

<details>
<summary><b>🔀 6. Sorting Algorithms</b></summary>

**When to use:** When order matters for the solution, or as a preprocessing step. Know the tradeoffs: Bubble/Selection/Insertion are O(n²), Merge/Quick are O(n log n).

**Key template (Selection Sort):**
```java
for (int i = 0; i < n - 1; i++) {
    int minIdx = i;
    for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[minIdx]) minIdx = j;
    }
    int temp = nums[minIdx];
    nums[minIdx] = nums[i];
    nums[i] = temp;
}
```

**Classic problems from this repo:**
- [LC075 - Sort Colors (Dutch National Flag)](LeetCode/LC_075.java)
- [LC088 - Merge Sorted Array](LeetCode/LC88.java)
- [LC977 - Squares of a Sorted Array](LeetCode/LC977.java)
- [Selection Sort](ArrayPlay/Selection_Sort.java)

</details>

<details>
<summary><b>🔍 7. Binary Search</b></summary>

**When to use:** Sorted array search, search space reduction, "find minimum/maximum satisfying condition" problems. If you can define a monotonic predicate, binary search applies.

**Key template:**
```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2; // avoids overflow
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
return -1;
```

**Classic problems from this repo:**
- [LC704 - Binary Search](LeetCode/LC_704.java)
- [LC034 - Find First and Last Position](LeetCode/LC_034.java)
- [LC035 - Search Insert Position](LeetCode/LC_035.java)
- [LC074 - Search a 2D Matrix](LeetCode/LC_074.java)
- [LC004 - Median of Two Sorted Arrays](LeetCode/LC_004.java)
- [LC1011 - Capacity To Ship Packages](LeetCode/LC_1011.java)
- [LC1283 - Find the Smallest Divisor](LeetCode/LC_1283.java)
- [LC1482 - Minimum Number of Days to Make Bouquets](LeetCode/LC_1482.java)
- [LC1760 - Minimum Limit of Balls in a Bag](LeetCode/LC_1760.java)
- [Allocate Minimum Pages](ArrayPlay/allocate_minimum_pages.java)

</details>

<details>
<summary><b>🔁 8. Recursion (In Progress 🔄)</b></summary>

**When to use:** Problems that can be broken into smaller identical subproblems. Think: "Can I solve this if I already had the answer for a smaller input?"

**Key template:**
```java
returnType solve(params) {
    // Base case — smallest valid input
    if (baseCondition) return baseValue;

    // Recursive case — reduce the problem
    return solve(smallerParams);
}
```

**Classic problems:**
- Factorial, Fibonacci
- Power(x, n) → [LC050](LeetCode/LC_50.java)
- Subsets → [LC078](LeetCode/LC_78.java)

</details>

---

## 📅 Daily Commitment

> Consistency beats intensity. Every. Single. Time.

- Solving problems daily with focus on **understanding patterns**, not just passing test cases
- Every solution includes the thought process, not just the code
- Tracking progress through GitHub contributions

*"The expert in anything was once a beginner who refused to quit."*

---

## 🛠️ How to Use This Repo

**Clone the repo:**
```bash
git clone https://github.com/jeevithswarup/java-basics.git
cd java-basics
```

**Compile and run any solution:**
```bash
# Compile
javac LeetCode/LC001_TwoSum.java

# Run
java -cp LeetCode LC001_TwoSum
```

**Recommended setup:**
- IDE: [IntelliJ IDEA](https://www.jetbrains.com/idea/) (best for Java) or [VS Code](https://code.visualstudio.com/) with the Java Extension Pack
- JDK: 11 or later

**How solutions are organized:**
- `LeetCode/` — Pure LeetCode problems, named `LC_<number>.java`
- `ArrayPlay/` — Pattern practice files (Arrays, Two Pointers, Sliding Window, Prefix Sum, Kadane's, Sorting)
- `Recursion/` — Recursion-specific problems
- `HackerRank/` — HackerRank practice
- `PreInsta/` — PrepInsta problems

---

## 📊 Stats

<div align="center">

![Jeevith's GitHub Stats](https://github-readme-stats.vercel.app/api?username=jeevithswarup&show_icons=true&theme=tokyonight&hide_border=true&count_private=true)

![Top Languages](https://github-readme-stats.vercel.app/api/top-langs/?username=jeevithswarup&layout=compact&theme=tokyonight&hide_border=true)

![GitHub Streak](https://streak-stats.demolab.com?user=jeevithswarup&theme=tokyonight&hide_border=true)

[![LeetCode Stats](https://leetcard.jacoblin.cool/jeevithswarup?theme=dark&font=Nunito&ext=heatmap)](https://leetcode.com/u/jeevithswarup/)

</div>

---

## 🤝 Connect With Me

<div align="center">

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/[YOUR-LINKEDIN-USERNAME])
[![LeetCode](https://img.shields.io/badge/LeetCode-Profile-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/jeevithswarup/)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jeevithswarup)

</div>

---

<div align="center">

### ⭐ If this repo helped you, drop a star — it keeps me motivated to solve more!

*Built with ☕ and consistency by [Jeevith Swarup](https://github.com/jeevithswarup)*

</div>
