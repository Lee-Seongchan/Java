package test7;


interface Player{
	
	public abstract void play();

}

class BaseBallPlayer implements Player{

	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
	
}



class FootBallPlayer implements Player{

	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
	
}

public class Test07 {

	public static void main(String[] args) {
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();

		PlayGame(p1);
		PlayGame(p2);
	}
	
	public static void PlayGame(Player p) {
		p.play();
	}
	
}



