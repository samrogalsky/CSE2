//Samuel Rogalsky
//September 7, 2014
//CSE 02
//HW 02
//Arithmetic Java Program

public class Arithmetic {
    public static void main (String[] args){
        int nSocks=3;//number of socks
        double sockCost$=2.58;//cost per pair of socks
        int nGlasses=6;//number of glasses
        double glassCost$=2.29;//cost per glass
        int nEnvelopes=1;//number of boxes of envelopes
        double envelopeCost$=3.25;//cost per box of envelopes
        double taxPercent=0.06;//sales tax percentage
        double totalSockCost$, totalGlassesCost$, totalEnvelopesCost$, taxSocks$, taxGlasses$, taxBoxesOfEnvelopes$, totalCost$, totalTax$, totalTaxCost$;//assignes variables for each of the values and makes them accept decimals 

        totalSockCost$=nSocks*sockCost$;//calculates the total cost of the socks
        totalGlassesCost$=nGlasses*glassCost$;//calculates the total cost of the glasses
        totalEnvelopesCost$=nEnvelopes*envelopeCost$;//calculates the total cost of the box of envelopes
        taxSocks$=totalSockCost$*taxPercent;//calculates the sales tax on the socks
        taxGlasses$=totalGlassesCost$*taxPercent;//calculates the sales tax on the glasses
        taxBoxesOfEnvelopes$=totalEnvelopesCost$*taxPercent;//calculates the sales tax on the box of envelopes
        totalCost$=totalSockCost$+totalGlassesCost$+totalEnvelopesCost$;//calculates the total cost without sales tax
        totalTax$=totalCost$*taxPercent;//calculates the total sales tax
        totalTaxCost$=totalTax$+totalCost$;//calculates the total amount paid for the transaction
        
        System.out.println("The socks cost $"+totalSockCost$);
        System.out.println("The glasses cost $"+totalGlassesCost$);
        System.out.println("The envelopes cost $"+totalEnvelopesCost$);
        System.out.println("The sales tax on the socks is $"+(int)(taxSocks$*100)/100.0);
        System.out.println("The sales tax on the glasses is $"+(int)(taxGlasses$*100)/100.0);
        System.out.println("The sales tax on the box of envelopes is $"+(int)(taxBoxesOfEnvelopes$*100)/100.0);
        System.out.println("The total cost of the items without sales tax is $"+totalCost$);
        System.out.println("The total amount to be paid for the transaction including sales tax is $"+(int)(totalTaxCost$*100)/100.0);//prints out output data
    }
} 