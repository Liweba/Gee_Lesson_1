package marathon.Start;

import marathon.Competitor.Competitor;
import marathon.Competitor.Human;
import marathon.Competitor.Cat;
import marathon.Competitor.Dog;

public class Team {

    Competitor[] competitors;

    public Team(Human human, Cat cat, Dog dog, Cat cat1) {
        this.competitors = new Competitor[]{human, cat, dog, cat1};
    }

    public void showResults(){
        for (Competitor c : this.competitors) {
            c.info();
        }
    };
}
