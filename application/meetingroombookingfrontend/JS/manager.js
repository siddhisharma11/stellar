let jsonData=[
    {
        "Meeting Name":"Staff Meeting",
        "Meeting Room":"Alpha",
        "Start Date":"13-09-2023",
        "Start Time":"9 AM",
        Duration:"1 hour"
    },
    {
        "Meeting Name":"Project Meeting",
        "Meeting Room":"Delta",
        "Start Date":"19-09-2023",
        "Start Time":"11 AM",
        Duration:"2 hour"
    },  {
        "Meeting Name":"Planning Meet",
        "Meeting Room":"Evolve",
        "Start Date":"12-10-2023",
        "Start Time":"2 PM",
        Duration:"2 hours"
    },  {
        "Meeting Name":"Team Meeting",
        "Meeting Room":"Vision",
        "Start Date":"20-10-2023",
        "Start Time":"10 AM",
        Duration:"1 hour"
    },
    {
        "Meeting Name":"Kickoff Meeting",
        "Meeting Room":"Alpha",
        "Start Date":"02-11-2023",
        "Start Time":"11 AM",
        Duration:"1 hour"
    }
  
]


var table = document.getElementById("scheduledMeetings");

var headerRow = table.insertRow(0);

for (var key in jsonData[0]) {
    var headerCell = headerRow.insertCell();
    headerCell.innerHTML = key;
}

for (var i = 0; i < jsonData.length; i++) {
    var dataRow = table.insertRow(i + 1);

    for (var key in jsonData[i]) {
        var cell = dataRow.insertCell();
        cell.innerHTML = jsonData[i][key];
    }
}
