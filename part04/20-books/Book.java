public class Book {
  String title;
  int pages;
  int publicationYear;

  public Book(String title, int pages, int publicationYear) {
    this.title = title;
    this.pages = pages;
    this.publicationYear = publicationYear;
  }

  public String getTitle() {
    return this.title;
  }

  public int getPages() {
    return this.pages;
  }

  public int getPublicationYear() {
    return this.publicationYear;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  @Override
  public String toString() {
    return this.title + ", " + this.pages + " pages, " + this.publicationYear;
  }

}