# QuakeTrack
## Introduction
A basic app which fetches earthquake data from the [USGS API](https://earthquake.usgs.gov/fdsnws/event/1/query), and then show them in a list.
## Features
- Fetches data from the USGS earthquake API
- Fetched data is shown in a list in the main activity
- The loading of data is done on the background thread using AsyncTaskLoaders
- Order by magnitude or most recent 
- Set minimum magnitude
- Click on a particular earthquake will directly open default browser and take you to the USGS website
