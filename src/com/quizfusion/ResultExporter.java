package com.quizfusion;

import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;

public class ResultExporter {

    public static void exportToJson(int score, int total, String filePath) {
        JsonObject result = new JsonObject();
        result.addProperty("score", score);
        result.addProperty("total", total);

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(result.toString());
            System.out.println("📁 Results exported to " + filePath);
        } catch (IOException e) {
            System.out.println("❌ Failed to export results: " + e.getMessage());
        }
    }
}
