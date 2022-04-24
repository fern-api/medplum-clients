package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  List<ValueSet_Include> include();

  Optional<Boolean> inactive();

  Optional<List<ValueSet_Include>> exclude();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<date> lockedDate();

  Optional<List<Extension>> modifierExtension();

  static ImmutableValueSet_Compose.Builder builder() {
    return ImmutableValueSet_Compose.builder();
  }
}
