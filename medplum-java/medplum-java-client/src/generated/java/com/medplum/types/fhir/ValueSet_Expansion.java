package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<ValueSet_Parameter>> parameter();

  Optional<Uri> identifier();

  Optional<List<ValueSet_Contains>> contains();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> offset();

  Optional<Integer> total();

  Optional<DateTime> timestamp();

  static ImmutableValueSet_Expansion.Builder builder() {
    return ImmutableValueSet_Expansion.builder();
  }
}
