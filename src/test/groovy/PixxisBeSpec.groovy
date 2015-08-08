import geb.spock.GebReportingSpec

/**
 * Created by glnd on 08/08/15.
 */
class PixxisBeSpec extends GebReportingSpec {
    def "can get to Pixxis home page"() {
        when:
        to PixxisHomePage

        then:
        menu.links.children().size() == 3
        menu.links.$("a", 0).attr("href") == "https://www.pixxis.be/"
        menu.links.$("a", 1).attr("href") == "https://www.pixxis.be/resume/"
        menu.links.$("a", 2).attr("href") == "https://www.pixxis.be/contact/"
    }
}
