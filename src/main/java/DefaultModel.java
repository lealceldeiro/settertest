import lombok.*;

/**
 * DefaultModel
 *
 * @author Asiel Leal Celdeiro
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class DefaultModel {

    private String name;

    @Setter(AccessLevel.NONE)
    private String age;

    public void setAge(String age) {
        if(age == null||age.isEmpty()) {
            this.age="10";
        } else {
            this.age=age;
        }
    }
}