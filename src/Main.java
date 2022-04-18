import java.util.*;
class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // הגדר רשימה של תלמידים
        StudentInfo[] student = new StudentInfo[3];
        // אתחל את הממוצע הגבוה ביותר במדעי המחשב
        int bestAverage=0;
        // אתחל את המקום ברשימה של התלמיד בעל הממוצע הגבוה ביותר במדעי המחשב
        int bestAveragePlace=0;
        // אתחל את מספר התלמידים ששפרו את ציון מדעי המחשב במחצית ב
        int improved=0;
        // בדוק את כל התלמידים
        for (int i=0; i<3; i++)
        {
            // קלוט תז
            System.out.println("pleas enter id " +(i+1)+ " student");
            int id = input.nextInt();
            // קלוט מספר מקצועות
            System.out.println("pleas enter subgect num");
            int subjectNum = input.nextInt();
            // קלוט ציון א
            System.out.println("pleas grade 1");
            int grade1 = input.nextInt();
            // קלוט ציון ב
            System.out.println("pleas grade 2");
            int grade2 = input.nextInt();
            // שמור נתוני תלמיד
            StudentInfo studentInfo = new StudentInfo(id, subjectNum, grade1, grade2);
            student[i]=studentInfo;
            // בדוק אם הממוצע של התלמיד במדעי המחשב גדול מהממוצע הגבוה ביותר
            if(student[i].average()>bestAverage)
            {
                // עדכן את המקום ברשימה של התלמיד בעל הממוצע הגבוה
                bestAveragePlace=i;
                // עדכן את הממוצע הגבוה ביותר במדעי המחשב
                bestAverage=student[i].average();
            }
            // בדוק אם התלמיד שיפר את ציון מדעי המחשב במחצית ב
            if (student[i].improved())
            {
                // עדכן את מספר התלמידים ששפרו את ציון מדעי המחשב במחצית ב
                improved++;
            }
            //אם שני הציונים מתחת ל70
            if (student[i].getGrade1()<70&&student[i].getGrade2()<70)
            {
                //הוסף לשני הציונים 5 נקודות
                student[i].setGrade1(student[i].getGrade1()+5);
                student[i].setGrade2(student[i].getGrade2()+5);
            }
            //בדיקה אם לתלמיד הציון השנתי מתחת ל60
            if (student[i].average()<60)
            {
                //להוסיף מקצוע למספר המקצועות
                student[i].setNumOfSubjects(student[i].getNumOfSubjects()+1);
            }
        }

        // הצג את תז של התלמיד עם הממוצע הגדול ביותר
        System.out.println(student[bestAveragePlace].getId());
        // הצג את מספר התלמידים ששפרו את ציון מדעי המחשב במחצית ב
        System.out.println(improved);




    }
}