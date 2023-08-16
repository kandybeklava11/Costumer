import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Passport passport=new Passport(04.07,"Kyrgyzstan","Male");
        Passport passport2=new Passport(07.06,"Kyrgyzstan","Male");

        Product product=new Product("Smetana","good",80,100,06.23,"no");
        Product product2=new Product("Vodka","Strong",400,200,07.30,"yes");
        Product product3=new Product("Salo","Pig's",350,80,03.12,"is haram");
        Product product4=new Product("Kalbasa","vkusnaya",160,500,08.29,"no");

        Product[] products={product,product2};
        Product[] products2={product3,product4};

        Bank bank=new Bank("Zalkar",764365,2000000);
        Bank bank2=new Bank("Bekbolsun",96789785,10000000);

        Costumer costumer=new Costumer("Zalkar",passport,products,bank);
        Costumer costumer2=new Costumer("Bekbolsun",passport2,products2,bank2);

        Costumer[]costumers={costumer,costumer2};
        //System.out.println(Arrays.toString(costumers));
        System.out.println("1.Prosmotr Banka");
        System.out.println("2.Prosmotr produktov");
        System.out.println("3.Prosmotr pasporta");
        System.out.println("4.Prosmotr produktov pokupatelya ");
        System.out.println("5.Udalenie produktov");
        System.out.println("6.Add product");

        Scanner scanner=new Scanner(System.in);
        int vybor=scanner.nextInt();


        switch (vybor) {
            case 1:
                System.out.println("1.Prosmotr Banka");
                System.out.println("Zalkar" + bank);
                System.out.println("Beknazar" + bank2);
                break;
            case 2:
                System.out.println("2.Prosmotr produktov" + Arrays.toString(products));
                System.out.println(Arrays.toString(products2));
                break;
            case 3:
                System.out.println("3.Prosmotr pasporta");
                System.out.println("Zalkar" + passport);
                System.out.println("Beknazar" + passport2);
                break;
            case 4:
                System.out.println("4.Prosmotr produktov pokupatelya ");
                System.out.println("Zalkar" + Arrays.toString(products));
                System.out.println("Beknazar" + Arrays.toString(products2));

                break;
            case 5:
                System.out.println("5.Udalenie produktov");
                costumer.deleteProductByName("Zalkar", "Smetana");
                break;
            case 6:
                costumer.addProduct(product);

        }
    }
}