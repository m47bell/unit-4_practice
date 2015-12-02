public class HW{


public int incompleteHW(Map <String, List<Integer>> grades){

	int count=0;

	for(String name: grades.keySet()){
		 for (int grade: grades.get(name)){

		 	if(grade == 0)
		 		count += 1;
		 }
	}
	return count;
}


public static void main(String [] args){
		Map <String, List<Integer>> grades = new Map <String, List<Integer>> ();

		incompleteHW(grades);

}

}