import java.util.ArrayList;

import AkPackage.InputOutput;
// import AkPackage.Node;
import AkPackage.Tree;

/**
 * akPackageTest
 */
public class akPackageTest {

    public static void main(String[] args) throws Exception {
        ArrayList<String> lines = InputOutput.takeCompleteInput(new akPackageTest());
        while (!lines.isEmpty()) {
            Tree root = Tree.createBST(InputOutput.ArrayListFromString(lines.remove(0)));
            Tree.levelorderTraversal(root);
            System.out.println();
            root = Tree.insertInToBST(root, 4);
            root = Tree.insertInToBST(root, 4);
            Tree.levelorderTraversal(root);
            System.out.println();
            Tree.inorderTraversal(root);
            System.out.println();
        }
    }
}
