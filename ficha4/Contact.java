class Contact {
    private String name, profession, email;
    private long age, phoneNumber;
    
    public Contact (String name, String profession, String email, long age, long phoneNumber){
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public long getAge(){
        return age;
    }
    public String toString(){
        String formatedContact = "";
        formatedContact = String.join(" ", name, ",", Long.toString(age), "anos de idade,", profession, ",", "telefone nº", Long.toString(phoneNumber), "email:",email);
        return formatedContact;
    }
}
