package pl.agh.edu.dp.labirynth;

public class Player {
    private Vector2D position;
    private Direction direction;

    public Player(Vector2D position){
        this.position = position;
        this.direction = Direction.North;
    }

    void Move(MoveDirection moveDirection){
        switch (moveDirection){
            case FORWARD:
                switch (this.direction){
                    case North:
                        this.position = new Vector2D(this.position.getX(),this.position.getY()+1);
                    case South:
                        this.position = new Vector2D(this.position.getX(),this.position.getY()-1);
                    case East:
                        this.position = new Vector2D(this.position.getX()+1,this.position.getY());
                    case West:
                        this.position = new Vector2D(this.position.getX()-1,this.position.getY());
                }
            case LEFT:
                this.direction = this.direction.previous();
            case RIGHT:
                this.direction = this.direction.next();
            case BACKWARD:
                this.direction = this.direction.opposite();
        }
    }
}
