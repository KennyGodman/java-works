package Chapter7;

import com.Godman.Godman.Arrays.Turtle.SketchPad;

import static Chapter7.Direction.*;

public class Turtles {

        private Direction currentDirection = EAST;
        private TurtlePosition currentPosition = new TurtlePosition(0,0);

        private boolean isPenUp;
        public void penUp() {
            isPenUp = true;
        }

        public boolean isPenUp() {
            return isPenUp;
        }

        public void penDown() {
            isPenUp = false;
        }

        public Direction getCurrentDirection() {
            return currentDirection;
        }

        public void turnRight() {
            if(currentDirection == EAST) face(SOUTH);
            else if(currentDirection == SOUTH) face(WEST);
            else if(currentDirection == WEST) face(NORTH);
            else if(currentDirection == NORTH) face(EAST);
        }

        private void face(Direction newDirection) {
            currentDirection = newDirection;
        }

        public void turnLeft() {
            if(currentDirection == EAST) face(NORTH);
            else if(currentDirection == NORTH) face(WEST);
            else if(currentDirection == WEST) face(SOUTH);
            else if(currentDirection == SOUTH) face(EAST);
        }

        public TurtlePosition getCurrentPosition() {
            return currentPosition;
        }

        private void move(int numberOfSteps) {
            if(currentDirection == EAST){
                currentPosition.setColumn(currentPosition.getColumn() + numberOfSteps);
            }
        }

    public void move(int noOfSteps, SketchPad sketchPad) {
            noOfSteps = noOfSteps -1;
            if(!isPenUp == true) writeOn(sketchPad, noOfSteps);
            move(noOfSteps);
    }

    private void writeOn(SketchPad sketchPad, int noOfSteps) {
            var floor  = sketchPad.getFloor();
            int currentRow = currentPosition.getRow();
            int currentColumn = currentPosition.getColumn();
            if (currentDirection == EAST){
                for (int i = 0; i <= noOfSteps; i++) {
                    floor[currentRow][currentColumn++] =1;

                }
               // floor[currentRow][currentColumn] =1;
                //floor[currentRow][currentColumn] =1;
                //floor[currentRow][currentColumn] =1;

            }

    }
}
