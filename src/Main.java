public class Main {
    public static void main(String[] args) {
        Contact contact = new ContactBuilder()
                .name("Ostin")
                .surName("Powers")
                .mail("ostinpuwers@gmail.com")
                .phone("911")
                .address("White House")
                .build();
    }
}