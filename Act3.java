import java.util.HashSet;

public class Act3 {

    static void firewall() {

        HashSet<String> ips = new HashSet<>();

        // IPs bloqueadas
        ips.add("1.1.1.1");
        ips.add("10.11.12.13");
        ips.add("2.3.4.5");

        String ip = "1.1.1.1";

        System.out.println("Revisando la IP: " + ip);

        if (ips.contains(ip)) {
            System.out.println("IP bloqueada");
        } else {
            System.out.println("IP permitida");
        }

        ips.add("8.8.8.8");
        ips.remove("10.0.0.5");
    }

    public static void main(String[] args) {
        firewall();
    }
}