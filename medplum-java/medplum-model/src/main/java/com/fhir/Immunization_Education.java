package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImmunization_Education.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Immunization_Education {
  Optional<uri> reference();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<dateTime> presentationDate();

  Optional<String> documentType();

  Optional<dateTime> publicationDate();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImmunization_Education.Builder builder() {
    return ImmutableImmunization_Education.builder();
  }
}
