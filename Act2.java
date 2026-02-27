import java.util.PriorityQueue;

public class Act2 {

    static void OrdenaminetoPacientes() {

        PriorityQueue<Integer> patients = new PriorityQueue<>();

        // 1 = crítico, 2 = urgente, 3 = no urgente
        patients.add(3);
        patients.add(1);
        patients.add(2);
        patients.add(1);

        System.out.println("Lista de pacientes a atender:");

        while (!patients.isEmpty()) {
            System.out.println(patients.poll());
        }
    }

    public static void main(String[] args) {
        OrdenaminetoPacientes();
    }
}