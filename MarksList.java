package uno.career;
import java.util.ArrayList;

class Student1{
	 int id;
		String name;
		String collegeName;
		float fee;
		int maths;
		int sco;
		int sci;

		
public Student1(int id, String name, String collegeName, float fee, int maths, int sco, int sci) {
			super();
			this.id = id;
			this.name = name;
			this.collegeName = collegeName;
			this.fee = fee;
			this.maths = maths;
			this.sco = sco;
			this.sci = sci;
		}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCollegeName() {
	return collegeName;
}


public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}


public float getFee() {
	return fee;
}


public void setFee(float fee) {
	this.fee = fee;
}


public int getMaths() {
	return maths;
}


public void setMaths(int maths) {
	this.maths = maths;
}


public int getSco() {
	return sco;
}


public void setSco(int sco) {
	this.sco = sco;
}


public int getSci() {
	return sci;
}


public void setSci(int sci) {
	this.sci = sci;
    }
 }

public class MarksList {

	public static void main(String[] args) {
		


		Student1 s1 = new Student1(100,"ugendar","MGU",4000,50,75,60);	
		Student1 s2 = new Student1(200,"rajesh","MGU",3500,34,78,65);	
		Student1 s3 = new Student1(300,"sai teja","MGU",2500,19,91,75);	
		Student1 s4 = new Student1(400,"siddu","MGU",5500,20,70,60);	
		Student1 s5 = new Student1(500,"nani","MGU",5000,45,55,58);
		Student1 s6 = new Student1(600,"teja","MGU",60000,55,78,87);
		ArrayList<Student1> stuList = new ArrayList<Student1>();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		stuList.add(s4);
		stuList.add(s5);
	
		
		
		ArrayList<Student1> failList = new ArrayList<Student1>();
		ArrayList<Student1> passList = new ArrayList<Student1>();
		Student1
		eachStu = null;
			
			for(int i=0;i<stuList.size();i++) {
				eachStu = stuList.get(i);

					if ( (eachStu.getMaths() > 50) &&(eachStu.getSci() > 50) &&(eachStu.getSco() > 50) ) {
						passList.add(eachStu);
					}
					else {
						failList.add(eachStu);
					}

			}// for
			
		
			System.out.println("Pass Student List--->");
			System.out.print("\nName\tcollegeName\tMaths\tScience\tSocial");
			for(int i=0;i<passList.size();i++) {
				eachStu = passList.get(i);
				System.out.print("\n"+eachStu.getName()+"\t"+eachStu.getCollegeName()+"\t\t"+
				eachStu.getMaths()+"\t"+eachStu.getSci()+
						"\t"+eachStu.getSco());
					
			}
			System.out.println("\nFailed Student List--->");
			System.out.print("\nName\tcollegeName\tMaths\tScience\tSocial");
			for(int i=0;i<failList.size();i++) {
				eachStu = failList.get(i);
				System.out.print("\n"+eachStu.getName()+"\t"+eachStu.getCollegeName()+"\t\t"+
				eachStu.getMaths()+"\t"+eachStu.getSci()+
						"\t"+eachStu.getSco());

			}
			ArrayList<Student1> failMathsList=new ArrayList<Student1>();
			
			for(int i=0;i<stuList.size();i++) {
					eachStu = stuList.get(i);
					if ( (eachStu.getMaths() < 50)&&(eachStu.getSci() > 50) &&(eachStu.getSco() > 50)) 
						failMathsList.add(eachStu);
					}	
					System.out.println("\nStudents failed in maths");
					System.out.print("\nName\tcollegeName\tMaths\tScience\tSocial");
					
					for(int i=0;i<failMathsList.size();i++) {
						eachStu = failMathsList.get(i);
						System.out.print("\n"+eachStu.getName()+"\t"+eachStu.getCollegeName()+"\t\t"+
								eachStu.getMaths()+"\t"+eachStu.getSci()+
										"\t"+eachStu.getSco());
					}
			}
					
			
	}


