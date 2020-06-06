package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static webelements.HomePageWebElements.*;


public class HomePage extends WebAPI {



//    @FindBy(css=shopLinksWebElements) public List<WebElement> shopLinks;
    @FindBy(how = How.CSS,using = shopLinksWebElements) public List<WebElement> shopLinks;

    // Page Objects Design Pattern/Page object Model(POM)
    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS,using = searchButtonWebElement) public WebElement searchButton;
    //@FindBy(how = How.XPATH,using = artNaturalWebElement) public WebElement artNatural;
    @FindBy(css =artNaturalWebElement ) public WebElement artNatural;
    @FindBy(how = How.CSS,using = qtyWebElement) public WebElement qty;
    @FindBy(how = How.XPATH,using = selectQtyWebElement) public WebElement selectQty;
    @FindBy(how = How.ID,using = addToCartWebElement) public WebElement addToCart;
    @FindBy(how = How.ID,using = checkoutWebElement) public WebElement checkout;

    @FindBy(how=How.XPATH,using = bestSellerWebElement) public WebElement bestSeller;
    @FindBy(how = How.CSS,using = bestSellerBooksWebElement) public WebElement bestSellerBooks;
    @FindBy(how = How.LINK_TEXT, using = newReleasesWebElement) public WebElement newRelease;
    @FindBy(how = How.LINK_TEXT, using = moviesTvWebElement) public WebElement moviesTv ;
    @FindBy(how = How.XPATH, using = selectLysolWebElement) public WebElement lysol;
    @FindBy(how = How.XPATH, using = selectDisposableGlovesWebelement) public WebElement disposableGloves;
    @FindBy(how = How.LINK_TEXT, using = searchTodaysDealWebelement) public WebElement todaysDeal;
    @FindBy(how = How.LINK_TEXT, using = searchFindAGiftWebelement) public WebElement findAGift;
    @FindBy(how = How.LINK_TEXT, using = searchGiftForKidsWebelement) public WebElement giftForKids;
    @FindBy(how = How.CSS, using = accountListWebelement) public WebElement accountList;
    @FindBy(how = How.CSS, using = mainmenuWebelement) public WebElement mainmenu;
    @FindBy(how = How.LINK_TEXT, using = selectElectronicsWebelement) public WebElement electronics;
    @FindBy(how = How.LINK_TEXT, using = selectTvVideoWebelement) public WebElement tvVideo;
    @FindBy(how = How.LINK_TEXT, using = selectTelevisionsWebelement) public WebElement television;




    // Steps:1: // Enter keyword in search box
    public  void enterKeyWord(String keyword){
        // Enter keyword in search box
        searchBox.sendKeys(keyword);
    }
    // Steps:2:
    public void clickSearchButton(){
        // Click searchButton
        searchButton.click();
    }

    // Steps:3:
    public void clickProduct(){
        // Click Product
        artNatural.click();
    }

    // Steps:4:
    public void clickQty(){
        // Click Quantity
        qty.click();
    }

    // Steps:5:
    public void doSelectQty(){
        // Select Quantity
        selectQty.click();
    }
    // Steps:6:
    public void clickAddToCart(){
        // Click Add to Cart
        addToCart.click();
    }

    // Steps:7:
    public void clickCheckout(){
        // Click Checkout
        checkout.click();
    }


    public void searchProduct() throws InterruptedException {
       // setUp("windows","chrome","https://www.amazon.com/");
        enterKeyWord("I Phone 11 pro");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }

    public void bestSellerProduct(){
        bestSeller.click();
    }

    public void checkBestSellerBooks() throws InterruptedException {
        getWindowsMaximize();
        bestSeller.click();
        sleepFor(3);
        bestSellerBooks.click();

    }
    public void newReleaseMoviesTv() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        newRelease.click();
        sleepFor(2);
        moviesTv.click();
        sleepFor(2);

    }
    public void productSearch() throws InterruptedException {
        getWindowsMaximize();
        enterKeyWord("disinfectant wipes");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        cleanUp();
    }
    public void selectProduct() throws InterruptedException {

        getWindowsMaximize();
        enterKeyWord("disinfectant spray");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        lysol.click();
        sleepFor(3);


    }
    public void ProductAddedToCart() throws InterruptedException {

        getWindowsMaximize();
        enterKeyWord("hand gloves disposable");
        sleepFor(3);
        clickSearchButton();
        sleepFor(3);
        disposableGloves.click();
        sleepFor(3);
        clickAddToCart();

    }
    public void AmazonTodaysDeal() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        todaysDeal.click();
        sleepFor(3);
    }
    public void AmazonGiftForKids() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        findAGift.click();
        sleepFor(2);
        giftForKids.click();
    }
    public void AmazonAccountLists() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(3);
        mouseHoverByCSS("#nav-link-accountList");
        sleepFor(5);

    }
    public void TryPrimeMouseHover() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        mouseHoverByXpath("//*[@id=\"nav-link-prime\"]");
        sleepFor(3);

    }
    public void AmazonAlldeptDropDown() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(5);
        dropDown("#searchDropdownBox","Appliances");
        sleepFor(2);
    }
    public void DropDownAmazonDept() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        dropDownXpath("//*[@id=\"searchDropdownBox\"]","Electronics");
        sleepFor(2);
    }
    public void amazonMainMenu() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        mainmenu.click();
        sleepFor(2);
    }
    public void amazonProductMenu() throws InterruptedException {
       amazonMainMenu();
//        getWindowsMaximize();
//        sleepFor(2);
//        mainmenu.click();
//        sleepFor(2);
       electronics.click();
       sleepFor(2);

    }
    public void mainMenuProducts() throws InterruptedException {
        amazonProductMenu();
        tvVideo.click();
        television.click();

    }





    public void validateSearchProduct(){

}










}
