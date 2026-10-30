# Logi Mind Math

`logi-mind-math` is a hands-on collection of data structures, algorithms, problem-solving exercises, and numerical-method experiments. The repository is primarily written in C++ and is intended for learning, practice, exam preparation, and strengthening algorithmic thinking.

## What You'll Find

- **[Arrays](./arrays/)** — Searching, sorting, two-pointer techniques, prefix sums, subarrays, matrix problems, partitioning, and sliding-window exercises.
- **[Linked Lists](./Linked%20List/)** — Singly, doubly, circular, multilevel, and random-pointer linked-list operations.
- **[Recursion & Backtracking](./Recursion%26Backtracking/)** — Permutations, subsets, sorting, maze problems, Sudoku, N-Queens, string partitioning, and other recursive solutions.
- **[Strings](./strings/)** — Palindromes, anagrams, subsequences, permutations, string transformations, and character-processing problems.
- **[Mathematical Algorithms](./cmath/)** — GCD, prime counting, powers, number reversal, Josephus problems, XOR techniques, and other mathematical utilities.
- **[Binary Number System](./Binary%20Number%20System/)** — Decimal/binary conversion exercises.
- **[Booth's Algorithm](./Booth's%20Algorithm/)** — A Java implementation of Booth's multiplication algorithm.
- **[Numerical Methods](./Numerical%20Methods/)** — Jupyter notebooks demonstrating the bisection, Newton–Raphson, and secant methods.

## Repository Layout

```text
logi-mind-math/
├── arrays/
├── Binary Number System/
├── Booth's Algorithm/
├── cmath/
├── Linked List/
├── Numerical Methods/
├── Recursion&Backtracking/
├── strings/
├── .github/workflows/
└── LICENSE
```

Most C++ files are standalone programs focused on one problem or technique. The repository also contains generated executables alongside several source files, while the numerical-method examples are provided as Jupyter notebooks.

## Getting Started

### Prerequisites

- A C++ compiler supporting C++11 or later, such as `g++` or `clang++`
- Java, if running the Booth's Algorithm example
- Jupyter Notebook or JupyterLab for the numerical-method notebooks

### Compile and Run a C++ Example

From the repository root:

```bash
g++ -std=c++17 arrays/twosum.cpp -o twosum
./twosum
```

Replace the source path and output name with the example you want to explore. Some programs may expect input from standard input; check the source file for its input format.

### Explore Numerical Methods

Start Jupyter from the repository root:

```bash
jupyter notebook
```

Then open a notebook under [`Numerical Methods`](./Numerical%20Methods/).

## Learning Notes

The examples are independent practice programs rather than a single application. They may use different input conventions and levels of completeness, so read each source file before compiling or adapting it. The precompiled binaries are platform-specific; compiling from source is recommended for your environment.

## License

This project is released under the [MIT License](./LICENSE).
