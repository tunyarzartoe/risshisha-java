package oop.access_level_and_packaging;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// 2. ArrayListの宣言と生成（ジェネリクス <> を使用）
        ArrayList<String> list = new ArrayList<>();

        // --- 追加 (add) ---
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // --- 参照 (get) ---
        System.out.println("0番目の要素: " + list.get(0)); // 出力: Java

        // --- 要素数の取得 (size) ---
        System.out.println("要素数: " + list.size()); // 出力: 3

        // --- 変更 (set) ---
        list.set(1, "JavaScript"); // 1番目の Python を JavaScript に変更

        // --- 削除 (remove) ---
//        list.remove(2); // 2番目の C++ を削除

        // --- ループ処理 ---
        System.out.println("--- 要素一覧 ---");
        for (String item : list) {
            System.out.println(item);
        }
	}

}
