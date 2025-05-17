Feature: Top Menu Functionality

  Background:
    Given Navigate to Homepage
    When The user should be able to see Tab Menu

  Scenario: TOP Menu Woman Control
    # Women Jackets
    And Hover the element
      | headMenuWomenButton       |
      | subMenuWomenTopButton     |
      | subMenuWomenJacketsButton |
    And Click to sub menu element
      | subMenuWomenJacketsButton1 |
    And The user should be able see the Text
      | subMenuText | jackets |

    #Women Hoodies & Sweatshirts
    And Hover the element
      | headMenuWomenButton   |
      | subMenuWomenTopButton |
      | headMenuHoodiesButton |
    And Click to sub menu element
      | headMenuHoodiesButton |
    And The user should be able see the Text
      | subMenuText | hoodies & sweatshirts |
  # Women Tees
    And Hover the element
      | headMenuWomenButton    |
      | subMenuWomenTopButton  |
      | subMenuWomenTeesButton |
    And Click to sub menu element
      | subMenuWomenTeesButton |
    And The user should be able see the Text
      | subMenuText | tees |
  # Women Bras
    And Hover the element
      | headMenuWomenButton   |
      | subMenuWomenTopButton |
      | headMenuHoodiesButton |
    And Click to sub menu element
      | subMenuWomenBrasButton |
    And The user should be able see the Text
      | subMenuText | bras & tanks |

  Scenario: TOP Menu Men Control
# Men Top Jackets
    And Hover the element
      | headMenuMenButton       |
      | subMenuMenTopButton     |
      | subMenuMenJacketsButton |
    And Click to sub menu element
      | subMenuMenJacketsButton |
    And The user should be able see the Text
      | subMenuText | jackets |

     #Men Top Hoodies & Sweatshirts
    And Hover the element
      | headMenuMenButton       |
      | subMenuMenTopButton     |
      | subMenuMenHoodiesButton |
    And Click to sub menu element
      | subMenuMenHoodiesButton |
    And The user should be able see the Text
      | subMenuText | hoodies & sweatshirts |

     #Men Top Tees
    And Hover the element
      | headMenuMenButton    |
      | subMenuMenTopButton  |
      | subMenuMenTeesButton |
    And Click to sub menu element
      | subMenuMenTeesButton |
    And The user should be able see the Text
      | subMenuText | tees |

     #Men Top Tees
    And Hover the element
      | headMenuMenButton     |
      | subMenuMenTopButton   |
      | subMenuMenTanksButton |
    And Click to sub menu element
      | subMenuMenTanksButton |
    And The user should be able see the Text
      | subMenuText | tanks |




    #Men Bottoms Pants
    And Hover the element
      | headMenuMenButton       |
      | subMenuMenBottomsButton |
      | subMenuMenPantsButton   |
    And Click to sub menu element
      | subMenuMenPantsButton |
    And The user should be able see the Text
      | subMenuText | pants |

    #Men Bottoms Shorts
    And Hover the element
      | headMenuMenButton       |
      | subMenuMenBottomsButton |
      | subMenuMenShortsButton  |
    And Click to sub menu element
      | subMenuMenShortsButton |
    And The user should be able see the Text
      | subMenuText | shorts |


  Scenario: TOP Menu Gear Control
# Gear Bags
    And Hover the element
      | headMenuGearButton    |
      | subMenuGearBagsButton |

    And Click to sub menu element
      | subMenuGearBagsButton |

    And The user should be able see the Text
      | subMenuText | bags |

    # Gear Fitness
    And Hover the element
      | headMenuGearButton    |
      | subMenuGearFitnessButton |

    And Click to sub menu element
      | subMenuGearFitnessButton |

    And The user should be able see the Text
      | subMenuText | fitness Equipment |

    # Gear Watches

    And Hover the element
      | headMenuGearButton    |
      | subMenuGearWatchesButton |

    And Click to sub menu element
      | subMenuGearWatchesButton |

    And The user should be able see the Text
      | subMenuText | watches |


  Scenario: TOP Menu Training Control
    # Training Download
    And Hover the element
      | headMenuTrainingButton|
      | subMenuTrainingDownloadButton|
    And Click to sub menu element
      | subMenuTrainingDownloadButton|
    And The user should be able see the Text
      | subMenuText | video download |


  Scenario: TOP Menu Sale Control
    # Sale
    And Click to sub menu element
      | headMenuSaleButton|
    And The user should be able see the Text
      | subMenuText | sale |

  Scenario: TOP Menu What's New Control
    # What's New
    And Click to sub menu element
      | whatsNewButton|
    And The user should be able see the Text
      | subMenuText | what's new |
