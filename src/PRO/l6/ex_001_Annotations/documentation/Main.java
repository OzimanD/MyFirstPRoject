package PRO.l6.ex_001_Annotations.documentation;

import java.lang.annotation.Documented;

/**
 *
 */
public class Main {
    // Анотація @Documented - документує JavaDoc
    @Documented
    // Нам необхідно спочатку визначити тип анотації
    @interface ClassPreamble {
        String author();

        String date();

        int currentRevision() default 1;

        String lastModified() default "N/A";

        String lastModifiedBy() default "N/A";

        String[] reviewers();

    }

    // Тіло анотації містить опис елементів анотації
    @ClassPreamble(
            author = "Yevhenii",
            date = "15/08/2016",
            currentRevision = 11,
            lastModified = "15.08.2016",
            lastModifiedBy = "Yevhenii Tykhonov",
            reviewers = {"Yevhenii", "Alex", "Bob"}
    )
    public static void main(String[] args) {
    }
}

