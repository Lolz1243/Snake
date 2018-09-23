public class Food {

private Snake snake = new Snake();
private int foodX; // Stores X pos of our food
private int foodY; // Stores Y pos of our food
private int score;
// Used to determine random position of food
private final int RANDOMPOSITION = 40;

public void createFood() {

	score += 5;
    // Set our food's x & y position to a random position

    int location = (int) (Math.random() * RANDOMPOSITION);
    foodX = ((location * Board.getDotSize()));

    location = (int) (Math.random() * RANDOMPOSITION);
    foodY = ((location * Board.getDotSize()));

    if ((foodX == snake.getSnakeX(0)) && (foodY == snake.getSnakeY(0))) {
        createFood();
    }
}

public void setScore(int score){
	
	this.score = score;
	
}
public int getScore(){
	
	return score;
	
}
public int getFoodX() {

    return foodX;
}

public int getFoodY() {
    return foodY;
}
}