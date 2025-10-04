# 🎯 QuizFusion

**QuizFusion** is a modular, multi-language quiz engine built in Java, powered by JSON-based question banks and Python-driven result analytics. Designed for developers, learners, and educators who want a clean, branded, and extensible quiz platform.

---

## 🧠 Features

- ✅ Java-powered quiz engine with dynamic question loading
- 📦 JSON-based question bank for easy editing and expansion
- 📊 Python analytics with pie chart visualization
- 📁 Result export to JSON for cross-language integration
- 🧩 Modular file structure for clarity and scalability

---

## 🚀 How to Run

### 🔧 Compile Java files with Gson:

```bash
javac -cp "lib/gson-2.10.1.jar" src/com/quizfusion/*.java
```
# Run the quiz engine:
```bash
java -cp "lib/gson-2.10.1.jar;src" com.quizfusion.QuizFusion
```
🧪 Sample Java Output
text
? What is the capital of France?
  0) Berlin
  1) Madrid
  2) Paris
  3) Rome
Your answer: 2
✅ Correct!

? Which language runs in a web browser?
  0) Java
  1) C
  2) Python
  3) JavaScript
Your answer: 3
✅ Correct!

? Who developed Java?
  0) Microsoft
  1) Sun Microsystems
  2) Apple
  3) Google
Your answer: 3
❌ Incorrect. Correct answer: Sun Microsystems

🎯 Final Score: 2 / 3  
📁 Results exported to data/results.json
📊 Python Result Analysis
📦 Install matplotlib:
```bash
pip install matplotlib
📈 Run the analysis script:
```
```bash
python analysis/analyze_results.py
```
🖼️ Pie Chart Output:
✅ Correct: 66.7%

❌ Incorrect: 33.3%

The chart clearly visualizes performance distribution:

🟩 Correct — 2 out of 3
🟥 Incorrect — 1 out of 3.

📄 JSON Question Bank
```json
[
  {
    "prompt": "What is the capital of France?",
    "options": ["Berlin", "Madrid", "Paris", "Rome"],
    "correctIndex": 2
  },
  {
    "prompt": "Which language runs in a web browser?",
    "options": ["Java", "C", "Python", "JavaScript"],
    "correctIndex": 3
  },
  {
    "prompt": "Who developed Java?",
    "options": ["Microsoft", "Sun Microsystems", "Apple", "Google"],
    "correctIndex": 1
  }
]
```
🖋️ Author
Crafted by Murad — visionary full-stack developer and system architect. Branded, modular, and elegant — just the way code should be.
