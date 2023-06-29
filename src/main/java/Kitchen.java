

import lombok.Data;

import java.util.List;

@Data
public class Kitchen {
   private List<String> workingStaff;
   private FoodMenu foodMenu;

   public List<String> getWorkingStaff() {
      return workingStaff;
   }

   public void setWorkingStaff(List<String> workingStaff) {
      this.workingStaff = workingStaff;
   }

   public FoodMenu getFoodMenu() {
      return foodMenu;
   }

   public void setFoodMenu(FoodMenu foodMenu) {
      this.foodMenu = foodMenu;
   }
}
