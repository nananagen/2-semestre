// setup canvas

const canvas = document.querySelector("canvas");
const ctx = canvas.getContext("2d");

const width = (canvas.width = window.innerWidth);
const height = (canvas.height = window.innerHeight);

// function to generate random number

function random(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

// function to generate random color

function randomRGB() {
  return `rgb(${random(0, 255)},${random(0, 255)},${random(0, 255)})`;
}

// construtores:

function Ball(x,y,velX,velY,color,size) {
  this.x = x;
  this.y = y;
  this.velX = velX;
  this.velY = velY;
  this.color = color;
  this.size = size;
}

// desenhando um cículo com canvas

Ball.prototype.draw = function () {
  ctx.beginPath();
  ctx.fillStyle = this.color;
  ctx.arc(this.x ,this.y ,this.size , 0, 2 * Math.PI);
  ctx.fill();

}

// método update:

Ball.prototype.update = function (){

  if ((this.x + this.size) >= width){
    this.velX = - this.velX;
    // muda a cor ao encontar nos cantos oposto a X
    this.color = randomRGB();
  }

  if ( (this.x - this.size) <= 0){
    this.velX = - this.velX;
  }

  if ( (this.y + this.size) >= height){
    this.velY = - this.velY;
  }

  if ( (this.y - this.size) <= 0){
    this.velY = - this.velY;
  }

  this.x = this.x + this.velX;
  this.y = this.y + this.velY;
}

// criando as bolinhas

let balls = [];

while (balls.length < 25){
  let size = random(10,29);
  let color = randomRGB();

  let ball = new Ball(
    random(size,width-size),
    random(size,height-size),
    random(-7,7),
    random(-7,7),
    color,
    size
  );

  balls.push(ball);

}

function loop() {
  ctx.fillStyle = 'rgba(0,0,0,0.25)';
  ctx.fillRect(0,0,width,height);

  balls.forEach(ball =>{
    ball.update();
    ball.draw();
  })

  requestAnimationFrame(loop);
}

loop();



