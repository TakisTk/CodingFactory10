package gr.aueb.cf.ch7;

public class StrIndexOf {

    public static void main(String[] args) {

        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');  //1
        int positionOfLasto = s.lastIndexOf('o');  //11

    }
    //Μεθοδοσ που επιστρεφει την καταληξηη ενωσ αρχειου
    public static String LastIndex(String filename){
        return filename.substring(filename.lastIndexOf('.') +1);
    }
}
