package chapter5;

public class ChristmasSong {

        public static void main(String[] args) {

            int day = 1;
            do {
                System.out.println("On the day of christmas");
                System.out.println("my true love sent to me");
                switch (day) {
                    case 1:
                        System.out.println("twelve drummers drumming");
                    case 2:
                        System.out.println("eleven pipers piping");
                    case 3:
                        System.out.println("ten lords a-leaping");
                    case 4:
                        System.out.println("nine ladies dancing");
                    case 5:
                        System.out.println("eight maids a-milking");
                    case 6:
                        System.out.println("seven swans a-swimming");
                    case 7:
                        System.out.println("six geese a-laying");
                    case 8:
                        System.out.println("five gold rings");
                    case 9:
                        System.out.println("four calling birds");
                    case 10:
                        System.out.println("Three French hens");
                    case 11:
                        System.out.println("Two turtle doves");
                    case 12:
                        System.out.println("And a partridge in a pear tree");
                        break;
                    default:
                        System.out.println("Enter the correct lyrics");
                        break;
                }
                day++;
                System.out.println();
                System.out.println();

            }
            while (day <= 12);


        }
    }
