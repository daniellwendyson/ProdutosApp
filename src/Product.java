
public class Product {
     private int id;
     private String name;
     private float price;
     private String addDate;
     private byte[] picture;
     
     public Product(int pid, String pname, float pprice, String pAddDate, byte[] pimg) {
         this.id = pid;
         this.name = pname;
         this.price = pprice;
         this.addDate = pAddDate;
         this.picture = pimg;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
     
     
     
}


