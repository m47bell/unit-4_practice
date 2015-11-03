 class Sort {


 	private static void sort(int [] numList){
 	 	int [] newList;

 		for(int i = 0; i < numList.size; i++){
 			if(numList[i] < numList[i + 1] ){
 				newList.add(numList[i]);
 			}
 		}
 		System.out.println(newList);
 	}

 	public static void main(String [] args){

 		int [] num = { 2, 5, 3, 7, 1, 4 };
 		sort(num);
	 }
 }