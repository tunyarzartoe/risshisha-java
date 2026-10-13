package basics.type_casting;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte 型の最大値は 127 です
        int x = 130;
        
        // 明示的な型変換（Explicit Cast）
        // 130 は byte の範囲（-128 〜 127）を超えているためオーバーフローが発生します
        byte b = (byte) x;
        
        System.out.println("元の int 値: " + x);
        System.out.println("キャスト後の byte 値: " + b);
	}

}
