public class Default {

    private String name = "Default";
    private int age = 0;
    private String jutsu = "Default";
    private String clan = "Default";
    private String eye_collor = "Default";
    private String country = "Default";
    private int length = 0;
    private int shinobi_number = 0;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age, String type)
    {

        if(age < 100 && age > 0){
            this.age = age;
        }
        else{
            System.out.println("This age is not posible");
        }

    }

    public void setJutsu(String jutsu) {this.jutsu = jutsu;}

    public void setClan(String clan) {this.clan = clan;}

    public void setEye_collor(String eye_collor) {this.eye_collor = eye_collor;}

    public void setCountry(String country) {this.country = country;}

    public void setLength(int lenght, String type) {

        if(lenght < 210 && lenght > 110){
            this.length = lenght;
        }
        else{
            System.out.println("This length is not posible");
        }

    }
    public void setShinobi_number(int shinobi_number) {this.shinobi_number = shinobi_number;}


    public String getName(){
        return name;
    }

    public int getAge() {return age;}

    public String getJutsu() {return jutsu;}

    public String getClan() {return clan;}

    public String getEye_collor() {return eye_collor;}

    public String getCountry() {return country;}

    public int getLength() {return length;}

    public int getShinobi_number() {return shinobi_number;}

    public void character() {
        System.out.println
                ("Naam: " + getName());

        System.out.println
                ("Leeftijd: " + getAge());

        System.out.println
                ("Meest gebruikte jutsu: " + getJutsu());

        System.out.println
                ("Clan: " + getClan());

        System.out.println
                ("Eye color: " + getEye_collor());

        System.out.println
                ("Country: " + getCountry());

        System.out.println
                ("lenght: " + getLength() + " cm");

        System.out.println
                ("Shinobi number: " + getShinobi_number());

        System.out.println
                (" ");
    }
}