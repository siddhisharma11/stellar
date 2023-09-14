

fetch('https://dummyjson.com/users').then(function(res){
    
    let data=res.json().then(function(res2){
        const preElement = document.createElement('pre');
        
        // Convert the JSON data to a string for display
        const jsonDataString = JSON.stringify(res2, null, 2);
        
        // Set the content of the <pre> element to the JSON data string
        preElement.textContent = jsonDataString;

        // Append the <pre> element to the body of the HTML document
        document.body.appendChild(preElement);
    })


    
})
