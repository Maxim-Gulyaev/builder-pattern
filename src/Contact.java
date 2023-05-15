public class Contact {

    private final String name;

    private final String surName;

    private final String mail;

    private final String phone;

    private final String address;

    Contact(ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surName = contactBuilder.getSurName();
        this.mail = contactBuilder.getMail();
        this.phone = contactBuilder.getPhone();
        this.address = contactBuilder.getAddress();
    }
}
