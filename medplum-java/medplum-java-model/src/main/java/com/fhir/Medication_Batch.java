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
    as = ImmutableMedication_Batch.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication_Batch {
  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> expirationDate();

  Optional<String> lotNumber();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableMedication_Batch.Builder builder() {
    return ImmutableMedication_Batch.builder();
  }
}
