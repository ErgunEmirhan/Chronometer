package graphs;

import java.util.*;

public class Graph<T> {
	Map<T, Set<T>> graphMap;
	Set<T> visitedT = new HashSet<>();
	
	{
		graphMap = new HashMap<>();
	}
	
	public void addNode(T i){ graphMap.put(i, new HashSet<>()); }
	
	public void addEdge(T i1, T i2){ graphMap.get(i1).add(i2); graphMap.get(i2).add(i1); }
	
	public void removeEdge(T i1, T i2){ graphMap.get(i1).remove(i2); graphMap.get(i2).remove(i1);}
	
	public void removeNode(T i1){
		graphMap.remove(i1);
		graphMap.forEach((k1, v1) -> v1.remove(i1));
	}
	
	public Map<T, Set<T>> getGraphMap(){ return graphMap; }
	
	public void printGraphMap(){
		graphMap.forEach((k1, v1) -> System.out.print("key: " + k1 + "\nvalues: " + v1 + "\n"));
	}
	
	public List<T> depthFirstSearch(T fromT, T toT){
		List<T> finalPath = depthFirstSearchHelper(fromT, toT);
		visitedT.clear();
		return finalPath;
	}
	
	private List<T> depthFirstSearchHelper(T fromT, T toT){
		visitedT.add(fromT);
		if(fromT == toT) return new ArrayList<>(List.of(fromT));
		
		for (T t : graphMap.get(fromT)) {
			if (visitedT.contains(t)) continue;
			
			List<T> optPath = depthFirstSearchHelper(t, toT);
			if (!optPath.isEmpty()){
				optPath.addFirst(fromT);
				return optPath;
			}
		}
		return new ArrayList<>();
	}
	
	public List<T> breadthFirstSearch(T fromT, T toT){
		if (fromT == toT) return new ArrayList<>(List.of(fromT));
		
		List<T> finalPath = breadthFirstSearchHelper(new ArrayList<>(List.of(fromT)), toT);
		visitedT.clear();
		return finalPath;
	}
	
	private List<T> breadthFirstSearchHelper(List<T> fromT, T toT){
		for (T t: fromT){
			if (graphMap.get(t).contains(toT)){
				return new ArrayList<>(List.of(t, toT));
			}
			visitedT.add(t);
		}
		
		List<T> nextFromT = fromT.stream()
		                      .map(t -> graphMap.get(t).stream().toList()).reduce(new ArrayList<>(),
                                   (list1, list2) -> {list1.addAll(list2); return list1;});
		nextFromT.removeAll(visitedT);
		
		List<T> tail = breadthFirstSearchHelper(nextFromT, toT);
		if (tail.isEmpty()) return new ArrayList<>();
		
		for (T t: fromT){
			if(graphMap.get(t).contains(tail.getFirst())) {
				tail.addFirst(t);
				return tail;
			}
		}
		return null;
	}
}