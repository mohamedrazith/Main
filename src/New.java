import java.util.Stack;

public class New {

	public static void main(String[] args) {
		Stack<String> games = new Stack<String>();

		games.add("Call of Duty");
		games.add("Guitar Hero");
		games.add("Monkey Ball");
		games.add("BGMI");
		games.add("pubg or free fire");
		games.add(" saiken");
		games.add( "Naruto and Onepiece");
		games.add(" for Test purposes we add the god hand and god of war");
		games.add("we develop new tset game called subway surfes");

		System.out.println(games);

		System.out.println(games.pop());
		System.out.println(games.pop());
		System.out.println(games.peek());

		System.out.println(games);

		Stack<Character> tower = new Stack<Character>();
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		System.out.println(tower.peek());
		System.out.println(tower.pop());
		System.out.println(tower.contains('P'));
		System.out.println(tower.empty());
		System.out.println(tower.get(1));
		System.out.println(tower.size());

	}

}
