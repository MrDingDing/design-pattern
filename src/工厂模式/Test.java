package 工厂模式;

/**
 * create by blackjack on 2019/6/11
 */
public class Test {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat = animalFactory.getAnimal("cat");
        System.out.println(cat);
        }
}
