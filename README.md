# Sim Estate

## Introduction
Despite the availability of various real estate platforms, buyers and contractors often face challenges in making informed decisions due to the lack of specific factors that influence property valuations. Sim Estate aims to fill this knowledge gap by providing an unparalleled real estate simulation application that considers geographical factors and a range of characteristics to deliver accurate property valuations.
Sim Estate is an advanced and immersive real estate simulation platform that empowers users with comprehensive insights and accurate property valuations. Our vision is to revolutionize the real estate market by providing users with a data-driven approach to make informed decisions in property acquisition, construction, and investment.

## Key Features
There are **three** main simulation modes
- **Buyer**: Users can search for example properties or those they have created and view estimated valuations and locational impacts.
- **Contractor**: Users can build new properties to specific requirements and details, including distance from landmarks as well as property characteristics.
- **Government**: Users can create new landmarks and amenities in the city/world to observe their impact on property valuations.

## Installation
Installing and using Sim Estate is very straightforward.
1. Download the repository as a .zip file.
2. Unzip the .zip file.
3. Open a Java IDE (NetBeans is heavily recommended, though Intellij and Eclipse are both suitable alternatives).
4. In your IDE, open a project and locate the Sim Estate file: C:\...\SimEstate\SimEstate
5. Open the second SimEstate file, and find SimEstate.java. This is the ‘main’ file of the project.
6. Run SimEstate.java.
7. Enjoy!

## Usage
- **Buyer Mode**
  - From the Mode Selection Menu, select the left-most button to enter Buyer Mode
  - If this is your first screen, there will only be options to view the valuations and details of the default houses in the city
    - Click the Proximity/Information button in the bottom right corner of the panel to view locational information concerning the properties closest landmarks & amenities
    - To the left of the button is the Proximity Bonus, which will display as either a bonus or penalty depending on if the property’s location had a positive or negative impact on its valuation
  - After trying out the Contractor or Government modes, return to see the impacts on the valuations on the default or user built properties as the city is expanded
- **Contractor Mode**
  - From the Mode Selection Menu, select the center button to enter Contractor Mode
  - Here you can add to the city’s residential portfolio by building your own residences
  - The first phase of construction is destination selection
    - On this screen, select a landmark or other residence to start and build a road from
    - Specify its length and name the address with a road suffix (St, Rd, Ln, Dr, Blvd)
    - As long as the address is not already taken, you may proceed with the Confirm button
  - Building the Property is conducted on the follow up page to destination select
  - Building the Property is conducted on the follow up page to destination select
  - Fill in the required fields for the given build type before confirming
    - Details here will have an impact towards its valuation
  - As long as all input is deemed valid, you will be transported back to the menu where you can view your creation in the buy screen or resume with one of the other modes]
- **Government Mode**
  - From the Mode Selection Menu, select the right-most button to enter Government Mode.
  - You will be greeted with a New Landmark page, where you can add landmarks to the city (e.g. new parks, hospitals, malls)
    - Firstly, fill in the distance from your new landmark to an existing landmark (i.e. Central Park). You can select the existing landmark from a drop-down menu.
    - You will then be able to enter a name and an address, with a valid road suffix
    - If the address is not already taken, click the ‘confirm’ button to proceed
  - You will then be greeted with a page where you can design the new landmark.
    - Choose a type of landmark from the drop-down menu (i.e. school)
    - Based on the option you select, there will be unique fields to fill in.
    - Some important features that should be known include
      - **School Ranking**: the lower the number, the better. + 10 means the school is top 10 in the city, +20 being top 20, and so on.
      - **Store Affordability**: for a grocery store, the affordability of the store is rated 1-10, with 1 being not affordable and 10 being very affordable.
      - **Emergency Service Sustainability**: the sustainability efforts of the building rated from 1-10, with 1 being unsustainable and 10 being very sustainable.
      - **Park Clean Rating**: representing the cleanliness of the park, from 1-10, 1 being very dirty and 10 being very clean.
      - **Disposal Centre Pollution**: representing the pollution of the disposal centre, from 1-10, with 1 being very clean and 10 being very polluted.
      - **Bus Stop/Subway Station Busyness**: representing how busy the station usually is, from 1-10, with 1 not being busy and 10 being very busy.
    - If all inputs are valid, click the “Confirm” button to proceed.
  - Congratulations, you have successfully created a new landmark!

## Contact
For questions, suggestions, or feedback, please email myself at dyxiong@uwaterloo.ca
