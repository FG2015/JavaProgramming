package day24_CustomMethod_Return;

public class ReturnMethodPrct {
    public static void main(String[] args) {
        //find the max number between 100/200

  int max=maxNumber(100,200); //6-maxnumber beraber olur int max-a ve return sayesinde hazir 200cap olur
        System.out.println(max);

    }
 public static int maxNumber(int a,int b){ //1-intigerin 2 reeqemini a,b gosteririk
        int result=0;   //2-netice ne olacaq?
        if(a>b){
            result=a; // 3-eyer a boyukse
        }else {
            result=b;// 4-eyer b boyukse
        }
        return result; //5-neticeni geri gonder,  yeni run olan hisseye
 }




}
