
  Feature: Consulting and validating alojamientos module
    I as user, I want to search for alojamientos on Despegar webpage.

    Background: Initialize the browser
      Given The user start the navigator

    @case1
    Scenario: Verify message "No results found matching <Destination>" when entering nonexistent destination
      Given the user is looking for hotels
      When he type "transitvanian" into destination
      Then he can see an advice "No se encontraron resultados que coincidan con " "transitvanian"

    @case2
    Scenario: Verify date range greater than a week is inserted correctly
      Given the user is looking for hotels
      When he select a date range greater than a week
      Then he can see that it is inserted correctly

    @case3
    Scenario: Verify room creation and deletion
      Given the user add a room
      When he adds two rooms more and then he remove three
      Then he can see only one room

    @case4
    Scenario: Verify that minors do not enter when a room has 8 adults
      Given the user selects room section
      When he adds seven more people
      Then he can see the child selector is deactivated

    @case5
    Scenario: Verify destination field message is empty
      Given the user is looking for hotels
      When he forget insert into destination field and do click in search button
      Then he can see an advice showing the message "Ingresa una ciudad, alojamiento, atracción"

    @case6
    Scenario: Verify that 21 results appear per page
      Given the user is looking for hotels
      When he is looking for a hotel in "Cartagena"
      Then he can see "21" results appear per page