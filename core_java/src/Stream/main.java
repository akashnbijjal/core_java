package Stream;

import java.util.stream.Stream;
public class main {
public static void main(String[] args) {
	
	Stream<String>stream=Stream.of("hello","world","java");
	
	stream.filter(s->s.contains("o")).map(String::toUpperCase).forEach(System.out::print);
	
	
}
}
