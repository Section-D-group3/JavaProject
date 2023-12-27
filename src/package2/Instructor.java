package package2;
package package4;
import main.User.java;
import Attendance;

public class Instructor extends User {
  private String course;

  public Instructor (String course){
    this.course = course;
  }

  public Instructor(){
    this("Unknown");
  }

  void makeClassSchedule(){

  }
}
