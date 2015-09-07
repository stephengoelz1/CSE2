//Stephen Goelz
//HW 02 Arithmetic
// Program to calculate cost of a shopping trip

public class  Arithmetic {
    public static void main (String [] args) {
        
        //# of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //'$'is part of the variable name
        double sockCost$=2.58;
        
        //# of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //# of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double TotalSockCost, TotalGlassCost,TotalEnvelopeCost,TotalCostBeforeTax,TotalCostAfterTax,sockTax,glassTax,envelopeTax;
        TotalSockCost= nSocks*sockCost$;
        sockTax= nSocks*sockCost$*taxPercent;
        TotalGlassCost= nGlasses*glassCost$;
        glassTax= (nGlasses*glassCost$*taxPercent);
        TotalEnvelopeCost= nEnvelopes*envelopeCost$;
        envelopeTax= (nEnvelopes*envelopeCost$*taxPercent);
        TotalCostBeforeTax= (nSocks*sockCost$) + (nGlasses*glassCost$)+(nEnvelopes*envelopeCost$);
        TotalCostAfterTax= TotalCostBeforeTax + (TotalCostBeforeTax*taxPercent) ;
        System.out.println ("The  cost for socks, glasses and envelopes before taxes was; "+ "$" + TotalSockCost + ", " 
        + "$" + TotalGlassCost + " and " + "$" + TotalEnvelopeCost + " respectively.") ;
        System.out.println ("Tax paid on those items was " + "$" + sockTax + ", " + "$" + glassTax + " and " + "$" + envelopeTax + " in the same order.");
        System.out.println ("The total cost before tax was " +  "$" +TotalCostBeforeTax) ;
        System.out.println ("The Total cost after tax was " + "$" + TotalCostAfterTax) ;
    }
}

