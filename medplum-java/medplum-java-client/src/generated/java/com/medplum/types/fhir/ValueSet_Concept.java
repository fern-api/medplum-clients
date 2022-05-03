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
    as = ImmutableValueSet_Concept.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Concept {
  Optional<Code> code();

  Optional<String> display();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ValueSet_Designation>> designation();

  static ImmutableValueSet_Concept.Builder builder() {
    return ImmutableValueSet_Concept.builder();
  }
}
