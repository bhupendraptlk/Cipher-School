/*
    Abstraction is a practice of in OOP that help us expose relevant functionalaties and hide the unnecessary ones
    Implemented using Interfaces and Abstract Classes
 */
interface HOD{
    void defineClassSchedule();
    void prepareTeamReport();
    void allowLeaves();
}
interface Proffessor{
    void takeClasses();
    void markAttendance();
    void setExamPaper();
}
public class AbstractionImp implements  HOD,Proffessor{
    @Override
    public void defineClassSchedule() {

    }

    @Override
    public void prepareTeamReport() {

    }

    @Override
    public void allowLeaves() {

    }

    @Override
    public void takeClasses() {

    }

    @Override
    public void markAttendance() {

    }

    @Override
    public void setExamPaper() {

    }

    public static void main(String[] args) {
        AbstractionImp ob =new AbstractionImp();
    }
}
