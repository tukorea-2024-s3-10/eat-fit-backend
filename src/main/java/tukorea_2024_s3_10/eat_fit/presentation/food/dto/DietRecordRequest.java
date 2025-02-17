package tukorea_2024_s3_10.eat_fit.presentation.food.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class DietRecordRequest {
    private LocalDate date; // 날짜
    private String mealType; // 식사 유형 (아침, 점심, 간식 등)
    private String foodName;
    private int mass; // 음식 질량
    private int calorie; // Kcal
    private double carbohydrate; // g
    private double sugar; // g
    private double protein; // g
    private double fat; // g
    private double saturatedFat; // g
    private double transFat; // g
    private int sodiumGoal; // mg
    private int cholesterol; // mg
}
