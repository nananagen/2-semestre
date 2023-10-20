const menuIcon = document.getElementById('menuIcon');
const menu = document.querySelector('.menu');

menuIcon.addEventListener('click', () => {
    menu.classList.toggle('show-menu');
});

document.addEventListener('click', (event) => {
    if (!menu.contains(event.target) && !menuIcon.contains(event.target)) {
        menu.classList.remove('show-menu');
    }
});

const cards = document.querySelectorAll('.card');

var originalImages = [
    '../../assets/images/amy1.png',
    '../../assets/images/amy2.png',
    '../../assets/images/bender2.png',
    '../../assets/images/conrad1.png',
    '../../assets/images/fry1.png',
    '../../assets/images/fry2.png',
    '../../assets/images/leela2.png',
    '../../assets/images/mom1.png',
    '../../assets/images/mom2.png',
    '../../assets/images/nibbler1.png',
    '../../assets/images/professor1.png',
    '../../assets/images/professor2.png',
    '../../assets/images/zap1.png',
    '../../assets/images/zap2.png',
    '../../assets/images/zoidberg1.png',
];

var newImages = [
    '../../assets/images/leela1.png',
    '../../assets/images/nibbler2.png',
    '../../assets/images/bender1.png',
    '../../assets/images/conrad2.png',
    '../../assets/images/zoidberg2.png',
];

cards.forEach((card, index) => {
    card.style.backgroundImage = `url(${originalImages[index]})`;
});

function shuffleCards() {
    var allImages = [...originalImages, ...newImages];

    allImages.sort(() => Math.random() - 0.5);

    cards.forEach((card, index) => {
        card.style.backgroundImage = `url(${allImages[index]})`;
        card.style.order = index;
        card.style.pointerEvents = 'auto'; 
    });
}

function startCountdown() {
    const countdownElement = document.getElementById('countdown');
    let countdown = 60;

    const intervalId = setInterval(() => {
        countdown--;
        countdownElement.textContent = countdown;

        if (countdown === 0) {
            clearInterval(intervalId);
            const numToReplace = 5; 
            for (let i = 0; i < numToReplace; i++) {
                const randomCardIndex = Math.floor(Math.random() * cards.length);
                cards[randomCardIndex].style.backgroundImage = `url(${originalImages[0]})`;
            } 
        }
    }, 1000);
}


function hideCards() {
    cards.forEach(card => {
        card.style.backgroundImage = 'none';
        card.style.pointerEvents = 'none';
    });
}

function handleClick(event) {
    const card = event.target;
    card.style.backgroundColor = 'white';
    card.removeEventListener('click', handleClick);
}

cards.forEach(card => {
    card.addEventListener('click', handleClick);
});


const contador = document.getElementsByClassName('contador')
contador.innerText;
contador.addEventListener('click', function contandoCliques() {
    console.log(`voce clicou ${contador.length} vezes`);
});

shuffleCards();
startCountdown();
