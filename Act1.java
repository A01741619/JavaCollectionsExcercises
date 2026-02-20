import java.util.LinkedList;

public class Act1 {

    static void method1() {
        LinkedList<String> Passangers = new LinkedList<String>();

        // Register passangers as they board
        String[] people = {"Juan", "Pedro", "Pancho", "Alfredo"};
        for(int i = 0; i < people.length; i++){
            Passangers.add(people[i]);
        }

        // Print entire list
        System.out.println(Passangers);
        
        // Add late passanger to n index
        String latePassanger = "Alfonso";
        int n = 1;

        if(n < Passangers.size() - 1) {
            Passangers.add(n, latePassanger);
        }

        // Print updates passanger list
        System.out.println(Passangers);
    }

    public static void main(String[] args) {
        method1();
    }
}
