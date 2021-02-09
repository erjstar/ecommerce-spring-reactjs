package com.gmail.merikbest2015.ecommerce.dto.perfume;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PerfumeDtoIn {

    private Long id;
    private MultipartFile file;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String perfumeTitle;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String perfumer;

    @NotNull(message = "Fill in the input field")
    private Integer year;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String country;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String perfumeGender;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String fragranceTopNotes;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String fragranceMiddleNotes;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String fragranceBaseNotes;

    @NotNull(message = "Fill in the input field")
    private Integer price;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String volume;

    @NotBlank(message = "Fill in the input field")
    @Length(max = 255)
    private String type;
}
