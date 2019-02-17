package ru.dkrpn.pages

import geb.Page
import ru.dkrpn.modules.MenuModule

public class GebishOrgHomePage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module(MenuModule) }
    }
}
