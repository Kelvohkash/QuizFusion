package com.quizfusion;

public class QuizFusion {
    public static void main(String[] args) {
        QuizEngine engine = new QuizEngine();
        engine.loadQuestions("data/questions.json");
        engine.start();

        ResultExporter.exportToJson(engine.getScore(), engine.getTotal(), "data/results.json");
    }
}
