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
    as = ImmutableValueSet_Filter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Filter {
  Optional<List<Extension>> extension();

  Optional<Code> property();

  Optional<String> value();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Valueset_filterOp> op();

  static ImmutableValueSet_Filter.Builder builder() {
    return ImmutableValueSet_Filter.builder();
  }
}
