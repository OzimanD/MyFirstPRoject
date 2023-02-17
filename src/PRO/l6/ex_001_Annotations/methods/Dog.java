package PRO.l6.ex_001_Annotations.methods;

// До класу Dog додасться повна інформація про анотацію @Mammal у JavaDoc
@Mammal(color = 0xFFA844, sound = "Woof")
public class Dog {

    @HasHair
    public void hair(){

    }
}
