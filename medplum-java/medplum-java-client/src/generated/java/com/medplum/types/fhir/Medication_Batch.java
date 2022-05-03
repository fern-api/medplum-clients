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
    as = ImmutableMedication_Batch.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication_Batch {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> lotNumber();

  Optional<DateTime> expirationDate();

  Optional<String> id();

  static ImmutableMedication_Batch.Builder builder() {
    return ImmutableMedication_Batch.builder();
  }
}
