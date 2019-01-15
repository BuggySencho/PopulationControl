public class PopulationControl {

    public static void main(String[] args) {

        Eye_collor eyeCollor = new Eye_collor();
        Country_list countryList = new Country_list();

        Default Naruto = new Default();
        Naruto.setName("Naruto Uzumaki");
        Naruto.setAge(17, "");
        Naruto.setJutsu("Rasengan and Shadow clone jutsu");
        Naruto.setClan("Uzumaki clan");
        Naruto.setEye_collor("Blue");
        Naruto.setLength( 180, "");
        Naruto.setShinobi_number(105937263);
        Naruto.setCountry("Land of fire");
        Naruto.character();

        boolean foundCountry = false;
        for (int i = 0; i < countryList.LIST.length; i++){
            if(Naruto.getCountry() == countryList.LIST[i] ){
                //System.out.println("This country is in the list");
                foundCountry = true;
            }else{
                //System.out.println("No country found");
            }
        }
        if(foundCountry == true){
            System.out.println("This country is in the list");
        }
        boolean foundEyeCollor = false;
        for (int i = 0; i < eyeCollor.LIST.length; i++){
            if(Naruto.getEye_collor() == eyeCollor.LIST[i] ){
                foundEyeCollor = true;
                //System.out.println("This is an existing collor");
            }else{
                //System.out.println("No country found");
            }
        }
        if(foundEyeCollor == true) {
            System.out.println("This is an existing color");
        }

        Default Sasuke = new Default();
        Sasuke.setName("Sasuke Uchiha");
        Sasuke.setAge(17, "");
        Sasuke.setJutsu("Chidori and Amaterasu");
        Sasuke.setClan("Uchiha clan");
        Sasuke.setEye_collor("Black");
        Sasuke.setLength(186, "");
        Sasuke.setShinobi_number(893517403);
        Sasuke.setCountry("Land of fire");
        Sasuke.character();

        boolean Country = false;
        for (int i = 0; i < countryList.LIST.length; i++){
            if(Sasuke.getCountry() == countryList.LIST[i] ){
                //System.out.println("This country is in the list");
                foundCountry = true;
            }else{
                //System.out.println("No country found");
            }
        }
        if(foundCountry == true) {
            System.out.println("This country is in the list");
        }
        boolean EyeCollor = false;
        for (int i = 0; i < eyeCollor.LIST.length; i++){
            if(Sasuke.getEye_collor() == eyeCollor.LIST[i] ){
                EyeCollor = true;
                //System.out.println("This is an existing color");
            }else{
                //System.out.println("This is not an existing color");
            }
        }
        if(EyeCollor == true) {
            System.out.println("This is an existing color");
        }

        Default Gaara = new Default();
        Gaara.setName("Gaara Kazekage");
        Gaara.setAge(16, "");
        Gaara.setJutsu("Prison sand burial and Sand binding coffin");
        Gaara.setClan("Kazekage clan");
        Gaara.setEye_collor("Light blue");
        Gaara.setLength(166, "");
        Gaara.setShinobi_number(935018734);
        Gaara.setCountry("Land of wind");
        Gaara.character();

        boolean Country1 = false;
        for (int i = 0; i < countryList.LIST.length; i++){
            if(Gaara.getCountry() == countryList.LIST[i] ){
                //System.out.println("This country is in the list");
                Country1 = true;
            }else{
                //System.out.println("No country found");
            }
        }
        if(Country1 == true){
            System.out.println("This country is in the list");
        }
        boolean EyeCollor1 = false;
        for (int i = 0; i < eyeCollor.LIST.length; i++){
            if(Gaara.getEye_collor() == eyeCollor.LIST[i] ){
                EyeCollor1 = true;
                //System.out.println("This is an existing color");
            }else{
                //System.out.println("This is not an existing color");
            }
        }
        if(EyeCollor1 == true) {
            System.out.println("This is an existing color");
        }


        Default Madara = new Default();
        Madara.setName("Madara Uchiha");
        Madara.setAge(48, "");
        Madara.setJutsu("Susanoo and Tengai Shinsei(Heavenly Obstacle Quaking Star)");
        Madara.setClan("Uchiha clan");
        Madara.setEye_collor("Black");
        Madara.setLength(179, "");
        Madara.setShinobi_number(832591346);
        Madara.setCountry("Land of fire");
        Madara.character();

        boolean Country2 = false;
        for (int i = 0; i < countryList.LIST.length; i++){
            if(Madara.getCountry() == countryList.LIST[i] ){
                //System.out.println("This country is in the list");
                Country2 = true;
            }else{
                //System.out.println("No country found");
            }
        }
        if(Country2 == true){
            System.out.println("This country is in the list");
        }
        boolean EyeCollor2 = false;
        for (int i = 0; i < eyeCollor.LIST.length; i++){
            if(Madara.getEye_collor() == eyeCollor.LIST[i] ){
                EyeCollor2 = true;
                //System.out.println("This is an existing color");
            }else{
                //System.out.println("This is not an existing color");
            }
        }
        if(EyeCollor2 == true) {
            System.out.println("This is an existing color");
        }


        Default Jiraiya = new Default();
        Jiraiya.setName("Jiraiya Ogata");
        Jiraiya.setAge(54, "");
        Jiraiya.setJutsu("Rasengan and Sage mode");
        Jiraiya.setClan("Ogata clan");
        Jiraiya.setEye_collor("Black");
        Jiraiya.setLength(191, "");
        Jiraiya.setShinobi_number(158924193);
        Jiraiya.setCountry("Land of fire");
        Jiraiya.character();

        boolean Country3 = false;
        for (int i = 0; i < countryList.LIST.length; i++){
            if(Jiraiya.getCountry() == countryList.LIST[i] ){
                //System.out.println("This country is in the list");
                Country3 = true;
            }else{
                //System.out.println("No country found");
            }
        }
        if(Country3 == true){
            System.out.println("This country is in the list");
        }
        boolean EyeCollor3 = false;
        for (int i = 0; i < eyeCollor.LIST.length; i++){
            if(Jiraiya.getEye_collor() == eyeCollor.LIST[i] ){
                EyeCollor3 = true;
                //System.out.println("This is an existing color");
            }else{
                //System.out.println("This is not an existing color");
            }
        }
        if(EyeCollor3 == true) {
            System.out.println("This is an existing color");
        }

    }
}
