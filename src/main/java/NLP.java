import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.parser.lexparser.Options;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.Treebank;
import edu.stanford.nlp.util.Pair;
import edu.stanford.nlp.util.Triple;

public class NLP {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String treebankPath = "/home/rostunov/workspace/neuro/standfordTest/inp_Lc_Rc.csv";

        Options op = new Options();
        op.trainOptions.trainTreeFile = "/home/rostunov/workspace/neuro/standfordTest/out.txt";
        Treebank tr = op.tlpParams.diskTreebank();
        tr.loadPath(treebankPath);
        LexicalizedParser lpc = LexicalizedParser.trainFromTreebank(tr,op);

//        Properties props = new Properties();
//        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
//        StanfordCoreNLP coreNLP = new StanfordCoreNLP(props);
    }

}