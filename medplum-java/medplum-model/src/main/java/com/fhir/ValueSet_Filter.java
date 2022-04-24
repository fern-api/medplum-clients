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
    as = ImmutableValueSet_Filter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Filter {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> value();

  Optional<Valueset_filterOp> op();

  Optional<code> property();

  static ImmutableValueSet_Filter.Builder builder() {
    return ImmutableValueSet_Filter.builder();
  }
}
