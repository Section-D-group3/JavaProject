package java;

public class PassFailGrading {
  private String grade;

  public void calculateGrade(double score) throws InvalidScoreException{
    
    if(score < 0 || score > 100) {
      throw new InvalidScoreException("Invalid score: " + score + ". Score must be between 0 and 100.");
    }

    if(score >= 50){
      grade = "pass";
    }else {
      grade = "fail";
    }
  }

  public void displayGrade(){
    System.out.println("Stats: " + grade);
  }
}
