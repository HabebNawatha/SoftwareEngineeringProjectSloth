# SoftwareEngineeringProjectSloth - Knight's Move
A software engineering project which is based of the Knight's Move challenge game with features added.

Table of Contents:  
Idea and Rules of the game  
The Game                      
Features game & code  
Images

The idea of the game: <br />A Chess board (8x8) is built , and there is only 2 pieces on the board the Knight + Queen or Knight + King (depends on the level).<br />
each player is supposed to get as many points as they can according to the rules.<br />
How to get the points: whenever you visit a not visited tile, you get a point, if the tile was already visited you lose a point, answering questions right adds 1-3 points depending on the question.<br />
The game contains 4 levels, each level has it's own rules and the Player is always represented by the Knight Piece, there is 4 types of cells (tiles) in the game:
<br />
Jump Cell : jumping the knight piece to a random place.<br />
Question Cell : a question about software engineering course pops up (there is 3 levels of difficulity for the questions).<br />
Undo Cell : removing your last 3 moves (including the points)<br />
Blocked Cell : a cell you can't get on.<br />

The Game:<br />
in each level you get 1 minute, in order to level up you need to gain atleast 15 points.<br />
In level 1 you play as a knight against a bot queen BY TURN, in the board there will be 3 Question Cells and 3 Jump Cells.<br />
In level 2 you play as a knight against a bot queen BY TURN, in the board there will be 3 Question Cells and 3  UndoCells.<br />
In level 3 you play as a knight against a bot king, but the king moves simultaneously (at the same time) and moves faster every 10 seconds, in the board there will be 3 Question Cells, 2 JumpCells,2 UndoCell.<br />
In level 4 you play as a knight against a bot king, but the king moves simultaneously (at the same time) and moves faster every 10 seconds, in the board there will be 8 Blocked Cell.<br />
Whenever you land on a cell, another one will be created randomly on the board.<br />
In each level you're supposed to gain as much points as you can before the time runs up.<br />

Features:<br />
In Game:<br />
The movement of the queen and the king is built as an algorithm to try to find the best route to move to.<br />
The games are saved in a JSON file that the player can display in the HISTORY option.<br />
The questions can be edited (deleted, added, edited) by an admin account that we set up.<br />
There is a Score Board that shows the highest points for each player and sorted.<br />
The King and the Knight can move circulary which means they can come out of the other sides.<br />
In Code:<br />
The project is build as an OOP in Java.<br />
Different design patterns were used: MVC,Factory,Observable.<br />
The Front End in the project is built by JavaFX.<br />
Tests were built and checked in the project.<br />

![main page](https://user-images.githubusercontent.com/109216430/218097612-3bd43bc8-c27f-468f-aa3f-bd2fd1e581e2.png)
![game](https://user-images.githubusercontent.com/109216430/218097618-a9007e6c-4208-492c-a7eb-e314d7a234f4.png)
![questions](https://user-images.githubusercontent.com/109216430/218097620-4f4bb676-7c35-485a-a67a-f9223ec24227.png)
![rules](https://user-images.githubusercontent.com/109216430/218097622-ae55d8be-2a7d-49a9-9e3f-b114fc99511b.png)


