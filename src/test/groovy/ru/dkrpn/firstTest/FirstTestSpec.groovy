package ru.dkrpn.firstTest

import geb.spock.GebSpec
import ru.dkrpn.pages.GebishOrgHomePage
import ru.dkrpn.pages.TheBookOfGebPage

class FirstTestSpec extends GebSpec {

    def "can get to the current Book of Geb"() {
        when:
        System.out.println("run test")
        to(GebishOrgHomePage)

        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().startsWith("current")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }
}
