package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

   @BeforeAll
   public static void setUp(){
       System.out.println("before all");
   }

   @BeforeEach
   public void setUpEach(){
       System.out.println("before each");
   }

   @AfterAll
   public static void afterAll(){
       System.out.println("after all");
   }

   @AfterEach
   public void afterEach(){
       System.out.println("after each");
   }

    @Test
    @DisplayName("Проверка суммы 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calcul = new Calc();
        int result = calcul.summ(2,5);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }
    @Test
    @DisplayName("Проверка суммы 2")
    @Timeout(10)
    @Tag("summ")
    void summ2() {
        Calc calcul = new Calc();
        int result = calcul.summ(11,4);
        Assertions.assertEquals(15, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммы 3")
    @Tag("summ")
    void summ3(int a, int b, int expectedResult) {
        Calc calcul = new Calc();
        int result = calcul.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
    @Test
    @DisplayName("Проверка вычитания 1")
    @Timeout(10)
    void minus1() {
        Calc calcul = new Calc();
        int result = calcul.minus(8,5);
        Assertions.assertEquals(3, result, "Не совпало с ожидаемым результатом");
    }

    @Test
    @DisplayName("Проверка вычитания 2")
    @Timeout(10)
    void minus2() {
        Calc calcul = new Calc();
        int result = calcul.minus(2,5);
        Assertions.assertEquals(-3, result, "Не совпало с ожидаемым результатом");
    }

    @ParameterizedTest(name = "#{index} - Пример: {0} - {1} = {2}")
    @CsvSource({"210, 3, 207", "1, 4, -3", "0, -1, 1", "11, 11, 0"})
    @DisplayName("Проверка вычитания 3")
    void minus3(int a, int b, int expectedResult) {
        Calc calcul = new Calc();
        int result = calcul.minus(a, b);
        Assertions.assertEquals(expectedResult, result, "Не совпало с ожидаемым результатом");
    }

}