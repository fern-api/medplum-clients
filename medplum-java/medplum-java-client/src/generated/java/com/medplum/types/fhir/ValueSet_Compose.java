package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableValueSet_Compose.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Compose {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  List<ValueSet_Include> include();

  Optional<Boolean> inactive();

  Optional<Date> lockedDate();

  Optional<List<ValueSet_Include>> exclude();

  static ImmutableValueSet_Compose.Builder builder() {
    return ImmutableValueSet_Compose.builder();
  }
}
