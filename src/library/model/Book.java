package library.model;


public class Book extends Base {
    private String name;
    private Double price;
    private Integer year;
    private String authorName;


    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", authorName=" + authorName +
                ", base=" + super.toString() + '}';
    }
}
