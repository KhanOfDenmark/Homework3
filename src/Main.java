public class Main {
    public static void main(String[] args) {
        //Task#1
        System.out.println("***");
        byte firstByte = -128;
        short firstShort = 1023;
        int firstInt = 56432;
        long firstLong = 1_856_915_053L;
        float firstFloat = 53.2471423f;
        double firstDouble = 643.519056763277;
        System.out.println(firstByte);
        System.out.println(firstShort);
        System.out.println(firstInt);
        System.out.println(firstLong);
        System.out.println(firstFloat);
        System.out.println(firstDouble);
        System.out.println("***");

        //Task#2
        float secondFloat = 27.12f;
        long secondLong = 987_678_965_549L;
        float thirdFloat = 2.786f;
        short secondShort = 569;
        short thirdShort = -159;
        short fourthShort = 27897;
        byte secondByte = 67;
        System.out.println(secondFloat);
        System.out.println(secondLong);
        System.out.println(thirdFloat);
        System.out.println(secondShort);
        System.out.println(thirdShort);
        System.out.println(fourthShort);
        System.out.println(secondByte);
        System.out.println("***");

        //Task#3
        byte studentsLiPa = 23;
        byte studentsAnSe = 27;
        byte studentsEkAn = 30;
        short numberOfSheets = 480;
        System.out.println("На каждого ученика рассчитано "
                +(numberOfSheets/(studentsLiPa +studentsAnSe +studentsEkAn))
                +" листов бумаги");
        System.out.println("***");

        //Task#4
        byte outputPerMinute = 16 /2;
        byte twentyMinutes = 20;
        short aDay = 24 *60;
        int threeDays = 3 *aDay;
        int aMonth = 30 *aDay;
        System.out.println("За 20 минут машина произвела "+(outputPerMinute *twentyMinutes)
                +" штук бутылок");
        System.out.println("За 1 день машина произвела "+(outputPerMinute *aDay)
                +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+(outputPerMinute *threeDays)
                +" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+(outputPerMinute *aMonth)
                +" штук бутылок");
        System.out.println("***");

        //Task#5
        byte totalPaints = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte numberOfClasses = (byte)(totalPaints /(whitePaintPerClass
                +brownPaintPerClass));
        System.out.println("В школе, где "+numberOfClasses
                +" классов, нужно "+(numberOfClasses *whitePaintPerClass)
                +" банок белой краски и " +(numberOfClasses *brownPaintPerClass)
                +" банок коричневой краски");
        System.out.println("***");

        //Task#6
        short weightOfBananas = 5*80;
        short weightOfMilk = 200/100*105;
        short weightOfIceCream = 2*100;
        short weightOfEggs = 4*70;
        int totalWeight = weightOfBananas +weightOfMilk
                +weightOfIceCream +weightOfEggs;
        float totalWeightInKilograms = (float)(totalWeight /1000);
        System.out.println(totalWeight +" грамм");
        System.out.println(totalWeightInKilograms +" килограмм");
        System.out.println("***");

        //Task#7
        short needToLoss = 7*1000;
        short minimalLossPerDay = 250;
        short maximalLossPerDay = 500;
        short averageValueOfLoss = (short)((minimalLossPerDay +maximalLossPerDay) /2);
        System.out.println("При потере "+minimalLossPerDay
                +" грамм в день - потребуется "+(byte)(needToLoss /minimalLossPerDay)
                +" дней");
        System.out.println("При потере "+maximalLossPerDay
                +" грамм в день - потребуется "+(byte)(needToLoss /maximalLossPerDay)
                +" дней");
        System.out.println("При потере "+averageValueOfLoss
                +" грамм в день - потребуется "+(byte)(needToLoss /averageValueOfLoss)
                +" дней");
        System.out.println("***");

        //Task#8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        byte monthsPerYear = 12;
        float annualSalaryIncrease = 1.1f;
        System.out.println("Новая зарплата Маши составит "
                +(salaryMasha *annualSalaryIncrease) +" рублей. Разница годового дохода "
                +"после повышения составит "
                +(((salaryMasha *annualSalaryIncrease) -salaryMasha) *monthsPerYear)
                +" рублей.");
        System.out.println("Новая зарплата Дениса составит "
                +(salaryDenis *annualSalaryIncrease) +" рублей. Разница годового дохода "
                +"после повышения составит "
                +(((salaryDenis *annualSalaryIncrease) -salaryDenis) *monthsPerYear)
                +" рублей.");
        System.out.println("Новая зарплата Кристины составит "
                +(salaryChristina *annualSalaryIncrease) +" рублей."
                +" Разница годового дохода после повышения составит "
                +(((salaryChristina *annualSalaryIncrease) -salaryChristina)
                *monthsPerYear) +" рублей.");
        System.out.println("***");
    }
}