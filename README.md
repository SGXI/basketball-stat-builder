
Basketball Stat Builder
A console-based Java application designed to track individual player performance across a season and analyze "Hit Rates" against custom statistical benchmarks.

Description
This tool allows users to input game-by-game data—including opponent names, points, rebounds, and assists—using an Object-Oriented approach. Once the data is collected, the program calculates season averages and allows the user to run multiple "what-if" scenarios to see how often a player met specific performance goals.

Key Features
Object-Oriented Design: Utilizes a custom Game class to ensure data integrity.

Dynamic Benchmarking: Manually input target stats to calculate hit percentages on the fly.

Buffer Management: Robust input handling to prevent common Java Scanner errors.

Season Analytics: Instant calculation of PPG (Points Per Game), RPG (Rebounds Per Game), and APG (Assists Per Game).

The Logic
The program evaluates "Hits" based on a user-defined threshold. A game is counted as a "Hit" if it meets the following logical condition:

Hit=(Points≥P)∧(Rebounds≥R)∧(Assists≥A)
The final output is calculated as:

Hit %=( 
Total Games Played
Total Hits
​
 )×100
How to Run
Compile the code:

Bash
javac BBallStats.java
Run the application:

Bash
java BBallStats
Follow the prompts: Enter the number of games, then fill in the stats for each game. Finally, enter your target benchmarks to see the hit rate.

Technical Stack
Language: Java

Data Structures: ArrayList, Custom Objects

Input Handling: java.util.Scanner

Author
Satkar Gajurel - Student at Toronto Metroplitan University
