package sec01.chap02.ex14;

public class test {
    public static void main(String[] args) {
        var strBldr2 = new StringBuilder("0123456789");

        var strBldr2Out2 = strBldr2 // 범위의 문자열 지움
                .delete(3, 7);

        var test2 = strBldr2;

        String strBldr2Out1 = strBldr2 // 범위의 문자열 지움
                .delete(3, 7).toString();

        var test1 = strBldr2;



//        var strBldr2Out2 = strBldr2 // 위치의 문자열 삭제
//                .deleteCharAt(3).toString();
//
//        var strBldr2Out3 = strBldr2 // 위치에 문자열 추가
//                .insert(2, "ABC").toString();
//
//        var strBldr2Out4 = strBldr2 // 범위의 문자열을 치환
//                .replace(2, 4, "OneTwo").toString();
//
//        var strBldr2Out5 = strBldr2 // 문자열 뒤집음
//                .reverse().toString();
//
//        //  메서드 체이닝으로 한 번에
//        var strBldr2ChainOut = new StringBuilder("0123456789")
//                .delete(3, 7)
//                .deleteCharAt(3)
//                .insert(2, "ABC")
//                .replace(2, 4, "OneTwo")
//                .reverse()
//                .toString();
    }
}
