#Baduk

Game Rules:

2 Players: Black, White

Players take turns, Black first

Players lay one stone on an intersection per turn

Once a stone has been laid it is not picked up or moved unless captured

Pieces that are touching, along the grid form a group and act as one unit, notice this does not include diagonal

To capture a piece or group that group must be surrounded on all adjacent intersections

A piece is removed when it is captured

A move cannot be played that will return the game board to the exact same position as it was last in

A territory is the intersecting points on the grid

A territory is considered owned if a player surrounds it on all possible sides

# Winning
First-Capture: This is just that the 1st capture wins

Territories: The player with the most number of territories wins

Kill: The player that has captured the most opposing players stones wins

Territories & Kill: The player that has the highest total of territories + kills wins


# Coding strategy
1) Create the game board

~~a) Start with a 9x9 board~~

~~b) 13 x 13~~

c) 19x19

- When this board is created, at the current spacing (50) it is too large


~~2) Create bare menu for board size selection~~

- Login button
does not actually redirect to login page, just goes to board selection
- Quit button


3) Create the stones

a) Black

b) White


4) Implement valid user interaction with the board

a) Allow user click to put in colored stones, alternating colors

b) Do Not allow user to replace one color with another

c) Do Not allow user to place a color on the same territory

d) 


5) Implement Capture rules

a) when a piece is surrounded on all sides it is captured

b) Capture on edges

c) capture on corners


6) Implement First-Capture win

a) player that was captured loses


7) Implement menu for winning scenario user choices

a) First-Capture

b) Territories

c) Kill

d) Territories & Kill


8) Implement territory control

a) territory belongs to a player when surrounded on all sides by that color

b) there CAN be neutrals

c) Territories can switch with a capture


9) Implement passing

a) each color can pass at any time

b) if both players pass in a row the game is completed and totaled


10) Implement fine-grain move control

a) board cannot be returned to last position

b) 


11) Implement Territory scoring

12) Implement Kill scoring

13) Implement kill + territory scoring

14) Implement basic login (username only)

15) 
