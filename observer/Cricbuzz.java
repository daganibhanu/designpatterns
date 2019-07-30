package designpatterns.observer;

public class Cricbuzz implements Score{

	@Override
	public void getScore(String updatedScore) {
		// TODO Auto-generated method stub
		System.out.println("Updated score from cricbuzz"+updatedScore);
	}

}
