package pl.agh.edu.dp.labirynth;

    public class BombedMazeFactory extends MazeFactory{

        private static BombedMazeFactory instance;

        public static BombedMazeFactory getInstance(){
            if( instance == null) instance = new BombedMazeFactory();
            return instance;
        }

        @Override
        public Door createDoor(Room r1, Room r2) {
            return new BombedDoor(r1, r2);
        }

        @Override
        public Room createRoom(Vector2D pos) {
            return new BombedRoom(pos);
        }

        @Override
        public Wall createWall() {
            return new BombedWall();
        }
    }
