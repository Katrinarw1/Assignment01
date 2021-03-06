
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author watsk8668
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city for the robot to live in 
        City kw = new City();
        
        new Wall(kw, 1,2, Direction.NORTH);
        new Wall(kw, 1,1, Direction.NORTH);
        new Wall(kw, 1,1, Direction.WEST);
        new Wall(kw, 2,1, Direction.WEST);
        new Wall(kw, 2,1, Direction.SOUTH);
        new Wall(kw, 2,2, Direction.SOUTH);
        new Wall(kw, 1,2, Direction.EAST);
        new Wall(kw, 2,2, Direction.EAST);
                
        //make a robot 
        Robot karel = new Robot(kw, 0,2, Direction.WEST);
        
        //move the robot counter-clockwise
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
    }
}
