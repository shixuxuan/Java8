package Java8.Stream.Practice2_3;

import java.util.ArrayList;
import java.util.List;

public class PupilTest {
    public static void main(String[] args) {
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil("司音", 75, 1));
        pupils.add(new Pupil("白浅", 80, 0));
        pupils.add(new Pupil("荀飞盏", 95, 8));
        pupils.add(new Pupil("墨渊", 79, 0));
        pupils.add(new Pupil("夜华", 90, 0));
        pupils.add(new Pupil("霓漫天", 81, 0));

        pupils.stream()
                .filter(pupil -> pupil.getAverageScore() >= 80 && pupil.getViolationCount() < 1)
                .forEach(pupil -> {System.out.println(pupil.getName());});
    }
}
