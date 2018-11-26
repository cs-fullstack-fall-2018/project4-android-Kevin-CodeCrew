package com.the3wcircus.familycooks;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Date;
import java.util.LinkedList;


public class RecipeListActivity extends AppCompatActivity {
    private final LinkedList<RecipeItem> recipeList = new LinkedList<>();

    private RecyclerView mRecyclerView;

    private RecipeListAdapter mAdapter;

    private LinearLayoutManager mLayoutManager;
    LinkedList<RecipeItem> recipes = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mAdapter = new RecipeListAdapter();

        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mAdapter);
    }

    // Get Recipes
    private LinkedList<RecipeItem> getRecipes() {

        recipes.add(new RecipeItem("Worlds Greatest Chicken Fried Steak", "Chicken Fried Steak", "recipe1",
                "Cubed Steak, Flour, Salt and Pepper", "Cook in a frying pan", null));

        return recipes;
    }


    // Inner class to hold an individual Recipe Item
    class RecipeItem {
        String title, subtitle, imageName, ingredients, instructions;
        Date creationDate;

        public RecipeItem(String title, String subtitle, String imageName, String ingredients, String instructions, Date createDate) {
            this.creationDate = createDate != null ? createDate : new Date();
            this.title = title;
            this.imageName = imageName;
            this.instructions = instructions;
            this.subtitle = subtitle;
            this.ingredients = ingredients;
        }

        public String getTitle() {
            return title;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public String getImageName() {
            return imageName;
        }

        public String getIngredients() {
            return ingredients;
        }

        public String getInstructions() {
            return instructions;
        }

        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }
    }
}
