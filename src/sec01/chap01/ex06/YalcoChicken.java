package sec01.chap01.ex06;

public class YalcoChicken {
    int no;
    String name;

     YalcoChicken(int no, String name){
         this.no = no;
         this.name = name;
     }

     String intro(){
         return ("안녕하세요, %d, %s")
                 .formatted(no, name);
     }

}
