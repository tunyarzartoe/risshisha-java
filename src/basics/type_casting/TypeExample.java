package basics.type_casting;

public class TypeExample {

	public static void main(String[] args) {
		// --- 1. Primitive Type ---
        int a = 10;
        int b = a; // aの値（10）がそのままコピーされる
        b = 20;    // bを変更してもaは10のまま

        System.out.println("a: " + a); // 出力: 10
        System.out.println("b: " + b); // 出力: 20

        // --- 2. Non-Primitive Type (Array) ---
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // メモリ上の参照アドレスがコピーされる（同じ実体を指す）
        
        arr2[0] = 99; // arr2経由で要素を変更

        // arr1 の値も変わってしまう（同じ実体を参照しているため）
        System.out.println("arr1[0]: " + arr1[0]); // 出力: 99
	}

}
