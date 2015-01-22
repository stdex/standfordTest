if [ "$OS" == "Darwin" ]; then
  scriptdir=`dirname $0`
else
  scriptpath=$(readlink -e "$0") || scriptpath=$0
  scriptdir=$(dirname "$scriptpath")
fi

echo java -mx3g -cp \"$scriptdir/*\" edu.stanford.nlp.pipeline.StanfordCoreNLP $*
java -mx3g -cp "$scriptdir/*" edu.stanford.nlp.parser.nndep.DependencyParser -trainFile /home/rostunov/workspace/neuro/standfordTest/inp_Lc_Rc.csv -devFile /home/rostunov/workspace/neuro/standfordTest/inp_Lc_Rc.csv -embedFile /home/rostunov/workspace/neuro/standfordTest/inp_Lc_Rc.csv -embeddingSize 1 -model /home/rostunov/workspace/neuro/standfordTest/nndep.model.txt.gz $*
