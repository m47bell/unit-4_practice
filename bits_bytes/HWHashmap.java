class Duplicates{

public static void main (String [] args){

	int [] numList = {1,5,7.5,2,1}


	Hashmap <Integer, Integer> numMap = new Hashmap <Integer, Integer> ();

	for (int x: numList){

		if(numMap.contains(x)){
			numMap.put(x,numMap.get(x)+1);

		}else{
			numMap.put(x,1);
		}

		System.out.println(numMap.values());
	}



}