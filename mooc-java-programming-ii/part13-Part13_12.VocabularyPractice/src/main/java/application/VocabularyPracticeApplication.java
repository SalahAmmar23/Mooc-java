package vocabularypractice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class VocabularyPracticeApplication extends Application {

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        HashMap<String, String> vocabulary = new HashMap<>();
        Random random = new Random();

        // --- Navigation Buttons ---
        Button toInputButton = new Button("Enter new words");
        Button toPracticeButton = new Button("Practice");
        HBox navBar = new HBox(10, toInputButton, toPracticeButton);
        navBar.setPadding(new Insets(10));

        // --- Input View Content ---
        TextField wordField = new TextField();
        wordField.setPromptText("Word");
        TextField translationField = new TextField();
        translationField.setPromptText("Translation");
        Button addButton = new Button("Add the word pair");
        Label addStatus = new Label("");

        VBox inputContent = new VBox(10, wordField, translationField, addButton, addStatus);
        inputContent.setPadding(new Insets(10));

        VBox inputLayout = new VBox(navBar, inputContent);

        // --- Practice View Content ---
        Label wordLabel = new Label("");
        TextField answerField = new TextField();
        Button checkButton = new Button("Check");
        Label resultLabel = new Label("");

        VBox practiceContent = new VBox(10, wordLabel, answerField, checkButton, resultLabel);
        practiceContent.setPadding(new Insets(10));

        VBox practiceLayout = new VBox(navBar, practiceContent);

        // --- Scenes ---
        Scene inputScene = new Scene(inputLayout, 400, 300);
        Scene practiceScene = new Scene(practiceLayout, 400, 300);

        // --- Helper to load random word ---
        Runnable loadRandomWord = () -> {
            ArrayList<String> keys = new ArrayList<>(vocabulary.keySet());
            String word = keys.get(random.nextInt(keys.size()));
            wordLabel.setText("Translate the word '" + word + "'");
            answerField.clear();
            resultLabel.setText("");
        };

        // --- Logic ---
        addButton.setOnAction(e -> {
            String word = wordField.getText().trim();
            String translation = translationField.getText().trim();
            if (!word.isEmpty() && !translation.isEmpty()) {
                vocabulary.put(word, translation);
                addStatus.setText("Added: " + word + " = " + translation);
                wordField.clear();
                translationField.clear();
            }
        });

        toPracticeButton.setOnAction(e -> {
            if (!vocabulary.isEmpty()) {
                loadRandomWord.run();
                window.setScene(practiceScene);
            } else {
                addStatus.setText("Add some words first!");
                window.setScene(inputScene);
            }
        });

        checkButton.setOnAction(e -> {
            String currentWord = wordLabel.getText()
                    .replace("Translate the word '", "")
                    .replace("'", "");
            String correct = vocabulary.get(currentWord);
            String answer = answerField.getText().trim();

            if (answer.equalsIgnoreCase(correct)) {
                resultLabel.setText("Correct!");
            } else {
                resultLabel.setText("Incorrect! The correct answer was: " + correct);
            }

            loadRandomWord.run();
        });

        toInputButton.setOnAction(e -> {
            addStatus.setText("");
            window.setScene(inputScene);
        });

        window.setScene(inputScene);
        window.show();
    }
}