package MyProject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s = new Student();
       s.setId(101);
       s.setName("Bikash");
       s.setClassno(12);
       
       AdmissionService ad = new AdmissionService();
       ad.admit(s);
       
       Student s2=new Student();
       s2.setId(103);
       s2.setName("Arvind");
       s2.setClassno(100);
       
       AdmissionService ad1=new AdmissionService();
       ad1.admit(s2);
	}

}
