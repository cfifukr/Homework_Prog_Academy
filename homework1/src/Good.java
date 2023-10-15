public class Good {
     private String category;
     private String name;
     private float price;

     public Good(String category, String name, float price){
         super();
         this.category = category;
         this.name = name;
         this.price = price;
     }

     public Good(){
         super();
     }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    @Override
    public String toString() {
        return "Good{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
