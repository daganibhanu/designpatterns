package designpatterns.observer;

public class CricInfo implements Score{

	@Override
	public void getScore(String updatedScore) {
		// TODO Auto-generated method stub
		System.out.println("Updated score from cricinfo"+updatedScore);
	}

}
