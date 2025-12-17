class Students {
  private String sid;
  private String name;
  private String department;
  private Subject[] subjects;

  public Students(String sid, String name, String department, Subject[] subjects) {
    this.sid = sid;
    this.name = name;
    this.department = department;
    this.subjects = subjects;
  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Subject[] getSubjects() {
    return subjects;
  }

  public String toString(){
    String result=
        "Student Name: " + name +
            "\nStudent ID: " + sid +
            "\nDepartment: " + department +
            "\nSubjects:\n";
        for(Subject s: subjects){
        result+=s+ "\n";
       
  }
  return result;
}
}

class Subject{
  private String sub_id;
  private String sub_name;
  private float maxMarks;
  private float marksObtained;

  public Subject(String sub_id,String sub_name,float maxMarks,float marksObtained){
    this.sub_id=sub_id;
    this.sub_name=sub_name;
    this.maxMarks=maxMarks;
    this.marksObtained=marksObtained;
  }

  public String getSubID(){
    return sub_id;
  }

  public String getSubName(){
    return sub_name;
  }

  public float getMaxMarks(){
    return maxMarks;
  }

  public float getMarksObtained(){
    return marksObtained;
  }

  public void setSubID(String subId){
    sub_id= subId;
  }

  public void setSubName(String subName){
     sub_name=subName;
  }

  public void setMaxMarks(float maxMark){
     maxMarks=maxMark;
  }
  
  public void setMarksObtained(float maxObtain){
     marksObtained=maxObtain;
  }

  public boolean isQualified(){
    return marksObtained>= maxMarks/10*4;
  }
 
  public String toString(){
    return "\nSubjectID : "+sub_id + "\nSubject Name: "+sub_name;
  }
}


public class Student{
  public static void main(String args[]){
    Subject s[]=new Subject[3];
      s[0]=new Subject("TCS491","DATA STRUCTURE WITH C",100,40);
      s[1]=new Subject("TCS492","JAVA PROGRAMMING",100,30);
      s[2]=new Subject("TCS493","OPERATING SYSTEM",100,90);
    for(Subject st: s){
      System.out.println(st);
    }
    Students student = new Students("129873", "Mohit", "CSE", s);
    System.out.println(student);
    }
}

