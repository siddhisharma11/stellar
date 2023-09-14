let names=['Aplha','Beta','Delta','Collide'];

function validateForm() {

    const name=document.getElementById('name');
    names.forEach((item)=>{
        if(item==name.value){
            alert('Room Name already exits');
            name.reset();
            return false;
        }
    })

    const checkboxes = document.querySelectorAll('input[type="checkbox"][name="amenities"]:checked');
    if (checkboxes.length < 2) {
        alert('Please select at least 2 amenities.');
        return false;
    }
    else{
        window.location.assign('admin.html');
        document.getElementById("meetingRoomForm").reset();
        alert('Room created Successfully');
    }


   
}

function cancelForm() {
    document.getElementById("meetingRoomForm").reset();
}