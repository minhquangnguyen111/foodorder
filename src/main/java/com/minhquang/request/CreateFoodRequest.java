package com.minhquang.request;

import com.minhquang.model.Category;
import com.minhquang.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {

    private String name;
    private String description;
    private Long price;
    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarin;
    private boolean seasonal;
    private List<IngredientsItem> ingredients;

}
