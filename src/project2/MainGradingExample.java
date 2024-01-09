package java;

public class MainGradingExample {
  public static void main(String[] args) {
    try {
      // Letter Grading Example
      LetterGrading letterGrading = new LetterGrading();
      letterGrading.calculateGrade(75.5); // Example raw score
      letterGrading.displayGrade();

      // Pass/Fail Grading Example
      PassFailGrading passFailGrading = new PassFailGrading();
      passFailGrading.calculateGrade(60.0); // Example raw score
      passFailGrading.displayGrade();

      // Percentage Grading Example
      PercentageGrading percentageGrading = new PercentageGrading(200);
      percentageGrading.calculateGrade(85.0); // Example raw score
      percentageGrading.displayGrade();

    } catch (InvalidScoreException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
