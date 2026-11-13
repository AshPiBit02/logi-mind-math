# Logi Mind Math

`logi-mind-math` is a collection of 100+ standalone programming exercises for practicing data structures, algorithms, mathematical problem solving, and numerical methods. Most examples are written in C++, with one Java implementation and three Jupyter notebooks.

## Topics

- **[Arrays](./arrays/)** — Searching, sorting, subarrays, prefix sums, matrix traversal, permutations, greedy problems, and sliding-window techniques.
- **[Linked List](./Linked%20List/)** — Singly, doubly, circular, multilevel, and random-pointer linked lists.
- **[Recursion & Backtracking](./Recursion%26Backtracking/)** — Merge sort, quicksort, permutations, subsets, maze solving, Sudoku, N-Queens, Knight's Tour, and word search.
- **[Strings](./strings/)** — Anagrams, palindromes, subsequences, permutations, word reversal, and character processing.
- **[Mathematical Algorithms](./cmath/)** — GCD, prime counting, happy numbers, number reversal, XOR operations, and Josephus problems.
- **[Binary Number System](./Binary%20Number%20System/)** — Decimal-to-binary and binary-to-decimal conversion.
- **[Booth's Algorithm](./Booth%27s%20Algorithm/)** — A Java implementation of Booth's multiplication algorithm.
- **[Numerical Methods](./Numerical%20Methods/)** — Jupyter notebooks for the bisection, Newton–Raphson, and secant methods.

The repository also includes a standalone circular linked-list solution for the Josephus problem at the project root.

## Repository Structure

```text
logi-mind-math/
├── arrays/
├── Binary Number System/
├── Booth's Algorithm/via-java/
├── cmath/
├── Linked List/
├── Numerical Methods/
│   ├── Bisection Method/
│   ├── Newton-Rhapson Method/
│   └── Secant Method/
├── Recursion&Backtracking/
│   ├── Stage0/
│   └── Stage1/
├── strings/
└── .github/workflows/
```

Each source file is focused on a single exercise and generally contains its own `main` function. There is no shared application or build system, so examples can be explored independently. The repository includes precompiled Windows `.exe` files alongside many sources; compiling from source is recommended for portability.

## Requirements

- A C++ compiler such as `g++` or `clang++`
- Java Development Kit (JDK) for the Booth's Algorithm example
- Jupyter Notebook or JupyterLab for the numerical-method notebooks

## Usage

### Compile a C++ example

From the repository root:

```bash
g++ -std=c++17 arrays/twosum.cpp -o twosum
./twosum
```

Replace `arrays/twosum.cpp` with any C++ source file. Examples may use different input formats, so review the selected source file before running it. To avoid cluttering the repository, place locally built binaries outside the source directory or add an output name that is ignored by your local workflow.

### Run the Java example

```bash
cd "Booth's Algorithm/via-java"
javac Main.java
java Main
```

### Open the numerical-method notebooks

```bash
jupyter notebook
```

Then open a notebook in [`Numerical Methods`](./Numerical%20Methods/).

## Continuous Integration

The GitHub Actions workflow in [`.github/workflows/c-cpp.yml`](./.github/workflows/c-cpp.yml) compiles changed C and C++ files with `g++ -std=c++17 -fsyntax-only` on pushes and pull requests targeting `main`.

## License

This project is released under the [MIT License](./LICENSE).
