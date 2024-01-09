package java;

public class LetterGrading implements GradingSystem{
  private String grade;

  public void calculateGrade(double score) throws InvalidScoreException{
    
    if(score < 0 || score > 100) {
      throw new InvalidScoreException("Invalid score: " + score + ". Score must be between 0 and 100.");
    }

    if(score >= 90){
      grade = "A+";
    }else if(score >= 80){
      grade = "A";
    }else if(score >= 70){
      grade = "B";
    }else if(score >= 60){
      grade = "C";
    }else if(score >= 50){
      grade = "D";
    }else{
      grade = "F";
    }
  }

  public void displayGrade(){
    System.out.println("Grade: " + grade);
  }
}
