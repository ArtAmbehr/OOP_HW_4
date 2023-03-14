public class Program {
    public static void main(String[] args) {
        // Работаем с цифрами
        ArrayListClass<Integer> intList = new ArrayListClass<>();
        intList.add(37);
        intList.add(47);
        intList.add(27);
        intList.add(55);
        intList.add(87);
        intList.add(12);
        intList.add(51);
        intList.add(12);
        intList.add(12);
        intList.add(12);
        intList.add(88);
        intList.add(2);
        intList.printArray();
        intList.remForIdx(5);
        intList.remForIdx(5);
        intList.printArray();
        intList.removeData(12);
        intList.removeData(88);
        intList.printArray();
        System.out.println(intList.minData());
        System.out.println(intList.maxData());
        System.out.println(intList.sumData());
        System.out.println(intList.multData());
        System.out.println(intList.findIDX(87));
        System.out.println(intList.findData(874));
        
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayListClass<String> stringList = new ArrayListClass<>();
        stringList.add("Компьютер");
        stringList.add("Монитор");
        stringList.add("Мышка");
        stringList.add("Клавиатура");
        stringList.add("Колонка");
        stringList.add("Провод");
        stringList.add("Коврик");
        stringList.add("Флешка");
        stringList.add("Пульт");
        stringList.add("Планшет");
        stringList.add("Телефон");
        stringList.add("Очки");
        stringList.printArray(); // печать
        stringList.remForIdx(1);
        stringList.printArray();


    }
}