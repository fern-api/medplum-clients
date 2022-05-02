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
    as = ImmutableTask_Restriction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Task_Restriction {
  Optional<List<Extension>> modifierExtension();

  Optional<PositiveInt> repetitions();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Reference>> recipient();

  static ImmutableTask_Restriction.Builder builder() {
    return ImmutableTask_Restriction.builder();
  }
}
