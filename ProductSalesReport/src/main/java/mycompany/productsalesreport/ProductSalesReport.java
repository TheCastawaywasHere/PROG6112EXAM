package mycompany.productsalesreport;

import java.io.PrintStream;
import java.util.Arrays;

public class ProductSalesReport {

    public static void main(String[] args) {

        String[] Quarter1 = {"Enter number of sales for month 1 for Cozy Nights Monarch mattress: ","Enter number of sales for month 2 for Cozy Nights Monarch mattress: ", 
            "Enter number of sales for month 3 for Cozy Nights Monarch mattress: "};
        String[] Quarter2 = {"Enter number of sales for month 1 for Restonic Barbadoa mattress: ","Enter number of sales for month 2 for Restonic Barbadoa mattress: ", 
            "Enter number of sales for month 3 for Restonic Barbadoa mattress: "};
        String[] Quarter3 = {"Enter number of sales for month 1 for Sealy Phuket mattress: ","Enter number of sales for month 2 for Sealy Phuket mattress: ", 
            "Enter number of sales for month 3 for Sealy Phuket mattress: "};
        int[][] Report1 = {
            {25}, // Month 1
            {18}, // Month 2
            {20}, // Month 3
        };
        int[][] Report2 = {    
            {15}, // Month 1
            {10}, // Month 2
            {12}, // Month 3
        };
        int[][] Report3 = {    
            {18}, // Month 1
            {15}, // Month 2
            {20}  // Month 3
        };
       
        Product Sales = new Product();
                
        for (int row = 0; row < Report1.length; row++) {
            PrintStream printf = System.out.printf("%-10s", Quarter1[row]);
            for (int col = 0; col < Report1[row].length; col++) {
                System.out.printf("%12d", Report1[row][col]);
            }
            System.out.println();
            
            System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("-------------------------------");
        System.out.println("TOTAL PRODUCT SALES: ");
        System.out.printf("AVERAGE SALES: ");
        System.out.println("MOST POPULAR PRODUCT");
        System.out.println("-------------------------------");
        //%.0f%n
        }
    }
}
