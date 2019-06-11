package 工厂模式;

/**
 * create by blackjack on 2019/6/11
 */
public class AnimalFactory {

      Animal getAnimal(String animal){
          if ("dog".equals(animal))
          return new Dog();
          else if ("cat".equals(animal))
              return new Cat();
          else
              return null;
      }
}
