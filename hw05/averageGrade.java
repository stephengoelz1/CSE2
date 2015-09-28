import java.util.Scanner;

public class averageGrade {
        
        public static void main(String [] args) {
            Scanner GRADE = new Scanner(System.in);
            
            int grade = 0;
            int sum = 0;
            int counter = 0;
            
            while((grade>=0)&&(grade<=100))
            {
                System.out.println("Enter a grade");
                grade=GRADE.nextInt();
                if(grade==999){
                break;
           }
                sum=sum+grade;
                counter++;
            }   
            double avg = (sum/counter);
            System.out.println("Average grade: "+avg);
        }
}