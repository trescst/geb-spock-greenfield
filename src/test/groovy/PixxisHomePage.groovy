import geb.Page

/**
 * @author Gert Leenders
 */
class PixxisHomePage extends Page {

    static at = { title.equals("Pixxis") }

    static content = {
        menu { module MenuModule }
    }
}
