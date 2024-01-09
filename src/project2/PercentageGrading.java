package java;

public class PercentageGrading implements GradingSystem{
  private double grade;
  private double maxScore;

  public PercentageGrading(){
    this(100);
  }

  public PercentageGrading(double maxScore){
    this.maxScore = maxScore;
  }

  public void calculateGrade(double score) throws InvalidScoreException{
    if(score < 0 || score > 100) {
      throw new InvalidScoreException("Invalid score: " + score + ". Score must be between 0 and 100.");
    }

    grade = (score/maxScore) * 100;
  }

  public void displayGrade(){
    System.out.println("Percentage: " + grade);
  }

}
