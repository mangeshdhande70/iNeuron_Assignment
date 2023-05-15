package in.ineuron.service;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	
   public List<Integer> sortedList(List<Integer> list){  
	  return list.stream().sorted().toList();
   }
   
   
   public List<Integer> filterListByEvenNumber(List<Integer> list){  
		  return list.stream().filter(n -> n%2==0).collect(Collectors.toList());
	   }
	

}
