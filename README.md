# 🎲 Interactive Number Guessing Game — Java CLI

[![GitHub Stars](https://img.shields.io/github/stars/Aniket-Gund/Number-Game?style=for-the-badge&color=blue)](https://github.com/Aniket-Gund/Number-Game/stargazers)
[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://oracle.com/java)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)

An engaging command-line number guessing game programmed in Java. The application challenges the player to guess a pseudo-randomly generated integer within an adjustable range, providing directional feedback ("Too High" or "Too Low") within limited attempts per round.

---

## 🌟 Key Features

- **🎯 Pseudo-Random Generation**: Generates cryptographically secure target numbers between $1$ and $100$.
- **⏱️ Attempt Constraints & Score Tracking**: Rounds are capped with maximum permitted attempts, calculating final scores based on speed and accuracy.
- **🔄 Multi-Round Gameplay**: Allows players to immediately start subsequent rounds while preserving lifetime score tallies.
- **🎥 Video Demo**: Includes `Task_1.mp4` showcasing game walkthrough.

---

## 📂 Repository Structure

```
Number-Game/
│
├── Guess.java            # Primary game loop logic and attempt evaluator
├── Bank_Account.java     # Auxiliary banking class
├── Task_1.mp4            # Video recording of the game in action
├── Task_1 CodSoft.txt    # Assignment documentation
└── README.md             # Project documentation
```

---

## 🚀 How to Run

```bash
# Clone repo
git clone https://github.com/Aniket-Gund/Number-Game.git
cd Number-Game

# Compile and execute
javac Guess.java
java Guess
```

---

## 👨‍💻 Author

**Aniket Gund**
- GitHub: [@Aniket-Gund](https://github.com/Aniket-Gund)
- LinkedIn: [Aniket Gund](https://www.linkedin.com/in/aniket-gund/)

---

## 📄 License

Distributed under the [MIT License](LICENSE).
