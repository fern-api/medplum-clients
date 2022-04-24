package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableValueSet_Expansion.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Expansion {
  Optional<dateTime> timestamp();

  Optional<Integer> total();

  Optional<Integer> offset();

  Optional<List<Extension>> extension();

  Optional<List<ValueSet_Parameter>> parameter();

  Optional<String> id();

  Optional<List<ValueSet_Contains>> contains();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> identifier();

  static ImmutableValueSet_Expansion.Builder builder() {
    return ImmutableValueSet_Expansion.builder();
  }
}
