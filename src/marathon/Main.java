package marathon;

import marathon.Competitor.Cat;
import marathon.Competitor.Dog;
import marathon.Competitor.Human;
import marathon.Obstacle.Cross;
import marathon.Obstacle.Wall;
import marathon.Start.Course;
import marathon.Start.Team;

public class Main {

    public static void main(String[] args) {
        /** 3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу; */
        Course c = new Course(new Cross(80), new Wall(2), new Wall(1), new Cross(120)); // Создаем полосу препятствий
        /** 2. Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ),метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.*/
        Team team = new Team(new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Cat("Джек")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults();// Показываем результаты
    }

}
