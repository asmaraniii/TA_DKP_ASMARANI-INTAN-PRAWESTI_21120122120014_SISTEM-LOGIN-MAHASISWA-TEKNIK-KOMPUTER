public class siswa {
    public static void main(String[] args) {
        mobil a = new mobil();
        a.setName("Ratna");
        System.out.println(a.getName());



        for (int i = 2; i < 100 ; i++) {
            boolean isPrime = true;
            for (int j = 0; j < i ; j++) {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(i+", ");
            }
        }

    }
}
class mobil{
    private int forward, backward;
    public String name;

    public void setName(String nama){
         this.name = nama;
    }
    public String getName(){
        return this.name;
    }

}
