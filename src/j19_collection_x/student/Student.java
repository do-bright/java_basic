package j19_collection_.student;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	private String schoolName;
	private int studentCode;
	private String name;
	private int studentYear;
	private ArrayList<String> hobby;
}
