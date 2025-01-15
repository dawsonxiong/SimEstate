# Sim Estate

## Introduction
Sim Estate is an advanced real estate simulation platform that provides accurate property valuations by considering geographical and property-specific factors. Our vision is to revolutionize the real estate market, empowering users to make informed decisions in property acquisition, construction, and investment.

## Key Features
There are **three** main simulation modes
- **Buyer**: View estimated property valuations and locational impacts for existing or user-created properties.
- **Contractor**: Build properties with specific characteristics, such as proximity to landmarks, to explore valuation impacts.
- **Government**: Add landmarks and amenities to observe their influence on property values.

## Installation
Installing and using Sim Estate is very straightforward.
1. Download the repository as a `.zip` file.
2. Unzip the `.zip` file.
3. Open a Java IDE (NetBeans is heavily recommended, though Intellij and Eclipse are both suitable).
4. Open this project and locate the Sim Estate file: `C:\...\SimEstate\SimEstate`.
5. Open `SimEstate.java`. This is the ‘main’ file of the project.
6. Run `SimEstate.java`. Enjoy!

## Usage
- **Buyer Mode**
  - From the Mode Selection Menu, select the left-most button to enter Buyer Mode
  - View the valuations and details of default properties or user-built ones:
    - Click Proximity/Information (bottom right) to see locational details
    - Check the Proximity Bonus for positive/negative locational impacts
  - Experiment with Contractor or Government modes, then revisit Buyer Mode to see how changes affect valuations

- **Contractor Mode**
  - From the Mode Selection Menu, select the center button to enter Contractor Mode
  - Here you can add to the city’s residential portfolio by building your own residences
  - The first phase of construction is destination selection
    - Choose a landmark/residence to start from, specify road length, and name the address
    - Specify its length and name the address with a road suffix (St, Rd, Ln, Dr, Blvd)
  - On the next page, fill in required fields (e.g., property type, features), which influence valuation
  - Once inputs are valid, return to the menu to view your creation or explore other modes

- **Government Mode**
  - From the Mode Selection Menu, select the right-most button to enter Government Mode.
  - Add a landmark:
    - Select the distance to an existing landmark from a drop-down menu
    - Enter a name and valid address with a road suffix, then confirm
  - Design the landmark:
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
For questions, suggestions, or feedback, please email me at dyxiong@uwaterloo.ca
