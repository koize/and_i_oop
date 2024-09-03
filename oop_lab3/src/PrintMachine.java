public class PrintMachine {
    public static int totalNoOfCopy;

    public String[] copy (String strText, int intNos){
        String[] strCopy = new String[intNos];
        for (int i = 0; i < intNos; i++){
            strCopy[i] = strText;
        }
        totalNoOfCopy += intNos;
        return strCopy;
    }

    public int getTotalNoOfCopy(){
        return totalNoOfCopy;
    }
}
