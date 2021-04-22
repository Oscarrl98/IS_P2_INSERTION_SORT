package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.service.InsertionSortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class InsertionSortApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsertionSortApplication.class, args);
		/*String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco","Paris","Austin Texas"};
		InsertionSortService is = new InsertionSortService();
		is.sort_sub(arr);
		is.printArray(arr);*/

	}

}
