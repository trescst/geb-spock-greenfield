import geb.Page

/**
 * @author Gert Leenders
 */
class PixxisHomePage extends Page {

    static url = "https://www.pixxis.be"

    static at = { title.equals("Pixxis") }

    static content = {
        menu { module MenuModule }
    }
}
