public class Main {
    public static void main(String[] args) {

        //Задание 1
        byte dogAge = 3;
        short bearWeight = 220;
        int years = 38492;
        long justNumber = 999999999999L;
        float pi = 3.14f;
        double longerPi = 3.1415926535897;
        boolean dogIsAdult = true;
        char randomChar = 38;
        System.out.println(randomChar);

        //Задание 2
        float firstFightWeight = 78.2f;
        float secondFightWeight = 82.7f;
        System.out.println(firstFightWeight + secondFightWeight);
        System.out.println(secondFightWeight - firstFightWeight);

        //Задание 3
        double bananaWeight = 40;
        double milkWeight = 105;
        double iceWeight = 100;
        double eggWeight = 70;
        double weightGr = 5*bananaWeight + 2*milkWeight + 2*iceWeight + 4*eggWeight;
        double weightKg = weightGr / 1000;
        System.out.println(weightGr);
        System.out.println(weightKg);

        //Задание 4
        int days250 = 7*1000/250;
        int days500 = 7*1000/500;
        int  arithmeticAverageDays = (days250 + days500)/2;
        System.out.println("Diet will take " + days250 + " days if weight loss is 250g per day");
        System.out.println("Diet will take " + days500 + " days if weight loss is 500g per day");
        System.out.println("Diet will take " + arithmeticAverageDays + " days if weight loss is average");
        //и куда запихнуть остаток деления, если про ровном количестве кг его заведомо не будет
        // при делении на половину и четверть кг?

        //Задание 5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int  krisSalary = 76230;
        int  newMashaSalary = (int) (mashaSalary * 1.1);
        int  newDenisSalary = (int) (denisSalary * 1.1);
        int  newKrisSalary = (int) (krisSalary * 1.1);
        int  difMashaYear = (newMashaSalary - mashaSalary) * 12;
        int  difDenisYear = ((newDenisSalary - denisSalary) * 12);
        int  difKrisYear = (newKrisSalary - krisSalary) * 12;
        System.out.println("Маша теперь получает " + newMashaSalary +" рублей. Годовой доход вырос на " + difMashaYear +" рублей." );
        System.out.println("Денис теперь получает " + newDenisSalary +" рублей. Годовой доход вырос на " + difDenisYear +" рублей." );
        System.out.println("Кристина теперь получает " + newKrisSalary +" рублей. Годовой доход вырос на " + difKrisYear +" рублей." );








    }
}