package oop_ch2;
public class SimpleJanken
{
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    public static void main(String[] args)
    {
        // 乱数を格納するため変数
        double randomNum = 0;

        // プレイヤー1が何を出すか決める
        int Player1Hand = 0;

        // 0以上3未満の少数として乱数を得る
        randomNum = Math.random() * 3;
        if (randomNum < 1)
        {
            // randomNumが0.0以上¹未満の場合、グー
            player1Hand = STONE;

            // プレイヤー1の手を表示する
            System.out.print("グー");
        }
        else if (randomNum < 2)
        {
            // randomNumが１.0以上2.0未満の場合、チョキ
            player1Hand = SCISSORS;

            // プレイヤー1の手を表示する
            System.out.print("チョキ");
        }
        else if (randomNum < 3)
        {
            // randomNumが2.0以上3.0未満の場合、パー
            player1Hand = PAPER;

            // プレイヤー1の手を表示する
            System.out.println("パー");
        }

    }
//     プレイヤー2が何を出すか決める
    int player2Hand = 0;

//     0以上3未満の少数として乱数を得る
    randomNum = Math.random() * 3;
    if (randomNum < 1)
    {
        // randomNumが0.0以上1.0未満の場合、グー
    }
}
