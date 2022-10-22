
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  int x=400;
  int y=400;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=8; i>0; i--)
  {
   if (i % 2 ==0) {
    
  fill(5,1,1);
   }
   else {
     fill(247,30,30);
   }
     ellipse(250,250,x,y);
  x-=50;
  y-=50;
   }
   
   
  //Use an if statement and remainder to alternate the color of your rings.
  
  

}
