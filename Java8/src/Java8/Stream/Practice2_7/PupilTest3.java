package Java8.Stream.Practice2_7;

import Java8.Stream.Practice2_6.Pupil;

import java.util.ArrayList;
import java.util.List;

public class PupilTest3 {
    public static void main(String[] args) {
        List<Java8.Stream.Practice2_6.Pupil> pupils = new ArrayList<>();
        pupils.add(new Java8.Stream.Practice2_6.Pupil("司音", 75, 1));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("白浅", 80, 0));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("荀飞盏", 95, 8));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("墨渊", 79, 0));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("夜华", 90, 0));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("霓漫天", 81, 0));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("江玉燕", 88, 0));
        pupils.add(new Java8.Stream.Practice2_6.Pupil("夏紫熏", 93, 0));
        pupils.add(new Pupil("赵清源", 97, 0));

        pupils.stream()
                .filter(pupil -> pupil.getAverageScore() >= 80 && pupil.getViolationCount() < 1)
                .map(pupil -> {
                    if (pupil.getAverageScore() > 85) {
                        pupil.setMessage(pupil.getName() + "同学您的成绩优秀，恭喜入围");
                    } else {
                        pupil.setMessage(pupil.getName() + "同学您的成绩优良，恭喜入围");
                    }

                    return pupil;
                })
                .sorted((pupil1, pupil2) -> {
                    return  pupil1.getAverageScore() - pupil2.getAverageScore();
                }).limit(3)
                .forEach(
                       pupil -> {
                           System.out.println(pupil.getMessage());
                       }
        );
    }
}
