import java.util.*;

class ManageContacts{
    private List <Contact> familyContacts, friendsContacts, professionalContacts;

    public ManageContacts(){
        familyContacts = new ArrayList<Contact>();
        friendsContacts = new ArrayList<Contact>();
        professionalContacts = new ArrayList<Contact>();
    }

    public void addContact(){
        String typeOfContact = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type of contact (family, friends, professional) ");
        typeOfContact = sc.next();
        while(!typeOfContact.equals("family") && !typeOfContact.equals("friends") && !typeOfContact.equals("professional")){
            System.out.println("Invalid type (family, friends, professional). Try again: ");
            typeOfContact = sc.next();
        }  
        String name = "", profession = "", email = "";
        long age = 0, phoneNumber = 0;
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Profession: ");
        profession = sc.next();
        System.out.println("Email: ");
        email = sc.next();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("phoneNumber: ");
        phoneNumber = sc.nextInt();
        //sc.close();
        switch (typeOfContact) {
            case "family":
                System.out.println("here");
                familyContacts.add(new Contact(name, profession, email, age, phoneNumber));
                break;
            case "friends":
                friendsContacts.add(new Contact(name, profession, email, age, phoneNumber));
                break;
            case "professional":
                professionalContacts.add(new Contact(name, profession, email, age, phoneNumber));
                break;
        }
    }
    public void eliminaContacto(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        searchContact(familyContacts, name);
        searchContact(friendsContacts, name);
        searchContact(professionalContacts, name);
    }
    
    /** 
     * @param list
     * @param wantedName
     */
    private void searchContact (List<Contact> list, String wantedName){
        String confirm = new String();
        Scanner sc =  new Scanner(System.in);
        for (Contact contact : list) {
            if (contact.getName().equals(wantedName)){
                System.out.println(contact);
                System.out.println("Are you sure you want to delete this contact?(Y/N)");
                confirm = sc.next();
                while (!confirm.equals("Y") && !confirm.equals("N")){
                    System.out.println("Invalid operation try again (Y/N)");
                    confirm = sc.next();
                }
                if (confirm.equals("Y")){
                    System.out.println("Elemento removido com sucesso");
                    list.remove(contact);
                }
                else{
                    System.out.println("Operação cancelada");
                }
            }
        }
    }
    public void printContactsFromAList(List<Contact> list){
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
    public String toString(){
        String allContacts = new String();
        for (Contact contact : familyContacts) {
            allContacts += contact.toString() + "\n";
        }
        for (Contact contact : friendsContacts) {
            allContacts += contact.toString() + "\n";
        }
        for (Contact contact : professionalContacts) {
            allContacts += contact.toString() + "\n";
        }
        olderContact(familyContacts).toString();
        yougenstContact(professionalContacts).toString();
        return allContacts;
    }
    public Contact olderContact(List<Contact> list){
        Contact older = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() > older.getAge()){
                older = list.get(i);
            }
        }
        //System.out.println(older);
        return older;
    }
    public Contact yougenstContact(List<Contact> list){
        Contact yougest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() < yougest.getAge()){
                yougest = list.get(i);
            }
        }
        //System.out.println(yougest);
        return yougest;
    }
    public List<Contact> profissionaisAmigos(){
        List<Contact> profissionaisAmigosContacts = new ArrayList<>();
        for (Contact contact : professionalContacts) {
            for (Contact contact2 : friendsContacts) {
                if (contact.equals(contact2)){
                    profissionaisAmigosContacts.add(contact);
                }
            }
        }
        return profissionaisAmigosContacts;
    }
    public List<Contact> ecalaoEtario(int min, int max){
        List<Contact> list = new ArrayList<>();
        for (Contact contact : professionalContacts) {
            if (contact.getAge() >= min && contact.getAge() <= max){
                list.add(contact);
            }
        }
        for (Contact contact : familyContacts) {
            if (contact.getAge() >= min && contact.getAge() <= max){
                list.add(contact);
            }
        }
        for (Contact contact : friendsContacts) {
            if (contact.getAge() >= min && contact.getAge() <= max){
                list.add(contact);
            }
        }
        return list;
    }
}