import java.util.ArrayList;
public class emperorsNewGrove {
public static void main(String[] args){
	ArrayList<String> emperorCast = new ArrayList<String>();
	emperorCast.add("Kuzco");
	emperorCast.add("Pacha");
	emperorCast.add("Yzma");
	emperorCast.add("Kronk");
	System.out.println("Original: "+emperorCast);
	emperorCast.set(1, "Yzma");
	emperorCast.set(2, "Chaca");
	emperorCast.set(3, "Tipo");
	emperorCast.add("Kronk");
	emperorCast.add("Bucky");
	emperorCast.add("Pacha");
	System.out.println("Modified: "+emperorCast);
}
}
