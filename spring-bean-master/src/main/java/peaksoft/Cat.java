package peaksoft;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cat {
    @Value("Jeck")
    private String name;
    @Value("5")
    private int age;
    @Value("Black")
    private String color;

}
