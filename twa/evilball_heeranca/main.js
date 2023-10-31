// setup canvas

const canvas = document.querySelector('canvas');
const ctx = canvas.getContext('2d');

const width = (canvas.width = window.innerWidth);
const height = (canvas.height = window.innerHeight);

// function to generate random number

function random(min, max) {
  const num = Math.floor(Math.random() * (max - min + 1)) + min;
  return num;
}

// function to generate random color

function randomRGB() {
  return `rgb(${random(0, 255)},${random(0, 255)},${random(0, 255)})`;
}

function Shape(x,y,velX,velY){ //renomear de Shape depois
  this.x = x;
  this.y = y;
  this.velX = velX;
  this.velY = velY;
  this.exists = true;
}

function Ball(x,y,velX,velY,color,size) { //novo Ball
  Shape.call(this, x,y,velX,velY);
  this.color = color;
  this.size = size;
}

Ball.prototype.draw = function() {
  ctx.beginPath();
  ctx.fillStyle = this.color;
  ctx.arc(this.x, this.y, this.size, 0, 2 * Math.PI);
  ctx.fill();
}

Ball.prototype.update = function () {
  if ((this.x + this.size) >= width) {
    this.velX = -(this.velX);
  }

  if ((this.x - this.size) <= 0) {
    this.velX = -(this.velX);
  }

  if ((this.y + this.size) >= height) {
    this.velY = -(this.velY);
  }

  if ((this.y - this.size) <= 0) {
    this.velY = -(this.velY);
  }

  this.x += this.velX;
  this.y += this.velY;
}

Ball.prototype.collisionDetect = function () {
  balls.forEach((ball,j)=>{
    if(!(this == ball)){
      const dx = this.x - ball.x;
      const dy = this.y - ball.y;
      const distance = Math.sqrt(dx**2+dy**2);
      if (distance < this.size + ball.size) {
        this.color = ball.color = randomRGB();
        this.velX *= -1;
        this.velY *= -1;
        ball.velX *= -1;
        ball.velY *= -1;
      }
      
    }
  })
}

/*
Ball.prototype.collisionDetect = function() {
  for (let j = 0; j < balls.length; j++) {
    if (!(this === balls[j])) {
      const dx = this.x - balls[j].x;
      const dy = this.y - balls[j].y;
      const distance = Math.sqrt(dx * dx + dy * dy);

      if (distance < this.size + balls[j].size) {
        balls[j].color = this.color = 'rgb(' + random(0, 255) + ',' + random(0, 255) + ',' + random(0, 255) +')';
      }
    }
  }
}
*/

let balls = [];

while (balls.length < 25) {
  let size = random (10,20);
  let ball = new Ball(
    random(0 + size, width-size),
    random(0 + size, height-size),
    random(-7,7),
    random(-7,7),
    randomRGB(),
    size
  )
    balls.push(ball);

}

//balls.forEach(ball => {ball.draw()});

function loop () {
  ctx.fillStyle = 'rgba(0,0,0,1)';
  ctx.fillRect(0, 0, width, height);

  balls.forEach(ball =>{
    ball.draw();
    ball.update();
    ball.collisionDetect();
  });

  requestAnimationFrame(loop); //chama o proximo frame de animação (looping)
}

/*
function loop() {
  ctx.fillStyle = 'rgba(0, 0, 0, 0.25)';
  ctx.fillRect(0, 0, width, height);

  for (let i = 0; i < balls.length; i++) {
    balls[i].draw();
    balls[i].update();
  }

  requestAnimationFrame(loop);
}
*/

