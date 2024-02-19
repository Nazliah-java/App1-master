package lesson9.example15;

import javax.swing.*;

public class RecipeApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RecipeBookGUI recipeBookGUI = new RecipeBookGUI();
            recipeBookGUI.setVisible(true);
        });
    }
}