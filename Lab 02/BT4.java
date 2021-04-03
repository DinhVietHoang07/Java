import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        int Shirts, Trousers, Discount, Net_Total, Points_Earned;
        int QuantityS, QuantityT;
        int TotalS, TotalT, TotalG, Total;
        int PriceS = 300, PriceT = 700;

        System.out.println("Enter the number of Shirts to order: \n");
        Scanner scan = new Scanner(System.in);
        QuantityS = scan.nextInt();
        TotalS = QuantityS * PriceS;
        System.out.println("Enter the number of Trousers to order");
        QuantityT = scan.nextInt();
        TotalT = QuantityT * PriceT;
        Total = TotalS + TotalT;
        System.out.println("Item        Quantity        Price       Total");
        System.out.println("-----------------------------------------------------");
        System.out.printf("Shirts           %d             %d          %d\n", QuantityS, PriceS,TotalS);
        System.out.printf("Trousers         %d             %d          %d\n", QuantityT, PriceT, TotalT);

        if (Total >= 3000) {
            TotalG = Total / 10;
            System.out.printf("Discount                                    %d.00\n", TotalG);
            System.out.println("------------------------------------------------------");
            Net_Total = Total - TotalG;
            System.out.printf("Net Total                                 %d.00\n",Net_Total    );
            Points_Earned = Net_Total /100;
            System.out.println("------------------------------------------------------");
            System.out.printf("Points Earned         %d\n", Points_Earned);
            System.out.println("Thank you!-!");
        }
        else {
            TotalG = Total / 15;
            System.out.printf("Discount                            %d.00");
        }
    }
}
