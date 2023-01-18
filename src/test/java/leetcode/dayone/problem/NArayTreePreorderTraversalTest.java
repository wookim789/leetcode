package leetcode.dayone.problem;

import leetcode.dayone.datatype.Node;
import leetcode.dayone.problem.graph.tree.NArrayTreePreorderTraversal;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class NArayTreePreorderTraversalTest {

    NArrayTreePreorderTraversal arrayPreorder = new NArrayTreePreorderTraversal();

    @Test
    void getPreorderList(){
        Node given = new Node(1);


        List<Node> children2 = new ArrayList<>();
        children2.add(new Node(5));
        children2.add(new Node(6));

        List<Node> children1 = new ArrayList<>();
        children1.add(null);
        children1.add(new Node(3, children2));
        children1.add(new Node(2));
        children1.add(new Node(4));

        given.children = children1;

        List<Integer> actual = arrayPreorder.getPreorderList(given);
        List<Integer> expected = Stream.of(1,3,5,6,2,4).collect(Collectors.toList());

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

}