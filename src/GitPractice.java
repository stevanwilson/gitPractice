import javax.swing.JOptionPane;
//This is a simple program for practicing git version control
public class GitPractice {

	public static void main(String[] args) {
		final String DEFAULT_NAME = "User";
		String name = "";
		
			name = JOptionPane.showInputDialog("What is your name?");
			if(name == null){
				name = DEFAULT_NAME;
			}
		
		if(name.equals("")){
			name = DEFAULT_NAME;
		}
		
		JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
	}

}
