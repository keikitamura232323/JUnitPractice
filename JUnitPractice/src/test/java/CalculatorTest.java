package com.example; // ← 本体（Calculator.java）と同じパッケージ名にすること！

import org.junit.jupiter.api.Test; // ← テスト用のマーク(@Test)を使うため
import static org.junit.jupiter.api.Assertions.assertEquals; // ← 答えが合ってるかチェックするため

public class CalculatorTest { // ← Calculatorをテストするクラス

    @Test // ← これはテストですよ！というマーク
    void testAdd() {
        Calculator calculator = new Calculator(); // テストするためにCalculatorを作る
        int result = calculator.add(2, 3); // 2と3を足して、答えをresultに入れる
        assertEquals(5, result); // 期待する答え5と、実際のresultを比べる
    }
}
