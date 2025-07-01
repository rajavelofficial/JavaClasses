public class ArunBio {
    String fname = "Arun" ;
    String lname = "A" ;
    int age = 21 ;
    String dob = "28-jun-2003" ;
    String doorno = "448";
    String Street = "Keela Street";
    String nativ = "Thayilpatti" ;
    String panchayat = "Sethu Ramalaingapuram";
    int pincode = 626128;
    String bloodGroup = "B Pasitive";
    String UGDegree = "B.SC Computer Science";

    public static void main(String[] args) {
        ArunBio myObj = new ArunBio();
        System.out.println("Name          : " + myObj.fname +" "+ myObj.lname );
        System.out.println("Age           : " + myObj.age);
        System.out.println("Date of Birth : " + myObj.dob);
        System.out.println("Door No       : " + myObj.doorno);
        System.out.println("Street        : " + myObj.Street);
        System.out.println("Native        : " + myObj.nativ );
        System.out.println("Panchayat     : " + myObj.panchayat);
        System.out.println("Pincode       : " + myObj.pincode);
        System.out.println("Blood Group   : " + myObj.bloodGroup);
        System.out.println("UG Degree     : " + myObj.UGDegree);

    }
}
/*
OUTPUT:
Name          : Arun A
Age           : 21
Date of Birth : 28-jun-2003
Door No       : 448
Street        : Keela Street
Native        : Thayilpatti
Panchayat     : Sethu Ramalaingapuram
Pincode       : 626128
Blood Group   : B Pasitive
UG Degree     : B.SC Computer Science
 */