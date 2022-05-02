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
    as = ImmutableComposition_RelatesTo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_RelatesTo {
  Optional<Identifier> targetIdentifier();

  Optional<Reference> targetReference();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> code();

  Optional<String> id();

  static ImmutableComposition_RelatesTo.Builder builder() {
    return ImmutableComposition_RelatesTo.builder();
  }
}
