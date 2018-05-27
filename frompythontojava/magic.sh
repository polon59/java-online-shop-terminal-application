find onlineshop -name '*.java' > sources.list && mkdir -p out && javac @sources.list -d out && java -cp out:resources frompythontojava.onlineshop.part3.Main
