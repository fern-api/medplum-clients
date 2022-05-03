package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<DateTime> publicationDate();

  Optional<List<Extension>> extension();

  Optional<Uri> reference();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> documentType();

  Optional<DateTime> presentationDate();

  static ImmutableImmunization_Education.Builder builder() {
    return ImmutableImmunization_Education.builder();
  }
}
