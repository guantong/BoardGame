BoardGame
=========

java board game
For this assignment you will write a program that plays a rather simplistic Board Game. This section specifies the required functionality of the program. Only a text interface is required for this program; however, more marks will be gained for a game that is easy to follow with clear information/error messages to the player.
The aim of your program is to simulate a simple Board Game commonly played among children, where the players take turn to roll a dice, and move their game tokens on a physical board. The winner is the one who reaches a final position on the board first. Your program will display a menu which allows the user of the program to select various options to simulate the various board game operations. As this is not a graphical program, you will show the players' "positions" by simply displaying numbers on the screen (eg. "Player David is on position 25", etc). The dice rolls will also be simulated by the program, which will update each player's position accordingly.
For this assignment, the program will only handle TWO players. It will keep track of the positions of the players until one, or both, reaches a position of 50. If a player reaches the special positions of 11, 22, 33, or 44, he will be penalised by having 5 subtracted from his current position


Option (1) starts a new Game, and asks the user to enter 2 names for the "players". A
player’s name must not be blank, but may contain spaces. If this option is chosen again after
the players have already been set up, 2 "new" players are set up (ie. with 2 new names, and
both their starting positions set to 0). Note that the new players replace the previous players –
there are only ever two players at any one time.

Option (2) simulates a dice roll operation. When this option is chosen, the computer
generates 2 random numbers between 1-6 (ie. simulating a 6-sided dice), one for each player.
It then updates both players' positions accordingly. The rules for each "round" are as follows :
 if both players reaches position 50 or more, the game is a Draw
o note that both players can reach over 50 at the same time, since for each
round, a dice is thrown for each player, before a winner is decided
 a player is considered a winner if he reaches position 50 or more, and the other player
has not reached 50
 if any player reaches the special positions 11/22/33/44, he will be penalised, by
having 5 subtracted from his current position

Option (3) displays some details on the current player's statistics.

Option (4) displays some brief instructions regarding how to play the game.

Option (5) exits the program.
