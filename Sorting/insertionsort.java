class InsertionSort {

 	private static void insertSort(int [] numList){
 	 	int [] newList;
 	 	boolean isLess;


 		for(int i = 1; i < numList.length; i++){
 			if(compareInt(numList[i], numList [i+1]) < 0){
 				swap(numList.get(i+1), numList.get(i));
 			} 
 			else if (compareInt(numList[i], numList[i+1] > 0)){
 				swap(numList.get(i), numList.get(i+1));
 			}
 		}
 		System.out.println(newList);
 	}





 	private static int compareInt(int a, int b){
 		return a.compareTo(b);
 	}

 	private void swap(int num1, int num2){
 		int temp = num1;
 		num1 = num2;
 		num2 = temp;
 	}

 	public static void main(String [] args){

 		int [] num = { 2, 5, 3, 7, 1, 4 };
 		insertSort(num);
 }

 }