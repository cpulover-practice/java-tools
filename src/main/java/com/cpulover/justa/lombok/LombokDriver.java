package com.cpulover.justa.lombok;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.extern.java.Log;

@Log // or: @Slf4j @CommonsLog @Log4j @Log4j2 @XSlf4j
public class LombokDriver {
	public static void main(String[] args) {
		log.info("Start program"); // @Log
		Person person1 = new Person("Cpulover", 20); // @AllArgsConstructor
		Person person2 = new Person(); // @Data or @NoArgsConstructor
		person1.setName("Justa"); // @Data
		person1.setAge(20); // @Data
		System.out.println(person1); // @Data

		log.severe("S.t is wrong here... JK!"); // @Log

		Address address1 = Address.builder().streetNumber(13).streetName("AAA").build(); // @Builder
		System.out.println(address1); // @ToString

		@Cleanup Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Hi " + name);

		Person personNull = null;
		checkNonNull(person1); // @NotNull
		checkNonNull(personNull); // @NotNull
	}

	public static void checkNonNull(@NonNull Person person) {
		System.out.println("Checking non-null: " + person);
	}
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Person {
	private String name;
	private int age;

}

@Builder
@ToString
class Address {
	private int streetNumber;
	private String streetName;
}
