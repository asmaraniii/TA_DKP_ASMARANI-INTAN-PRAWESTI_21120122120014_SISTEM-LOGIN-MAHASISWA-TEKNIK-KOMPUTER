public class  User {
    public String[][] data;
    public String fName[][];
    public String matkul[];

    public User(){
        this.data = new String[][]{
                {"Intan","222"},
                {"Kayana","333"},
                {"Dewi","444"},
                {"Salsa","555"},
                {"Arifka","666"},
                {"David","777"},
                {"Sisil","888"},
                {"Ezar","999"}
        };
        this.fName = new String[][]{
                {"Asmarani Intan Prawesti","21120122120014"},
                {"Kayana Garwita Utama","21120122120016"},
                {"Dewi Sinta","21120122130046"},
                {"Salsabila Alya Rizquna","21120122130087"},
                {"Arifka Maulana","2112012213143"},
                {"David Kuncoro","21120122140023"},
                {"Sylva Farah","21120122140056"},
                {"Rafael Ezar","21120121130001"}
        };
        this.matkul = new String[]{
          "Kimia","Sistem Tertanam  ","Elektronika Dasar","Matematika Teknik","Aljabar Linier",
                "Algoritma Pemrograman","Fisika Dasar","Praktikum DKP","Praktikum Fisika Dasar 1"
        };
    }
}
