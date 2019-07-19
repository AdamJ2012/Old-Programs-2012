import javax.swing.JOptionPane;
/**
 * @author: adam_j_schachte
 * 1st and 2nd Period
 * @date: 11/17/11  (v2 Completed 1/5/12)
 * @purpose: Make a Java program that makes a random number for
 * 			 the user to guess.  Uses JOption Pane.  Version 2 goes past 2,000.
 */
public class GuessaNumber{
	static int Random=0;
	static int Flag=1;//One means false.
	static int Entry=0;
	static int WinCount=0;
	static int i=-1;//For a cheat code.
	static String Message1="I'm thinking of a number between 0 and 100.\n" +
			"What do you think it is?";
	public static void PrintRandom(){
		System.out.print(Random);
	}//end of PrintRandom method.
	public static void generator2(){
		Random=(int)(Math.random()*100);
	}//end of generator2 method.
	public static void generator3(){
		Random=(int)(Math.random()*(2*((WinCount*WinCount)+1)*100));
	}//end of generator3 method.
	public static void PlayGamev2(){//Game that is used.
		generator2();
		while ((Flag==1)&&(WinCount<=2)){
			Entry=Integer.parseInt(JOptionPane.showInputDialog(null, Message1,
					"Guess", JOptionPane.INFORMATION_MESSAGE));
			if (Entry==Random){
				Entry=Integer.parseInt(JOptionPane.showInputDialog(null,
						"Wanna play again?  If so, press 3",
						"You won!  The random number was "+Random+"!"
						, JOptionPane.INFORMATION_MESSAGE));
				WinCount++;
				if (Entry==3){
					Message1="I'm thinking of a number between 0 and 100.\n" +
					"What do you think it is?";
					generator2();
					if (WinCount==3){
						Flag=12;
					}//end of if WinCount==3 statement.
				}//end of nested if Entry==3 statement.
				else if (Entry!=3) {
					JOptionPane.showMessageDialog(null,
							"Thanks for playing!",
							"", JOptionPane.INFORMATION_MESSAGE);
					Flag=0;
				}//end of nested else statement.
			}//end of if Entry==Random statement.
			else if (Entry>Random){
				Message1="";
				if (Entry-30>Random){
					Message1=Message1+"alot ";
				}//end of nested if Entry-30>Random statement.
				Message1=Message1+"lower than "+Entry+".";
			}//end of else if Entry>Random statement.
			else if (Entry<Random){
				Message1="";
				if (Entry+30<Random){
					Message1=Message1+"alot ";
				}//end of nested if Entry+30<Random statement.
				Message1=Message1+"higher than "+Entry+".";
			}//end of else if Entry<Random statement.
		}//end of while Flag==1 loop.
		if ((WinCount>=3)&&(Flag==12)){
			Flag=1;
			Message1="";
			
			JOptionPane.showMessageDialog(null,
					"I've had enough!  If you think you're so great,\n" +
					"then I'll turn it up a notch!  AH HA HA HA HA!!!",
					"Oh Snap!", JOptionPane.WARNING_MESSAGE);
			Message1="Guess the number between 0 and "+(2*((WinCount*WinCount)+1)*100)+
			", and be quick about it.";
			generator3();
			while (Flag==1){
				Entry=Integer.parseInt(JOptionPane.showInputDialog(null, Message1,
						"You can't win.  0 to "+(2*((WinCount*WinCount)+1)*100)+"."
						, JOptionPane.WARNING_MESSAGE));
				if ((Entry==Random)||(Entry==i)){
					WinCount++;
					if (WinCount>=10){
						Message1="";
						JOptionPane.showMessageDialog(null,
								"Ok.  You beet me.  We should play again sometime.",
								"You won "+WinCount+" times.", JOptionPane.INFORMATION_MESSAGE);
						Flag=0;
					}//end of if WinCount<=10 statement.
					else {
						Entry=Integer.parseInt(JOptionPane.showInputDialog(null,
								"When you want to try again, press 3.  I won't go as easy on you.",
								"You won "+WinCount+" times.  The random number was "+Random+"!"
								, JOptionPane.INFORMATION_MESSAGE));
						if (Entry==3){
							Message1="Guess the number between 0 and "+(2*((WinCount*WinCount)+1)*100)+
							", and be quick about it.";
							generator3();
							if (WinCount==6){
								Message1="Guess the number between 0 and "+
								(2*((WinCount*WinCount)+1)*100)+".  There's no way you can beet me 10 times!";
							}//end of if WinCount==6 statement.
						}//end of nested if Entry==3 statement.
						else if (Entry!=3) {
							JOptionPane.showMessageDialog(null,
									"That was a good run.  Thanks for playing.",
									"You won "+WinCount+" times.", JOptionPane.INFORMATION_MESSAGE);
							Flag=0;
						}//end of nested else if Entry does not equal 3 statement.
					}//end of else statement.
				}//end of if Entry==Random statement.
				else if (Entry>Random){
					Message1="";
					if (Entry-10000000>Random){
						Message1=Message1+"More than 10,000,000 l";
					}//end of nested if Entry-10000000>Random statement.
					else if (Entry-1000000>Random){
						Message1=Message1+"More than 1,000,001 l";
					}//end of nested if Entry-1000000>Random statement.
					else if (Entry-100000>Random){
						Message1=Message1+"More than 100,001 l";
					}//end of nested if Entry-100000>Random statement.
					else if (Entry-10000>Random){
						Message1=Message1+"Between 100,000 and 10,001 l";
					}//end of nested if Entry-10000>Random statement.
					else if (Entry-1000>Random){
						Message1=Message1+"Between 10,000 and 1,001 l";
					}//end of nested if Entry-1000>Random statement.
					else if (Entry-100>Random){
						Message1=Message1+"Between 1,000 and 101 l";
					}//end of nested if Entry-100>Random statement.
					else if (Entry-30>Random){
						Message1=Message1+"Between 100 and 31 l";
					}//end of nested else if Entry-30>Random statement.
					else {
						Message1=Message1+"L";
					}//end of nested else statement.
					Message1=Message1+"ower than "+Entry+".";
				}//end of else if Entry>Random statement.
				else if (Entry<Random){
					Message1="";
					if (Entry+10000000<Random){
						Message1=Message1+"More than 10,000,000 h";
					}//end of nested if Entry+10000000<Random statement.
					else if (Entry+1000000<Random){
						Message1=Message1+"Between 10,000,000 and 1,000,001 h";
					}//end of nested if Entry+1000000<Random statement.
					else if (Entry+100000<Random){
						Message1=Message1+"Between 1,000,000 and 100,001 h";
					}//end of nested if Entry+100000<Random statement.
					else if (Entry+10000<Random){
						Message1=Message1+"Between 100,000 and 10,001 h";
					}//end of nested if Entry+10000<Random statement.
					else if (Entry+1000<Random){
						Message1=Message1+"Between 10,000 and 1,001 h";
					}//end of nested if Entry+1000<Random statement.
					else if (Entry+100<Random){
						Message1=Message1+"Between 1,000 and 101 h";
					}//end of nested if Entry+100<Random statement.
					else if (Entry+30<Random){
						Message1=Message1+"Between 100 and 31 h";
					}//end of nested if Entry+30<Random statement.
					else {
						Message1=Message1+"H";
					}//end of nested else statement.
					Message1=Message1+"igher^ than "+Entry+".";
				}//end of else if Entry<Random statement.
			}//end of while Flag==1 loop.
		}//end of if WinCount>=3 statement.
		System.exit(0);
	}//end of PlayGamev2 method.
	public static void main(String [] args){
		PlayGamev2();
	}//end of main.
}//end of class.