package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Match {
	List<Score>clientsList =  new ArrayList<Score>();
	
	
	public void addObserver(Score someNewClient) {
		clientsList.add(someNewClient);
	}
	
	public void removeObserver(int index) {
		clientsList.remove(index);
	}
	
	public void updateScore(String someNewScore) {
		 for (Score score : clientsList) {
			score.getScore(someNewScore);
		}
	}
}
