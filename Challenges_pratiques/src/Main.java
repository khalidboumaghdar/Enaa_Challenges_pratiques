//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog jacke = new Dog("test1","test2");
        Dog layka = new Dog("test2","test3");
        System.out.println("Jake- Name: " + jacke.getName() + ", Race: " + jacke.getRace());
        System.out.println("Layka - Name: " + layka.getName() + ", Race: " + layka.getRace());

        jacke.setName("test3");
        jacke.setRace("test4");
        layka.setName("test5");
        layka.setRace("test6");
        System.out.println("Jake- Name: " + jacke.getName() + ", Race: " + jacke.getRace());
        System.out.println("Layka - Name: " + layka.getName() + ", Race: " + layka.getRace()); 
    }
}
