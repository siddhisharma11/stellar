let data=[
    {
        Name:"Aplha",
        Capacity:455,
        Rating:5,
        Meetings:67
    },
    {
        Name:"Beta",
        Capacity:255,
        Rating:4.5,
        Meetings:37
    },  {
        Name:"Delta",
        Capacity:755,
        Rating:4,
        Meetings:117
    },  {
        Name:"Fusion",
        Capacity:155,
        Rating:5,
        Meetings:7
    },
    {
        Name:"Collide",
        Capacity:155,
        Rating:5,
        Meetings:57
    },
    {
        Name:"Evolve",
        Capacity:50,
        Rating:5,
        Meetings:7
    },
    {
        Name:"Vision",
        Capacity:100,
        Rating:2,
        Meetings:10
    },
]


let meetingList=document.getElementsByClassName('meetingListContainer');
data.forEach((item)=>{
    console.log(item);
    const cardItem=document.createElement('div');
    cardItem.classList.add('meetingCard');
    
    const strong=document.createElement('strong');
    strong.innerHTML=item.Name;
    
    const infoSection=document.createElement('div');
    infoSection.classList.add('roomInfoSection');
    
    const div1=document.createElement('div');
    const div2=document.createElement('div');
    const div3=document.createElement('div');

    //creating labels and p

    const l1=document.createElement('label');
    l1.innerHTML="Capacity";
    const p1=document.createElement('p');
    p1.innerHTML=item.Capacity;

    const l2=document.createElement('label');
    l2.innerHTML="Meetings";
    const p2=document.createElement('p');
    p2.innerHTML=item.Meetings;

    const l3=document.createElement('label');
    l3.innerHTML="Rating";
    const p3=document.createElement('p');
    p3.innerHTML=item.Rating;

    div1.appendChild(l1);
    div1.appendChild(p1);

    div2.appendChild(l2);
    div2.appendChild(p2);

    div3.appendChild(l3);
    div3.appendChild(p3);

    infoSection.appendChild(div1);
    infoSection.appendChild(div2);
    infoSection.appendChild(div3);




    cardItem.appendChild(strong);
    cardItem.appendChild(infoSection);
    meetingList[0].appendChild(cardItem);

    let button=document.createElement('button');
    button.style.width='100%';
    button.style.margin='0px';
    button.style.backgroundColor='transparent';
    button.style.height='3rem';
    button.style.borderColor='rgba(255,255,255,0.5)';
    button.innerHTML='Choose';
    cardItem.appendChild(button);

})