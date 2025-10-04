package com.quizfusion;

import com.google.gson.*;
import java.io.FileReader;
import java.util.*;

public class QuizEngine {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public void loadQuestions(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonArray array = JsonParser.parseReader(reader).getAsJsonArray();
            for (JsonElement elem : array) {
                JsonObject obj = elem.getAsJsonObject();
                String prompt = obj.get("prompt").getAsString();
                JsonArray opts = obj.get("options").getAsJsonArray();
                String[] options = new String[opts.size()];
                for (int i = 0; i < opts.size(); i++) {
                    options[i] = opts.get(i).getAsString();
                }
                int correct = obj.get("correctIndex").getAsInt();
                questions.add(new Question(prompt, options, correct));
            }
        } catch (Exception e) {
            System.out.println("❌ Error loading questions: " + e.getMessage());
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println("\n❓ " + q.getPrompt());
            String[] opts = q.getOptions();
            for (int i = 0; i < opts.length; i++) {
                System.out.println("  " + i + ") " + opts[i]);
            }
            System.out.print("Your answer: ");
            int choice = scanner.nextInt();
            if (q.isCorrect(choice)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect. Correct answer: " + opts[q.getCorrectIndex()]);
            }
        }
        System.out.println("\n🎯 Final Score: " + score + " / " + questions.size());
    }

    public int getScore() {
        return score;
    }

    public int getTotal() {
        return questions.size();
    }
}
