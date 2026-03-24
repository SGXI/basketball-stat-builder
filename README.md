# Basketball Stat Builder

A console-based Java application designed to track individual player performance across a season and analyze "Hit Rates" against custom statistical benchmarks.

---

## Description
This tool allows users to input game-by-game data—including opponent names, points, rebounds, and assists—using an **Object-Oriented** approach. Once the data is collected, the program calculates season averages and allows the user to run multiple "what-if" scenarios to see how often a player met specific performance goals.

---

## Key Features
* **Object-Oriented Design**: Utilizes a custom `Game` class to ensure data integrity.
* **Dynamic Benchmarking**: Manually input target stats to calculate hit percentages on the fly.
* **Buffer Management**: Robust input handling to prevent common Java `Scanner` errors.
* **Season Analytics**: Instant calculation of PPG (Points Per Game), RPG (Rebounds Per Game), and APG (Assists Per Game).

---

## The Logic
The program evaluates "Hits" based on a user-defined threshold. A game is counted as a "Hit" if it meets the following logical condition:

$$\text{Hit} = (\text{Points} \ge P) \land (\text{Rebounds} \ge R) \land (\text{Assists} \ge A)$$

The final output is calculated as:

$$\text{Hit \%} = \left( \frac{\text{Total Hits}}{\text{Total Games Played}} \right) \times 100$$

---

## How to Run

1. **Compile the code**:
   `javac BBallStats.java`
2. **Run the application**:
   `java BBallStats`
3. **Follow the prompts**: Enter the number of games, then fill in the stats for each game. Finally, enter your target benchmarks to see the hit rate.

---

## Technical Stack
* **Language**: Java
* **Data Structures**: `ArrayList`, Custom Objects
* **Input Handling**: `java.util.Scanner`

## Author
* **Saubidhya Pandit** - *Student at Toronto Metropolitan University*

