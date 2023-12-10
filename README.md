# JAVA FX PONG
    Simple javaFx implementation of the game pong. with some few modifications. 

## REQUIREMENTS 
    $ JAVA-FX version 18.0.2
    $ JAVA SDK version 18 
    




    private void draw(int x, int y, int hight, int with){

        // creating obj. graphicsContext
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        // setting collor of graphicsContext pen.
        graphicsContext.setFill(Color.RED);
        
        // drawing rect.
        graphicsContext.fillRect(x,y,hight,with);
        
    }
