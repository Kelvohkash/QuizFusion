import json
import matplotlib.pyplot as plt

# Simulated result data (can be exported from Java later)
results = {
    "total": 3,
    "score": 2
}

# Pie chart
labels = ['Correct', 'Incorrect']
sizes = [results['score'], results['total'] - results['score']]
colors = ['green', 'red']

plt.figure(figsize=(5,5))
plt.pie(sizes, labels=labels, colors=colors, autopct='%1.1f%%')
plt.title('QuizFusion Result Analysis')
plt.show()
