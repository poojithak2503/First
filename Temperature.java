public class Temperature {
    static int cell=25;
    public static void fahrenheit(int celsius){
        int f = ((celsius*9)/5) + 32;
        System.out.println("The temperature in fahrenheit is:" + f);
    }

    public void kelvin(int celsius){
        double k = celsius + 273.5;
        System.out.println("The temperature in kelvin is:" + k);
    }
    public static int celsius(){
            return cell;
    }

    public static void main(String[] args) {
        fahrenheit(30);


        Temperature temp=new Temperature(); // creating the object for the class
        temp.kelvin(35);

        celsius();
    }
}
