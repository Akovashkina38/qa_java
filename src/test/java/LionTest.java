import com.example.IFamily;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

   private String sex;
   private boolean hasMane;
   private int kittensCount;




   public LionTest (String sex, boolean hasMane, int kittensCount) {
      this.sex = sex;
      this.hasMane = hasMane;
      this.kittensCount = kittensCount;
   }

   @Parameterized.Parameters
   public static Object[][] getLionTest() {
      return new Object[][]{
              {"Самец", true, 1},
              {"Самка", false, 1},
              {"Червяк", false, 0},
      };
   }

   @Before
   public void init() {
      MockitoAnnotations.initMocks(this);
   }

   @Mock
   IFamily ifamily;

   @Test
   public void getHasMane () throws Exception {
      try {
         Lion lion = new Lion(sex, ifamily);
         Assert.assertEquals(hasMane, lion.doesHaveMane());
      } catch (Exception exception) {
         Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                 exception.getMessage());
      }
   }

   @Test
   public void getFoodTestLion () throws Exception {
      try {
         Lion lion = new Lion(sex, ifamily);
         Mockito.when(ifamily.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
         Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
      } catch (Exception exception) {
         Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                 exception.getMessage());
      }
   }

   @Test
   public void getKittensTestLion () throws Exception {
      try {
         Lion lion = new Lion(sex, ifamily);
         Mockito.when(ifamily.getKittens()).thenReturn(kittensCount);
         Assert.assertEquals(1, lion.getKittens());
      } catch (Exception exception) {
         Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                 exception.getMessage());
      }
   }
}



