public class Course {
        private String courseNumber;
        private String courseTitle;
        private int workPerCreditHour; 
     
         // TODO: Implement a constrcutor with no parameters. Constructor should
        // set workPerCreditHour to 3 
        public Course() {
            workPerCreditHour = 3;
        }

        // TODO: Implement mutator methods - 
        //       setCourseNumber, setCourseTitle

        public void setCourseNumber(String courseNum) {
            courseNumber = courseNum;
        }

        public void setCourseTitle(String title) {
            courseTitle = title;
        }
          
        // TODO: Implement accessor methods - 
        //       getWorkPerCreditHour

        public int getWorkPerCreditHour() {
            return workPerCreditHour;
        }

        public String getCourseNumber() {
            return courseNumber;
        }

        public String getCourseTitle() {
            return courseTitle;
        }

        // TODO: Implement method computeExpectedWorkHours  
        //   A method should 
        //      print out the message: 
        //           "ERROR: expected work hours can only be computed for offered classes"
        //      return -1 

        public int computeExpectedWorkHours() {
            System.out.println("ERROR: expected work hours can only be computed for offered classes");
            return - 1;
        }
        
        public void printInfo() {
            System.out.println("Course Number: "+ courseNumber);
            System.out.println("Course Title: "+ courseTitle);
            
        }

       


     
}
