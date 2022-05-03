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
    as = ImmutableValueSet_Designation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Designation {
  Optional<List<Extension>> extension();

  Optional<String> value();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Coding> use();

  Optional<String> id();

  static ImmutableValueSet_Designation.Builder builder() {
    return ImmutableValueSet_Designation.builder();
  }
}
