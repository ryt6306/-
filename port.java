import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class port {
    public static void main(String[] args) {
        System.out.println("[1] 世界で一番高い山はどれですか？");
        System.out.println("[2] １：K2");
        System.out.println("[3] ２：カンチェンジュンガ");
        System.out.println("[4] ３：エベレスト");
        System.out.println("[5] ４：ローツェ");
        System.out.print("[6] 答えを番号で入力し，改行を押してください。=>");
        InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
        int answer1  = 0;
        int num=1;
        String message ="間違いです。";
              num=0;
        try {
            String buf = bufferedReader1.readLine();
            answer1 = Integer.parseInt(buf);
        } catch (Exception exception) {
            answer1 = 0;
            message= "答えを番号で入力してください。";
            num=0;
        }
        if (answer1 == 3 ) {
            message ="正解です。";
            num=1;
        }
        System.out.println(message);

        if( num== 1) {
            System.out.println("[1] 次の問題です。世界で二番高い山はどれですか？");
            System.out.println("[2] １：K2");
            System.out.println("[3] ２：ローツェ");
            System.out.println("[4] ３：カンチェンジュンガ");
            System.out.println("[5] ４： マカルー ");
            System.out.print("[6] 答えを番号で入力し，改行を押してください。=>");
            InputStreamReader inputStreamReader2 = new InputStreamReader(System.in);
            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
            int answer2  = 0;
             message ="間違いです。";
            try {
                String buf = bufferedReader2.readLine();
                answer2 = Integer.parseInt(buf);
            }catch (Exception exception) {
                answer2 = 0;
                message= "答えを番号で入力してください。";
            }
                if (answer2 == 1 ) {
                    message="正解です。";
                }
                System.out.println(message); 
        
    }   
  }
}