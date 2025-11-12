package com.example.demo.payloads;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class UserDto {
	private Integer id;
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 Charasters !")
	private String name;

	@Email(message = "Email should is not valid !")
	@NotEmpty(message = "Email is required")
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "Passsword must be min of 3 chars and max 10 chars")
	private String password;

	@NotEmpty(message = "About must not be blank")
	private String about;

    @JsonIgnore
    private List<PostDto> posts;
	
}
