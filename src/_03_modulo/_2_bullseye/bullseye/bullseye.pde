
void setup() {
 
  // set the size of your sketch
  size(400,400);
  
}

void draw() {
  
  /*
   * Step 1, create it manually using code! DONE!
   * Step 2, shorten program using for loop and modulo.
   */
 
  int red = #ff0000;
  int black = #000000;
  int ringDiameter = 40;
  int width = 400;
  int height = 400;
  
  for( int i = 1; i < 10; ++i ){

    if(i % 2 == 0) {
  
      fill(black);
      ellipse(200, 200, width - (ringDiameter * i), height - (ringDiameter * i));
      
    } else {
      
      fill(red);
      ellipse(200, 200, width - (ringDiameter * i), height - (ringDiameter * i));
    }
  }
  
  /*
  //First outside ring
  fill(red);
  ellipse(200, 200, width, height);
  
  //First inside ring.
  fill(black);
  ellipse(200, 200, width - ringDiameter, height - ringDiameter);
  
  //Draw the next ring.
  fill(red);
  ellipse(200, 200, width - (ringDiameter * 2), height - (ringDiameter * 2));
  
  fill(black);
  ellipse(200, 200,width - (ringDiameter * 3 ), height - (ringDiameter * 3 ));
  
  fill(red);
  ellipse(200,200,width - (ringDiameter * 4 ), height - (ringDiameter * 4 ));
  
  fill(black);
  ellipse(200,200,width - (ringDiameter * 5 ), height - (ringDiameter * 5 ));
  
  fill(red);
  ellipse(200,200,width - (ringDiameter * 6 ), height - (ringDiameter * 6 ));
  
  fill(black);
  ellipse(200,200,width - (ringDiameter * 7 ), height - (ringDiameter * 7 ));
  
  fill(red);
  ellipse(200,200,width - (ringDiameter * 8 ), height - (ringDiameter * 8 ));
  
  fill(black);
  ellipse(200,200,width - (ringDiameter * 9 ), height - (ringDiameter * 9 ));
  */
}
