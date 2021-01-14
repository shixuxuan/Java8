package Java8.Stream.Practice2_5;

import java.util.ArrayList;
import java.util.List;

public class PupilTest2 {
    public static void main(String[] args) {
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil("司音", 75, 1));
        pupils.add(new Pupil("白浅", 80, 0));
        pupils.add(new Pupil("荀飞盏", 95, 8));
        pupils.add(new Pupil("墨渊", 79, 0));
        pupils.add(new Pupil("夜华", 90, 0));
        pupils.add(new Pupil("霓漫天", 81, 0));

        pupils.stream().filter(pupil -> pupil.getAverageScore() < 80).map(pupil -> {
            pupil.setMessage(pupil.getName()+"同学您未入围");
            return pupil;
        });

        pupils.stream().filter(pupil -> pupil.getAverageScore() <= 85 && pupil.getAverageScore() >= 80 && pupil.getViolationCount() == 0).map(pupil -> {
            pupil.setMessage(pupil.getName()+"同学您的成绩优良，恭喜入围");
            return pupil;
        });
//
        pupils.stream().filter(pupil -> pupil.getAverageScore() > 85 && pupil.getViolationCount() == 0).map(pupil -> {
            pupil.setMessage(pupil.getName()+"同学您的成绩优秀，恭喜入围");
            return pupil;
        });

        for (int i = 0; i < pupils.size(); i++) {
            System.out.println(pupils.get(i));
            System.out.println(pupils.get(i).getName());
            System.out.println(pupils.get(i).getMessage());
        }
        pupils.forEach(pupil -> {
            System.out.println(pupil.getMessage());
        });


    }
//public static void main(String[] args) {
//    List<Pupil> pupils = new ArrayList<>();
//    pupils.add(new Pupil("司音", 75, 1));
//    pupils.add(new Pupil("白浅", 80, 0));
//    pupils.add(new Pupil("荀飞盏", 95, 8));
//    pupils.add(new Pupil("墨渊", 79, 0));
//    pupils.add(new Pupil("夜华", 90, 0));
//    pupils.add(new Pupil("霓漫天", 81, 0));
//
//
//    pupils.stream().map(pupil -> {
//        if (pupil.getAverageScore() > 85 && pupil.getViolationCount() < 1) {
//            pupil.setMessage(pupil.getName() + "同学您的成绩优秀，恭喜入围");
//        } else if (pupil.getAverageScore() >= 80 && pupil.getViolationCount() < 1) {
//            pupil.setMessage(pupil.getName() + "同学您的成绩优良，恭喜入围");
//        } else {
//            pupil.setMessage(pupil.getName() + "同学您的未入围，再接再厉");
//        }
//
//        return pupil;
//    }).forEach(pupil -> {
//       System.out.println(pupil.getMessage());
//    });
//
////    for (int i = 0; i < pupils.size(); i++) {
////        System.out.println(pupils.get(i).getMessage());
////    }
//}
}
