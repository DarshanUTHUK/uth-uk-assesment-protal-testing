package Com.Uth_uk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation to mark a method as a keyword ( built-in or custom )
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Keyword {
    String keywordObject() default "General";
}


