        document.addEventListener("DOMContentLoaded", function () {
        const memberSearchInput = document.getElementById("memberSearch");
        const memberSearchResults = document.getElementById("memberSearchResults");
        const selectedMembers = [];

        // Dummy list of members for demonstration
        const members = [
            "John Doe",
            "Jane Smith",
            "Michael Johnson",
            "Sarah Wilson",
            "David Brown",
        ];

        // Function to update the search results
        function updateSearchResults(query) {
            const filteredMembers = members.filter((member) =>
                member.toLowerCase().includes(query.toLowerCase())
            );

            memberSearchResults.innerHTML = "";

            filteredMembers.forEach((member) => {
                const listItem = document.createElement("li");
                listItem.textContent = member;
                listItem.addEventListener("click", () => addMember(member));
                memberSearchResults.appendChild(listItem);
            });
        }

        // Function to add a member to the selected members list
        function addMember(member) {
            selectedMembers.push(" "+member);
            updateSelectedMembersList();
            memberSearchInput.value = "";
            memberSearchResults.innerHTML = "";
        }

        // Function to update the selected members list
        function updateSelectedMembersList() {
            // You can update the form or perform other actions here
            document.getElementById("demo").innerHTML = selectedMembers;
            console.log("Selected Members:", selectedMembers);
        }

    

        memberSearchInput.addEventListener("input", () => {
            const query = memberSearchInput.value.trim();
            updateSearchResults(query);
        });
    });