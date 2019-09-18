package marathon.Start;


import marathon.Competitor.Competitor;
import marathon.Obstacle.Cross;
import marathon.Obstacle.Obstacle;
import marathon.Obstacle.Wall;

public class Course {

    private Obstacle[] course;

    public Course(Cross cross, Wall wall, Wall wall1, Cross cross1) {
        this.course = new Obstacle[]{cross, wall, wall1, cross1};
    }

    public void doIt(Team team){
        for (Competitor c : team.competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    };
}
