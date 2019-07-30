package designpatterns.observer;

public class TestObserver {

	public static void main(String[] args) {

		Match match = new Match();
		Cricbuzz cricbuzz = new Cricbuzz();
		CricInfo cricInfo = new CricInfo();
		
		match.addObserver(cricbuzz);
		match.addObserver(cricInfo);
		
		
		match.updateScore("new score is 456");
		
	}

}
