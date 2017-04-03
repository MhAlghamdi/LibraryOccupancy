# Library Occupancy
This repository contains an Android application for LibraryOccupancyApp. The application was assigned during winter 2016 as a final project in CSE 455, Software Engineering.

The application shows the current occupancy of the library using a sensor device built in Android. Also, it provides a view histogram of total occupancy over the previous 7 days, which displays the total occupancy of each day and the highest and lowest occupancy of the week.

## App screenshots and logo
![Alt text](https://github.com/MhAlghamdi/LibraryOccupancy/blob/master/LibraryOccupancyApp/app/src/main/res/drawable/library_logo.png "Optional title")
![Alt text](https://github.com/MhAlghamdi/LibraryOccupancy/blob/master/LibraryOccupancyApp/app/src/main/res/drawable/screenshots.png "Optional title")

## Recent modified files in the app
* Using [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart "title") library to display graphs.
* Created two layout files and two java classes for last seven days activity and history graph.
* Bug fixes
	* Fixed the error message that server sends for occupancy when the device is not connected.
	* Floor maps links updated.
