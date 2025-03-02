let currentDestination;
let score = 0;


window.onload = function () {
    const params = new URLSearchParams(window.location.search);
    const inviteCode = params.get("invite");

    if (inviteCode) {
        fetch(`/user/invite/${inviteCode}`)
            .then(response => response.text())
            .then(data => alert(data)); // Display inviter’s score
    }

    fetchRandomDestination();
};


async function fetchRandomDestination() {
    try {
        const response = await fetch('/api/destination/random');
        currentDestination = await response.json();
        document.getElementById('clues').innerText = currentDestination.clues.join('\n');
        document.getElementById('guess').value = ''; // Clear the input field
        document.getElementById('result').innerText = ''; // Clear the result message
    } catch (error) {
        console.error('Error fetching destination:', error);
    }
}


async function submitGuess() {
    const guess = document.getElementById('guess').value.trim();

    if (!guess) {
        alert("Please enter a guess!");
        return;
    }

    try {
        const response = await fetch(`/api/destination/guess?destinationId=${currentDestination.id}&guess=${guess}`, {
            method: 'POST'
        });

        const result = await response.text();
        document.getElementById('result').innerText = result;

        // Update the score
        if (result.includes('Correct')) {
            score += 1;
            showConfettiAnimation();
        } else {
            if (score > 0) {
                score -= 1;
            }
            showSadAnimation();
        }

        document.getElementById('score').innerText = `Score: ${score}`;

        
        setTimeout(fetchRandomDestination, 2000);

    } catch (error) {
        console.error('Error submitting guess:', error);
    }
}


function generateInvite() {
    let username = prompt("Enter your username:");
    if (!username) return;

    fetch(`/user/register?username=${username}`, { method: "POST" })
        .then(response => response.text())
        .then(data => {
            document.getElementById("inviteLink").innerHTML = `
                <p>${data}</p>
                <button onclick="shareOnWhatsApp('${data}')">Share on WhatsApp</button>
            `;
        });
}


function shareOnWhatsApp(inviteLink) {
    const whatsappUrl = `https://api.whatsapp.com/send?text=Join me in the Globetrotter Challenge! ${inviteLink}`;
    window.open(whatsappUrl, '_blank');
}


function showConfettiAnimation() {
    const result = document.getElementById('result');
    result.innerHTML += " 🎉";
    result.style.color = "green";
}


function showSadAnimation() {
    const result = document.getElementById('result');
    result.innerHTML += " 😢";
    result.style.color = "red";
}
