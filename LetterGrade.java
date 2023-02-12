package classtime;

public class LetterGrade {
	private String name;
	private double total;
	private int count;
	
	public LetterGrade(String name ) {
		this.name=name;
		total=0;
		count=0;
	}
	
	public String getName(){ //
		return name;
		
	}
		
	public void AddGrade (String grade) {
		
		switch (grade) { //converts letter grade to GPA and adds them
			
		case "A":
			total+=4;
			break;
			
		case "A-":
			total+=3.7;
			break;
			
		case "B":
				total+=3;
			break;
			
		case "B+":
				total+=3.3;
			break;
			
		case "B-":
				total+=2.7;
			break;
			
		case "C":
				total+=2;
			break;
			
		case "C+":
				total+=2.3;
			break;
			
		case"C-":
				total+=1.7;
			break;
			
		case "D":
				total+=1;
			break;
			
		case "D+":
				total+=1.3;
			break;
			
		case "F":
				total+=0;
			break;
		default:
			System.out.println("Incorrect entry, Try again");
			count--; //decrements the incorrect input from count
		
		}
	
		count++;
	}
	
	public double getTotalGrade() { 
		return total; //return the total grade 
	}
	
	public double getGPA() {
		
		if (count!=0) {
			return  total/count; //if total was an integer you would cast is as a double like : (double) total/count
			
		}
		else {
			System.out.println("Cannot calculate score");
			return 0;
			
		}
	}
	
	
	

}
