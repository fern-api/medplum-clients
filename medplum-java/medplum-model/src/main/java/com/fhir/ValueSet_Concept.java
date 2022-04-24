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
    as = ImmutableValueSet_Concept.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Concept {
  Optional<List<ValueSet_Designation>> designation();

  Optional<List<Extension>> extension();

  Optional<code> code();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> display();

  static ImmutableValueSet_Concept.Builder builder() {
    return ImmutableValueSet_Concept.builder();
  }
}
