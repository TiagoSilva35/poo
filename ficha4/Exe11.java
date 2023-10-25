public class Exe11 {
    public static void main(String[] args) {
        ManageContacts contact_manager = new ManageContacts();
        contact_manager.addContact(); 
        contact_manager.addContact(); 
        contact_manager.addContact(); 
        contact_manager.addContact();
        contact_manager.addContact(); 
        contact_manager.addContact();
        System.out.println("Elementos adicionados!");
        System.out.println("Elimina 1");
        contact_manager.eliminaContacto();
        System.out.println(contact_manager);
        contact_manager.printContactsFromAList(contact_manager.profissionaisAmigos());
        contact_manager.printContactsFromAList(contact_manager.ecalaoEtario(0, 18));
        

    }
}
