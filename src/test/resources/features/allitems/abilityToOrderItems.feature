Feature: Ability to order items on page
  @tag(a-z_from_a-z)
  Scenario: choosing Name(A-Z) when the ordering is already A-Z will keep the current ordering
    Given I am on the all items page
    And The ordering is A-Z
    When I click on the ordering dropdown
    And Click Name(A-Z)
    Then The item ordering should be A-Z

  @tag(a-z_from_z-a)
  Scenario: Choosing Name(A-Z) when the ordering is not A-Z will change the ordering to A-Z
    Given I am on the all items page
    And The ordering is Z-A
    When I click on the ordering dropdown
    And Click Name(A-Z)
    Then The item ordering should be A-Z

  @tag(z-a_from_a-z)
  Scenario: Choosing Name(Z-A) when the ordering is not Z-A will change the ordering to Z-A
    Given I am on the all items page
    And The ordering is A-Z
    When I click on the ordering dropdown
    And Click Name(Z-A)
    Then The item ordering should be Z-A

  @tag(z-a_from_z-a)
  Scenario: Choosing Name(Z-A) when the ordering is Z-A will keep the current ordering
    Given I am on the all items page
    And The ordering is Z-A
    When I click on the ordering dropdown
    And Click Name(Z-A)
    Then The item ordering should be Z-A

  @tag(l-h_from_a-z)
  Scenario: Choosing Price(L-H) when the ordering is A-Z will change the ordering to Price(L-H)
    Given I am on the all items page
    And The ordering is A-Z
    When I click on the ordering dropdown
    And Click Price(L-H)
    Then The item ordering should be Price(L-H)

  @tag(l-h_from_l-h)
  Scenario: Choosing Price(L-H) when the ordering is already Price(L-H) will keep the current ordering
    Given I am on the all items page
    And The ordering is Price(L-H)
    When I click on the ordering dropdown
    And Click Price(L-H)
    Then The item ordering should be Price(L-H)

  @tag(h-l_from_a-z)
  Scenario: Choosing Price(H-L) when the ordering is A-Z will change the ordering to Price(H-L)
    Given I am on the all items page
    And The ordering is A-Z
    When I click on the ordering dropdown
    And Click Price(H-L)
    Then The item ordering should be Price(H-L)

  @tag(h-l_from_h-l)
  Scenario: Choosing Price(H-L) when the ordering is already Price(H-L) will keep the current ordering
    Given I am on the all items page
    And The ordering is Price(H-L)
    When I click on the ordering dropdown
    And Click Price(H-L)
    Then The item ordering should be Price(H-L)

