public class StudentInfo {
    private int id;
    private int numOfSubjects;
    private int grade1;
    private int grade2;

    public StudentInfo(int id, int subgectNum, int grade1, int grade2) {
        this.id=id;
        this.numOfSubjects=subgectNum;
        this.grade1=grade1;
        this.grade2=grade2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getNumOfSubjects() {
        return this.numOfSubjects;
    }

    public void setNumOfSubjects(int numOfSubjects) {
        this.numOfSubjects = numOfSubjects;
    }
    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }
    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }
    //פעולה שמחזירה ממוצע של שני ציוני המחציות
    public int average()
    {
        return (this.grade1+this.grade2)/2;
    }
    //פעולה שמחזירה אמת אם התלמיד שיפר את ציונו בין המחציות
    public boolean improved()
    {
        // אם התלמיד השתפר הפעולה תחזיר אמת
        return(this.grade1<this.grade2);
    }


}