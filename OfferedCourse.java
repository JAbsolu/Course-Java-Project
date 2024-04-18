public class OfferedCourse extends Course{
   private String instructorName;
   private String location;
   private String time;
   private int creditHours;


   public OfferedCourse(String courseNumber, String courseTitle, String name, String courseLocation, String courseTime, int credHours) {
      // TODO: write the code for a constructor that uses this set of parameters
      // to initialize the object data
      this.setCourseNumber(courseNumber);
      this.setCourseTitle(courseTitle);
      this.instructorName = name;
      this.location = courseLocation;
      this.time = courseTime;
      this.creditHours = credHours;
   }

   // TODO: implement two public printInfo methods, as described in the 
   // quiz document.
   public void printInfo() {
      System.out.println("Course number: " + this.getCourseNumber());
      System.out.println("Course Title: " + this.getCourseTitle());
      System.out.println("Instructor Name: " + this.instructorName);
      System.out.println("Course Location: " + this.location);
      System.out.println("Course Time: " + this.time);
   }

   public void printInfo(String header) {
      System.out.println(header);
      System.out.println("Course number: " + this.getCourseNumber());
      System.out.println("Course Title: " + this.getCourseTitle());
      System.out.println("Instructor Name: " + this.instructorName);
      System.out.println("Course Location: " + this.location);
      System.out.println("Course Time: " + this.time);
   }

   // TODO: implement computeExpectedWorkHours, as describes in the quiz document
   public int computeExpectedWorkHours() {
      return (creditHours * this.getWorkPerCreditHour());
   }
   

}
