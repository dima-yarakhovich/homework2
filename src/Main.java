public class Main {
    public static void main(String[] args) {

        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = (int) (dog - 3.5);
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов равен " + boxerWeight + " кг");
        var differenceWeight = boxerOne - boxerTwo;
        System.out.println("Разница веса между двумя бойцами составляет " + differenceWeight + " кг ");
        var differenceWeight1 = boxerTwo - boxerOne;
        System.out.println("Разница веса между двумя бойцами составляет " + differenceWeight1 + " кг ");
        var differenceWeight2 =boxerTwo % boxerOne;
        System.out.println("Разница веса между двумя бойцами составляет " + differenceWeight2 + " кг ");

        var timeTotal = 640;
        var timeOne = 8;
        var quantityWorker = timeTotal / timeOne;
        System.out.println("Всего работников в компании работает "+ quantityWorker + " человек");

        quantityWorker = quantityWorker + 94;
        var timeTotal1 = timeTotal / quantityWorker;
        System.out.println("Если в компании работает " + quantityWorker + " человека, то всего " + timeTotal1 + " часа работы может быть поделено между сотрудниками ");



    }


}